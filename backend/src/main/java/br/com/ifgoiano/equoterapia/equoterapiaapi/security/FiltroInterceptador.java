package br.com.ifgoiano.equoterapia.equoterapiaapi.security;

import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import br.com.ifgoiano.equoterapia.equoterapiaapi.domain.model.UsuarioModel;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FiltroInterceptador extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		Authentication authentication = null;
		
		try {
//			UsuarioModel usuario = new UsuarioModel();
//			usuario.setIdUsuario(1L);
//			usuario.setNome("Mateus");
//			
//			String token = TokenUtil.obterToken(usuario);
//			System.out.println(token);
			authentication = TokenUtil.obterAuthentication(request);
		} catch (Exception e) {
			System.out.println("Erro = " + e.getMessage());
		}

		if (authentication != null) {
			// token válido
			// Se o meu token for válido, eu passo a requisição para frente indicando que a
			// requisição esta autenticada
			SecurityContextHolder.getContext().setAuthentication(authentication);

		} else {
			// toke inválido
			response.setStatus(401);
			response.setContentType("application/json");
		}

		// Passa a requisição para a frente
		filterChain.doFilter(request, response);

	}

}
