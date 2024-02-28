package com.moviles.service;

import com.moviles.model.DTO.DTOUsuario;

import jakarta.servlet.http.HttpServletResponse;

public interface UserService {
	public boolean createUser(DTOUsuario dto);
	public boolean delete(String username);
	public void refreshingToken(HttpServletResponse response, String authorizationHeader);
}