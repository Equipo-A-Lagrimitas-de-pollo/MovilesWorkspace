package com.moviles.service.impl;

import com.moviles.mapper.UserDTO2UserMapper;
import com.moviles.model.DTO.DTOUsuario;
import com.moviles.repositories.RoleRepository;
import com.moviles.repositories.UserRepository;
import com.moviles.security.jwt.JwtUtils;
import com.moviles.service.UserService;

import jakarta.servlet.http.HttpServletResponse;

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
	public boolean createUser(DTOUsuario dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void refreshingToken(HttpServletResponse response, String authorizationHeader) {
		// TODO Auto-generated method stub
		
	}

}
