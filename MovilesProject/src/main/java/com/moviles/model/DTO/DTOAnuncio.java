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

	private Long claveAnuncio;
	private Long FKUsuario;
	private Long referencia;
	private String tipoMovilVenta;
	private String estado;

	public DTOAnuncio(Long fKUsuario, Long referencia, String tipoMovilVenta, String estado) {
		super();
		FKUsuario = fKUsuario;
		this.referencia = referencia;
		this.tipoMovilVenta = tipoMovilVenta;
		this.estado = estado;
	}

}
