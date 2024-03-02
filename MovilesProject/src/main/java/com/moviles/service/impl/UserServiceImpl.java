package com.moviles.service.impl;

import static org.springframework.http.HttpStatus.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.moviles.mapper.UserDTO2UserMapper;
import com.moviles.model.DTO.DTOCreateUser;
import com.moviles.model.entity.ERole;
import com.moviles.model.entity.RoleEntity;
import com.moviles.model.entity.Usuario;
import com.moviles.repositories.RoleRepository;
import com.moviles.repositories.UserRepository;
import com.moviles.security.jwt.JwtUtils;
import com.moviles.service.UserService;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final RoleRepository roleRepository;
	private final UserDTO2UserMapper userDTO2UserMapper;
	private final JwtUtils jwtUtils;

	public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
			UserDTO2UserMapper userDTO2UserMapper, JwtUtils jwtUtils) {
		super();
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.userDTO2UserMapper = userDTO2UserMapper;
		this.jwtUtils = jwtUtils;
	}

	@Override
	public boolean createUser(DTOCreateUser dto) {
		Usuario user = userDTO2UserMapper.map(dto);
		if (dto.roles() != null) {
			Set<RoleEntity> roles = fillRoles(dto.roles());
			user.setRoles(roles);
		}
		if (userRepository.save(user) != null) {
			return true;
		}
		return false;
	}

	private Set<RoleEntity> fillRoles(String[] t) {
		if (ERole.validate(t)) {
			return Arrays.asList(t).stream()
					.map((rol) -> {
						ERole rolresult = ERole.getRole(rol).get();
						List<RoleEntity> byName = roleRepository.findByName(rolresult);
						RoleEntity roleEntity = byName.get(0);
						System.out.println(roleEntity.getId());
						return roleEntity;
					})
					.collect(Collectors.toSet());
		}
		return null;
	}

	@Override
	public boolean delete(String username) {
		Optional<Usuario> byUsername = userRepository.findByUsername(username);
		userRepository.delete(byUsername.get());
		// userRepository.deleteByUsername(username);
		return true;
	}

	@Override
	public void refreshingToken(HttpServletResponse response, String authorizationHeader) throws Exception {
		try {
			String refresh_token = authorizationHeader.substring("Bearer ".length());
			// Aqui tenemos este objeto que contiene el nombre del codificador hmac384 y la
			// propia secret key
			Algorithm algorithm = Algorithm.HMAC384(jwtUtils.getSignatureKey().getEncoded());
			// Aqui tenemos al verificador que va a usar este algoritmo, consturido con el
			// algoritmo anterior
			JWTVerifier verifier = JWT.require(algorithm).build();
			// obtenemos el token descodificado si cumple lo anterior
			DecodedJWT decodedJWT = verifier.verify(refresh_token);
			///////////////////////////////////////////////////////////////////////////////////////
			String username = decodedJWT.getSubject();
			Usuario user = getUserByUsername(username);
			String access_token = jwtUtils.generateAccessToken(username);
			Map<String, String> tokens = new HashMap<>();
			tokens.put("access_token", access_token);
			response.setContentType(MediaType.APPLICATION_JSON_VALUE);
			new ObjectMapper().writeValue(response.getOutputStream(), tokens);
		} catch (Exception e) {
			response.setHeader("error", e.getMessage());
			response.setStatus(FORBIDDEN.value());
			Map<String, String> error = new HashMap<>();
			error.put("error_message", e.getMessage());
			response.setContentType(MimeTypeUtils.APPLICATION_JSON_VALUE);
			new ObjectMapper().writeValue(response.getOutputStream(), error);
		}
	}

	@Override
	public Usuario getUserByUsername(String username) {
		return userRepository.findByUsername(username).get();
	}
}
