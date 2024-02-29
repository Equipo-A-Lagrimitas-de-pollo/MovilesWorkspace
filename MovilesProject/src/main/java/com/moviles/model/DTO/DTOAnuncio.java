package com.moviles.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DTOAnuncio {

	private Long FKUsuario;
	private Long referencia;
	private String tipoMovilVenta;
	private String estado;

}
