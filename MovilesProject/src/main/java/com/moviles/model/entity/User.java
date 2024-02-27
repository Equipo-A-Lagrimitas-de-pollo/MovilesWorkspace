package com.moviles.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Email(message = "no cumple el formato")
	@NotBlank(message = "no puede estar en blanco")
	@Size(max = 80, message = "email demasiado largo")
	private String email;
	@NotBlank(message = "no puede estar en blanco")
	@Size(max = 30, message = "demasiado grande tu username")
	@Column(unique = true)
	private String username;
	@NotBlank(message = "no puede estar en blanco")
	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d;,\\.]{8,}$", message = "Debe tener al menos 8 caracteres, contener al menos una mayúscula, una minúscula, un número y un símbolo entre coma, punto y coma, o punto")
	private String password;


	//@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
	//private Set<RoleEntity> roles;
	
	public User(String email, String username, String password) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
	}

}
