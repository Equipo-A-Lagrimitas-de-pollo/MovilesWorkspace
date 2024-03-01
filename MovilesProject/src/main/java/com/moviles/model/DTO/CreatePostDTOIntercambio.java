package com.moviles.model.DTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class CreatePostDTOIntercambio {
	private String userName;
	private int referencia;
	private Long referenciaMovil;
	private Date fecha;
	private String estado;
	private String estadoMinimoRequerido;
}
