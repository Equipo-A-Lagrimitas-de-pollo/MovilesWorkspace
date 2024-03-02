package com.moviles.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.moviles.security.jwt.JwtUtils;
import com.moviles.security.jwt.filters.JwtAuthenticationFilter;
import com.moviles.security.jwt.filters.JwtAuthorizationFilter;
import com.moviles.service.impl.UserDetailsServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
@EnableMethodSecurity
public class SecurityConfig {
	private final UserDetailsServiceImpl userDetailsServiceImpl;
	private final JwtUtils jwtUtils;
	private final JwtAuthorizationFilter jwtAuthorizationFilter;

	public SecurityConfig(UserDetailsServiceImpl userDetailsServiceImpl, JwtUtils jwtUtils,
			JwtAuthorizationFilter jwtAuthorizationFilter) {
		super();
		this.userDetailsServiceImpl = userDetailsServiceImpl;
		this.jwtUtils = jwtUtils;
		this.jwtAuthorizationFilter = jwtAuthorizationFilter;
	}

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity, AuthenticationManager authenticationManager)
			throws Exception {
		// aqui vamos a poner la autenticacion de jwt
		JwtAuthenticationFilter jwtAuthenticationFilter = new JwtAuthenticationFilter(jwtUtils);
		jwtAuthenticationFilter.setAuthenticationManager(authenticationManager);
		jwtAuthenticationFilter.setFilterProcessesUrl("/login");
		// aqui el resto de la autenticacion
		DefaultSecurityFilterChain httpsec = 
				httpSecurity
				.csrf((cs) -> cs.disable())
				.authorizeHttpRequests((auth) -> {
						auth.requestMatchers("anuncio/find").permitAll();
//						auth.requestMatchers("users/helloSecured").hasAnyRole("ADMIN");
						auth.anyRequest().permitAll();//aqui estaba authenticated
						})
				.sessionManagement((sess) -> {
						sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
						})
				.addFilter(jwtAuthenticationFilter)
				.addFilterBefore(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class)
				.build();
		log.info("SecurityConfig:terminando configuracion config");
		return httpsec;
	}

	/*
	 * Este es el codificador que vamos a usar
	 */
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/*
	 * Cuando un usuario intente autenticarse en el sistema, nos dara sus
	 * credenciales (username/password) y este manager usara el USerDetailsManager
	 * para saber si hay un usuario con esas credenciales en el sistema
	 */
	@Bean
	AuthenticationManager authenticationManager(HttpSecurity httpSecurity, PasswordEncoder passwordEncoder)
			throws Exception {
		AuthenticationManager authenticationManager = httpSecurity.getSharedObject(AuthenticationManagerBuilder.class)
				.userDetailsService(userDetailsServiceImpl).passwordEncoder(passwordEncoder).and().build();
		log.debug("SecurityConfig:generando autentication manager");
		return authenticationManager;
	}
}