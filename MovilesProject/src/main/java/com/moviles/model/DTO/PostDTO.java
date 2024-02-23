package com.moviles.model.DTO;

import com.moviles.model.entity.Movil;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class PostDTO {
	private int idAnuncio;
	private int idUsuario;
	private int referencia;
	private Movil tipoMovilVenta;
	private String estado;
	
}
