
package com.moviles.model.entity;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document("roles")
public class RoleEntity {
	@Id
	private String id;

	@Field("nombreRol")
	private ERole name;

	public RoleEntity(ERole name) {
		super();
		this.name = name;
	}

}
