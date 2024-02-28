package com.moviles.model.DTO;

public record DTOCreateUser(
	String email, 
	String username, 
	String password,
	String... roles) {
	}
