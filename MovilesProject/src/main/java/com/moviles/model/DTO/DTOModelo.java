package com.moviles.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DTOModelo {
	
	private Long claveModelo;
	
	private Long claveMarca;
	
	private String nombre;

	public DTOModelo(Long claveMarca, String nombre) {
		super();
		this.claveMarca = claveMarca;
		this.nombre = nombre;
	}

}