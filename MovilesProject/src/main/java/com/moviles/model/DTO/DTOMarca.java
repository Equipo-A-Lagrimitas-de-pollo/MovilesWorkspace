package com.moviles.model.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DTOMarca {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long claveMarca;
	private String nombre;

	public DTOMarca(String nombre) {
		super();
		this.nombre = nombre;
	}

}