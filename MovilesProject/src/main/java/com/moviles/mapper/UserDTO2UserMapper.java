package com.moviles.mapper;

import com.moviles.model.DTO.DTOCreateUser;
import com.moviles.model.entity.Usuario;

public class UserDTO2UserMapper implements Mapper<DTOCreateUser, Usuario> {

	@Override
	public Usuario map(DTOCreateUser dto) {
		return new Usuario(dto.email(), dto.username(), dto.password());
	}

}
