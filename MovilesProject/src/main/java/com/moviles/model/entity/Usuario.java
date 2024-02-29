package com.moviles.model.entity;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@Table(name = "users")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Field("_id")
	private Long id;
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
