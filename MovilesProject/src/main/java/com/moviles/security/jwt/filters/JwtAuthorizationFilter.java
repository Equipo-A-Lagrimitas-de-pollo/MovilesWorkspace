package com.moviles.security.jwt.filters;

import java.io.IOException;
import java.util.Optional;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.moviles.security.jwt.JwtUtils;
import com.moviles.service.impl.UserDetailsServiceImpl;

import io.micrometer.common.lang.NonNull;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JwtAuthorizationFilter extends OncePerRequestFilter {
	private final JwtUtils jwtUtils;
	private final UserDetailsServiceImpl userDetailsServiceImpl;

	public JwtAuthorizationFilter(JwtUtils jwtUtils, UserDetailsServiceImpl userDetailsServiceImpl) {
		super();
		this.jwtUtils = jwtUtils;
		this.userDetailsServiceImpl = userDetailsServiceImpl;
	}

	@Override
	protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response,
			@NonNull FilterChain filterChain) throws IOException, ServletException {
		System.out.println("JwtAuthorizationFilter: entrando en el filtro");
		String header = request.getHeader("Authorization");
		System.out.println("JwtAuthorizationFilter: el header " + header);
		isValidBearerHeader(header).ifPresent((head) -> {
			// si todo a bien, ya tengo el token
			if (jwtUtils.isTokenValid(head)) {
				// si eltoken es bueno obtengo todos los datos del usuario
				String username = jwtUtils.getUSerNameFromToken(head);
				UserDetails userByUsername = userDetailsServiceImpl.loadUserByUsername(username);
				// aqui obtengo el token de autenticacion de la base de datos
				UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, null,
						userByUsername.getAuthorities());
				SecurityContextHolder.getContext().setAuthentication(token);
			}
		});
		filterChain.doFilter(request, response);
	}

	private Optional<String> isValidBearerHeader(String header) {
		String prefix = "Bearer ";
		// si el header no es nuelo y comienza por "Bearer " entonces retorna el tokem
		return header != null && header.startsWith(prefix) ? Optional.of(header.substring(prefix.length()))
				: Optional.ofNullable(null);
	}
}