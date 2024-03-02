package com.moviles.mapper;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.moviles.model.DTO.DTOCreateUser;
import com.moviles.model.entity.Usuario;

public class UserDTO2UserMapper implements Mapper<DTOCreateUser, Usuario> {
	
	private PasswordEncoder encoder;

	public UserDTO2UserMapper(PasswordEncoder encoder) {
		super();
		this.encoder = encoder;
	}


	@Override
	public Usuario map(DTOCreateUser dto) {
		return new Usuario(dto.email(), dto.username(), encoder.encode(dto.password()));
	}

}
