package com.equoterapia.api.controller;

import com.equoterapia.api.controller.utils.Message;
import com.equoterapia.api.dto.login.LoginInputDTO;
import com.equoterapia.api.dto.login.LoginOutputDTO;
import com.equoterapia.api.mapper.LoginMapper;
import com.equoterapia.domain.model.Usuario;
import com.equoterapia.domain.service.UsuarioService;
import com.equoterapia.utils.Feedback;
import com.equoterapia.utils.FormataData;
import com.equoterapia.utils.Log;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Login")
public class LoginController {

    @Autowired
    private UsuarioService service;

    @Autowired
    public AuthenticationManager authenticationManager;
    private final int MAX_ATTEMPTS = 3;

    @PostMapping("/logar")
    public ResponseEntity<?> enter(@RequestBody @Valid LoginInputDTO loginInputDTO, HttpServletRequest request) {
        Message message = new Message();

        // creates a log of the login request
        Log.createSimpleLog(loginInputDTO, request);

        if (service.findUsuario(loginInputDTO.getNomeUsuario())) {

            if (service.attemptsUsuario(loginInputDTO.getNomeUsuario()) < MAX_ATTEMPTS) {
                return processLogin(loginInputDTO);
            } else {
                // At this point, we know that the allowed number of attempts has been exceeded
                // check if there is a waiting date for a new login attempt
                if (service.verifyReleaseDateLogin(loginInputDTO.getNomeUsuario())) {

                    // there is a lockout date for login
                    Date releaseDate = service.getDateReleaseLogin(loginInputDTO.getNomeUsuario());

                    // check if it is still valid
                    if (releaseDate.after(new Date(System.currentTimeMillis()))) {
                        // if it is not expired yet
                        message.setMessage(Feedback.NOVA_TENTATIVA + FormataData.formatMyDate(releaseDate));
                        return new ResponseEntity<Message>(message, HttpStatus.LOCKED);
                    } else {
                        // time expired
                        service.resetAttemptsAndReleaseLogin(loginInputDTO.getNomeUsuario());
                        return processLogin(loginInputDTO);
                    }
                } else {
                    // If it doesn't exist, add the waiting time for a new login attempt for this user
                    Date releaseDate = service.releaseLogin(loginInputDTO.getNomeUsuario());
                    message.setMessage(Feedback.TENTATIVAS_ESGOTADAS + FormataData.formatMyDate(releaseDate));
                    return new ResponseEntity<Message>(message, HttpStatus.LOCKED);
                }
            }
        }
        message.setMessage(Feedback.LOGIN_INVALIDO);
        return new ResponseEntity<Message>(message, HttpStatus.NOT_ACCEPTABLE);
    }

    private ResponseEntity<?> processLogin(LoginInputDTO loginInputDTO) {
        try {
            // Verifica usuário e senha
            var usernamePassword = new UsernamePasswordAuthenticationToken(loginInputDTO.getNomeUsuario(), loginInputDTO.getSenha());
            var auth = authenticationManager.authenticate(usernamePassword);
            // check login
            if (auth.isAuthenticated()) {
                // register login
                Usuario loggedInUser = service.login((Usuario) auth.getPrincipal());
                if (loggedInUser.isStatus()) {
                    // User active
                    return new ResponseEntity<LoginOutputDTO>(LoginMapper.mapperUsuarioParaLoginOutputDTO(loggedInUser), HttpStatus.ACCEPTED);
                }
            }
        } catch (AuthenticationException e) {
            // increment attempts
            service.updateAttempts(loginInputDTO.getNomeUsuario());
        }

        return new ResponseEntity<Message>(new Message(Feedback.LOGIN_INVALIDO), HttpStatus.NOT_ACCEPTABLE);
    }


}
