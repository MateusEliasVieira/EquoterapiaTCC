package com.equoterapia.api.controller.usuario;

import com.equoterapia.api.controller.utils.Mensagem;
import com.equoterapia.api.dto.usuario.UsuarioInputDTO;
import com.equoterapia.api.mapper.usuario.UsuarioMapper;
import com.equoterapia.domain.service.usuario.UsuarioService;
import com.equoterapia.utils.Feedback;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/salvar-novo-usuario")
    public ResponseEntity<Mensagem> salvarNovoUsuario(@RequestBody @Valid UsuarioInputDTO usuarioInputDTO){
        usuarioService.save(UsuarioMapper.converterUsuarioInputDTOEmUsuario(usuarioInputDTO));
        return new ResponseEntity<Mensagem>(new Mensagem(Feedback.USUARIO_CAD_OK),HttpStatus.CREATED);
    }

}
