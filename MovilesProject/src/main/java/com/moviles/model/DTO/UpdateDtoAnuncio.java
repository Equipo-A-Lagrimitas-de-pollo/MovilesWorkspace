package com.moviles.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UpdateDtoAnuncio {
	private Long referenciaAnuncio;
	private Double precio;
}
