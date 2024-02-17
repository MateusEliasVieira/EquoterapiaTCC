package com.equoterapia.domain.service.impl;

import com.equoterapia.api.dto.novaSenha.NovaSenhaInputDTO;
import com.equoterapia.domain.domainException.RegrasDeNegocioException;
import com.equoterapia.domain.enums.Role;
import com.equoterapia.domain.model.Usuario;
import com.equoterapia.domain.repository.UsuarioRepository;
import com.equoterapia.domain.service.UsuarioService;
import com.equoterapia.security.jwt.JwtToken;
import com.equoterapia.utils.Feedback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    private final int MINUTOS_PARA_NOVA_TENTATIVA = 60;

    @Transactional(readOnly = false)
    @Override
    public Usuario save(Usuario usuario) {
        if (repository.findUsuarioByEmail(usuario.getEmail()) == null && repository.findUsuarioByNomeUsuario(usuario.getNomeUsuario()) == null) {
            // empty Usuario
            String firstTokenUsuario = JwtToken.generateTokenJWT(usuario);
            usuario.setToken(firstTokenUsuario);
            usuario.setStatus(false);
            usuario.setRole(Role.ROLE_USER);
            usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
            Usuario usuarioSaved = repository.save(usuario);
            if(usuarioSaved.getIdUsuario() == null){
                throw new RegrasDeNegocioException(Feedback.ERRO_SALVAR_USUARIO + usuario.getNome());
            }else{
                return usuarioSaved;
            }
        } else {
            throw new RegrasDeNegocioException(Feedback.USUARIO_EXISTE);
        }
    }

    @Transactional(readOnly = false)
    @Override
    public Usuario saveUsuarioAfterConfirmedAccountByEmail(String token) {
        Usuario usuario = repository.findUsuarioByToken(token).orElseThrow(() -> new RegrasDeNegocioException(Feedback.ERRO_CONFIRMACAO_CONTA));
        // token exist from email confirmation
        usuario.setStatus(true);
        return repository.save(usuario);
    }

    @Transactional(readOnly = false)
    @Override
    public Usuario login(Usuario usuario) {
        usuario.setToken(JwtToken.generateTokenJWT(usuario));
        usuario.setTentativasLogin(0);
        usuario.setLiberarLogin(null);
        return repository.save(usuario);
    }

    @Transactional(readOnly = true)
    @Override
    public Usuario findUsuario(Long idUsuario) {
        Optional<Usuario> UsuarioOptional = repository.findById(idUsuario);
        return UsuarioOptional.orElseThrow(() -> new RegrasDeNegocioException(Feedback.USUARIO_ID_INEXISTENTE + idUsuario));
    }

    @Transactional(readOnly = true)
    @Override
    public Boolean findUsuario(String nomeUsuario) {
        Optional<Usuario> UsuarioOptional = Optional.ofNullable(repository.findUsuarioByNomeUsuario(nomeUsuario));
        return UsuarioOptional.isPresent();
    }

    @Transactional(readOnly = false)
    @Override
    public int atualizarTentativas(String nomeUsuario) {
        int attempts = repository.attemptsUsuario(nomeUsuario) + 1;
        repository.updateAttemptsUsuario(attempts, nomeUsuario);
        return repository.attemptsUsuario(nomeUsuario);
    }

    @Transactional(readOnly = true)
    @Override
    public int tentativasUsuario(String nomeUsuario) {
        return repository.attemptsUsuario(nomeUsuario);
    }

    @Transactional(readOnly = false)
    @Override
    public Date liberarLogin(String nomeUsuario) {
        // get current date and time
        LocalDateTime now = LocalDateTime.now();
        // Add minutes
        LocalDateTime minutes = now.plusMinutes(MINUTOS_PARA_NOVA_TENTATIVA);
        // release date
        Date releaseDate = Date.from(minutes.toInstant(ZoneOffset.of("-03:00")));
        repository.updateReleaseDate(releaseDate, nomeUsuario);
        return releaseDate;
    }

    @Transactional(readOnly = true)
    @Override
    public Date getDataLiberacaoLogin(String nomeUsuario) {
        return repository.getDateReleaseLogin(nomeUsuario);
    }

    @Transactional(readOnly = true)
    @Override
    public Boolean verificarDataDeLiberacaoDoLogin(String nomeUsuario) {
        return repository.getDateReleaseLogin(nomeUsuario) != null;
    }

    @Transactional(readOnly = false)
    @Override
    public void resetarTentativasELiberarLogin(String nomeUsuario) {
        repository.resetAttemptsAndReleaseLogin(nomeUsuario);
    }

    @Transactional(readOnly = false)
    @Override
    public Usuario updatePassword(NovaSenhaInputDTO novaSenhaInputDTO) {
        Usuario usuario = repository.findUsuarioByToken(novaSenhaInputDTO.getToken()).orElseThrow(() -> new RegrasDeNegocioException(Feedback.ERRO_MUDANCA_SENHA));
        usuario.setSenha(passwordEncoder.encode(novaSenhaInputDTO.getNovaSenha()));
        return repository.save(usuario);
    }

    @Transactional(readOnly = false)
    @Override
    public Usuario findUsuarioByNomeUsuario(String nomeUsuario) {
        return repository.findUsuarioByNomeUsuario(nomeUsuario);
    }

}
