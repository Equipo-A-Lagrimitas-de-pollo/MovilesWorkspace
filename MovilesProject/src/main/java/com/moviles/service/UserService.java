package com.moviles.service;

import com.moviles.model.DTO.DTOCreateUser;
import com.moviles.model.entity.Usuario;

import jakarta.servlet.http.HttpServletResponse;

public interface UserService{
	public boolean createUser(DTOCreateUser dto);
	public boolean delete(String username);
	public void refreshingToken(HttpServletResponse response, String authorizationHeader) throws Exception;
	public Usuario getUserByUsername(String username);
	
}
