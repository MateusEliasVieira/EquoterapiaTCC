package com.seminfo.api.controller;

import com.seminfo.api.dto.login.LoginInputDTO;
import com.seminfo.api.dto.login.LoginInputGoogleDTO;
import com.seminfo.api.dto.login.LoginOutputDTO;
import com.seminfo.api.dto.others.Message;
import com.seminfo.api.mapper.LoginMapper;
import com.seminfo.domain.model.User;
import com.seminfo.domain.service.UserService;
import com.seminfo.utils.Feedback;
import com.seminfo.utils.FormatDate;
import com.seminfo.utils.Log;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService service;

    @Autowired
    public AuthenticationManager authenticationManager;
    private final int MAX_ATTEMPTS = 3;

    @PostMapping("/enter")
    public ResponseEntity<?> enter(@RequestBody @Valid LoginInputDTO loginInputDTO, HttpServletRequest request) {
        Message message = new Message();

        // creates a log of the login request
        Log.createSimpleLog(loginInputDTO, request);

        if (service.findUser(loginInputDTO.getUsername())) {

            if (service.attemptsUser(loginInputDTO.getUsername()) < MAX_ATTEMPTS) {
                return processLogin(loginInputDTO);
            } else {
                // At this point, we know that the allowed number of attempts has been exceeded
                // check if there is a waiting date for a new login attempt
                if (service.verifyReleaseDateLogin(loginInputDTO.getUsername())) {

                    // there is a lockout date for login
                    Date releaseDate = service.getDateReleaseLogin(loginInputDTO.getUsername());

                    // check if it is still valid
                    if (releaseDate.after(new Date(System.currentTimeMillis()))) {
                        // if it is not expired yet
                        message.setMessage(Feedback.NEW_ATTEMPT + FormatDate.formatMyDate(releaseDate));
                        return new ResponseEntity<Message>(message, HttpStatus.LOCKED);
                    } else {
                        // time expired
                        service.resetAttemptsAndReleaseLogin(loginInputDTO.getUsername());
                        return processLogin(loginInputDTO);
                    }
                } else {
                    // If it doesn't exist, add the waiting time for a new login attempt for this user
                    Date releaseDate = service.releaseLogin(loginInputDTO.getUsername());
                    message.setMessage(Feedback.EXHAUSTED_ATTEMPTS + FormatDate.formatMyDate(releaseDate));
                    return new ResponseEntity<Message>(message, HttpStatus.LOCKED);
                }
            }
        }
        message.setMessage(Feedback.INVALID_LOGIN);
        return new ResponseEntity<Message>(message, HttpStatus.NOT_ACCEPTABLE);
    }

    private ResponseEntity<?> processLogin(LoginInputDTO loginInputDTO) {
        try {
            // Verifica usuário e senha
            var usernamePassword = new UsernamePasswordAuthenticationToken(loginInputDTO.getUsername(), loginInputDTO.getPassword());
            var auth = authenticationManager.authenticate(usernamePassword);
            // check login
            if (auth.isAuthenticated()) {
                // register login
                User loggedInUser = service.login((User) auth.getPrincipal());
                if (loggedInUser.isStatus()) {
                    // User active
                    return new ResponseEntity<LoginOutputDTO>(LoginMapper.mapperUserToLoginOutputDTO(loggedInUser), HttpStatus.ACCEPTED);
                }
            }
        } catch (AuthenticationException e) {
            // increment attempts
            service.updateAttempts(loginInputDTO.getUsername());
        }

        return new ResponseEntity<Message>(new Message(Feedback.INVALID_LOGIN), HttpStatus.NOT_ACCEPTABLE);
    }

    @PostMapping("/google")
    public ResponseEntity<LoginOutputDTO> enterWithGoogle(@RequestBody @Valid LoginInputGoogleDTO loginInputGoogleDTO, HttpServletRequest request) {
        // creates a log of the login request
        Log.createGoogleLog(loginInputGoogleDTO, request);
        User user = LoginMapper.mapperLoginInputGoogleDTOToUser(loginInputGoogleDTO);
        User loggedInUser = service.loginWithGoogle(user);
        if (loggedInUser != null && loggedInUser.isStatus()) {
            // Exist email and password // status is true
            LoginOutputDTO loginOutputDTO = new LoginOutputDTO(loggedInUser.getIdUser(), loggedInUser.getToken(), loggedInUser.getRole());
            return new ResponseEntity<LoginOutputDTO>(loginOutputDTO, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<LoginOutputDTO>((LoginOutputDTO) null, HttpStatus.NO_CONTENT);
    }


}
