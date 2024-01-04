package com.equoterapia.domain.repository;

import com.equoterapia.domain.enums.Role;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Modifying
    @Query("UPDATE Usuario u SET u.status = true WHERE u.token = :token")
    public Integer updateStatusUsuarioByToken(@Param("token") String token);

    @Query("SELECT u FROM Usuario u WHERE u.email = :email")
    public Usuario findUsuarioByEmail(@Param("email") String email);

    public UserDetails findByUsername(String Username);

    @Query("SELECT u FROM Usuario u WHERE u.nomeUsuario = :nomeUsuario")
    public Usuario findUsuarioByNomeUsuario(@Param("nomeUsuario") String nomeUsuario);

    @Query("SELECT u FROM Usuario u WHERE u.token = :token")
    public Optional<Usuario> findUsuarioByToken(@Param("token") String token);

    @Modifying
    @Query("UPDATE Usuario u SET u.attempts = :attempts WHERE u.nomeUsuario = :nomeUsuario")
    public void updateAttemptsUsuario(@Param("attempts") int attempts, @Param("nomeUsuario") String nomeUsuario);

    @Query("SELECT u.attempts FROM Usuario u WHERE u.nomeUsuario = :nomeUsuario")
    public int attemptsUsuario(@Param("nomeUsuario") String nomeUsuario);

    @Query("SELECT u.role FROM Usuario u WHERE u.nomeUsuario = :nomeUsuario")
    public Role findRoleByUsuarioname(@Param("nomeUsuario") String nomeUsuario);

    @Modifying
    @Query("UPDATE Usuario u SET u.releaseLogin = :releaseDate WHERE u.nomeUsuario = :nomeUsuario")
    public void updateReleaseDate(@Param("releaseDate") Date releaseDate, @Param("nomeUsuario") String nomeUsuario);

    @Query("SELECT u.releaseLogin FROM Usuario u WHERE u.nomeUsuario = :nomeUsuario")
    public Date getDateReleaseLogin(@Param("nomeUsuario") String nomeUsuario);

    @Modifying
    @Query("UPDATE Usuario u SET u.releaseLogin = null, u.attempts = 0 WHERE u.nomeUsuario = :nomeUsuario")
    public void resetAttemptsAndReleaseLogin(@Param("nomeUsuario") String nomeUsuario);

}
