
package com.moviles.model.entity;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Document("roles")
public class RoleEntity {
	@Id
	@Field("_id")
	private ObjectId id;
	@Enumerated(EnumType.STRING)
	@Column(unique = true)
	@Field("nombreRol")
	private ERole name;

	public RoleEntity(ERole name) {
		super();
		this.name = name;
	}

}
