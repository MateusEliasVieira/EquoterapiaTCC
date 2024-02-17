package com.equoterapia.domain.service;

import com.equoterapia.api.dto.novaSenha.NovaSenhaInputDTO;
import com.equoterapia.domain.model.Usuario;

import java.util.Date;

public interface UsuarioService {

    public Usuario save(Usuario usuario);

    public Usuario saveUsuarioAfterConfirmedAccountByEmail(String token);

    public Usuario login(Usuario usuario);

    public Usuario findUsuario(Long idUsuario);

    public Boolean findUsuario(String nomeUsuario);

    public Usuario findUsuarioByNomeUsuario(String nomeUsuario);

    public int atualizarTentativas(String nomeUsuario);

    public int tentativasUsuario(String nomeUsuario);

    public Date liberarLogin(String nomeUsuario);

    public Boolean verificarDataDeLiberacaoDoLogin(String nomeUsuario);

    public Date getDataLiberacaoLogin(String nomeUsuario);

    public void resetarTentativasELiberarLogin(String nomeUsuario);

    public Usuario updatePassword(NovaSenhaInputDTO novaSenhaInputDTO);

}
