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
	
	private String claveMarca;
	
	private String nombre;

	public DTOModelo(String claveMarca, String nombre) {
		super();
		this.claveMarca = claveMarca;
		this.nombre = nombre;
	}

}