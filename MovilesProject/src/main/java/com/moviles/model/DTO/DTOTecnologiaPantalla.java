package com.moviles.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DTOTecnologiaPantalla {

	private Long claveTecnologiaPantalla;
	private String tipo;

	public DTOTecnologiaPantalla(String tipo) {
		super();
		this.tipo = tipo;
	}

}
