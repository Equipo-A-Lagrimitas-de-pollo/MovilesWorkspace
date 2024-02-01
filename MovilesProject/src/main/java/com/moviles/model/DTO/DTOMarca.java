package com.moviles.model.DTO;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DTOMarca {
	private Long claveMarca;
	private String nombre;

	public DTOMarca(String nombre) {
		super();
		this.nombre = nombre;
	}

}