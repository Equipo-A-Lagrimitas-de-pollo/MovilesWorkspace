package com.moviles.mapper;

import com.moviles.model.DTO.DTOUsuario;
import com.moviles.model.entity.Usuario;

public class UserDTO2UserMapper implements Mapper<DTOUsuario, Usuario> {

	@Override
	public Usuario map(DTOUsuario t) {
		return new Usuario(t.getEmail(), t.getUsername(), t.getPassword());
	}

}
