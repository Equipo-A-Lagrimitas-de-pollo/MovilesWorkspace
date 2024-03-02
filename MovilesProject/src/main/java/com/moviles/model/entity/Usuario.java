package com.moviles.model.entity;

import java.util.Set;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("users")
public class Usuario {
	@Id
	private ObjectId id;
	@Field("emailUsuario")
	private String email;
	@Field("nombreUsuario")
	private String username;
	@Field("contraseñaUsuario")
	private String password;

	@DBRef
	private Set<RoleEntity> roles;

	public Usuario(String email, String username, String password) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
	}

}
