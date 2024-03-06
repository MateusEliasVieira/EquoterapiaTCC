package com.equoterapia.api.controller;

import com.equoterapia.api.controller.utils.Mensagem;
import com.equoterapia.api.dto.login.LoginInputDTO;
import com.equoterapia.api.dto.login.LoginOutputDTO;
import com.equoterapia.api.mapper.LoginMapper;
import com.equoterapia.domain.model.usuario.Usuario;
import com.equoterapia.domain.service.usuario.UsuarioService;
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
@RequestMapping("/login")
@Tag(name = "Login")
public class LoginController {

    @Autowired
    private UsuarioService service;

    @Autowired
    public AuthenticationManager authenticationManager;
    private final int MAXIMO_TENTATIVAS = 3;

    @PostMapping("/logar")
    public ResponseEntity<?> enter(@RequestBody @Valid LoginInputDTO loginInputDTO, HttpServletRequest request) {
        Mensagem mensagem = new Mensagem();
        System.out.println("Usuario = "+loginInputDTO.getNomeUsuario()+", Senha = "+loginInputDTO.getSenha());
        // creates a log of the login request
        Log.createSimpleLog(loginInputDTO, request);

        if (service.findUsuario(loginInputDTO.getNomeUsuario())) {

            if (service.tentativasUsuario(loginInputDTO.getNomeUsuario()) < MAXIMO_TENTATIVAS) {
                return processarLogin(loginInputDTO);
            } else {
                // At this point, we know that the allowed number of attempts has been exceeded
                // check if there is a waiting date for a new login attempt
                if (service.verificarDataDeLiberacaoDoLogin(loginInputDTO.getNomeUsuario())) {

                    // there is a lockout date for login
                    Date dataDeLiberacao = service.getDataLiberacaoLogin(loginInputDTO.getNomeUsuario());

                    // check if it is still valid
                    if (dataDeLiberacao.after(new Date(System.currentTimeMillis()))) {
                        // if it is not expired yet
                        mensagem.setMensagem(Feedback.NOVA_TENTATIVA + FormataData.formateMinhaData(dataDeLiberacao));
                        return new ResponseEntity<Mensagem>(mensagem, HttpStatus.LOCKED);
                    } else {
                        // time expired
                        service.resetarTentativasELiberarLogin(loginInputDTO.getNomeUsuario());
                        return processarLogin(loginInputDTO);
                    }
                } else {
                    // If it doesn't exist, add the waiting time for a new login attempt for this user
                    Date dataLiberacao = service.liberarLogin(loginInputDTO.getNomeUsuario());
                    mensagem.setMensagem(Feedback.TENTATIVAS_ESGOTADAS + FormataData.formateMinhaData(dataLiberacao));
                    return new ResponseEntity<Mensagem>(mensagem, HttpStatus.LOCKED);
                }
            }
        }
        mensagem.setMensagem(Feedback.LOGIN_INVALIDO);
        return new ResponseEntity<Mensagem>(mensagem, HttpStatus.NOT_ACCEPTABLE);
    }

    private ResponseEntity<?> processarLogin(LoginInputDTO loginInputDTO) {
        try {
            // Verifica usuário e senha
            var usernamePassword = new UsernamePasswordAuthenticationToken(loginInputDTO.getNomeUsuario(), loginInputDTO.getSenha());
            var auth = authenticationManager.authenticate(usernamePassword);
            // check login
            if (auth.isAuthenticated()) {
                // register login
                Usuario usuarioLogado = service.login((Usuario) auth.getPrincipal());
                if (usuarioLogado.isStatus()) {
                    // User active
                    return new ResponseEntity<LoginOutputDTO>(LoginMapper.mapperUsuarioParaLoginOutputDTO(usuarioLogado), HttpStatus.ACCEPTED);
                }
            }
        } catch (AuthenticationException e) {
            // increment attempts
            service.atualizarTentativas(loginInputDTO.getNomeUsuario());
        }

        return new ResponseEntity<Mensagem>(new Mensagem(Feedback.LOGIN_INVALIDO), HttpStatus.NOT_ACCEPTABLE);
    }


}
