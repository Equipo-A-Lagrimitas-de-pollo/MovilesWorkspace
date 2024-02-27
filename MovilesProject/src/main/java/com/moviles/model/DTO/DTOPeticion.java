package com.moviles.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DTOPeticion {
	
	private Long referencia;
	private String tipoMovilVenta;
	private String estado;
}
