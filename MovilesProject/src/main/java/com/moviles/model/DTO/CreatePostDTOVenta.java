package com.moviles.model.DTO;

import java.sql.Date;

import com.moviles.model.entity.Movil;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class CreatePostDTOVenta {
	private int idUsuario;
	private int referencia;
	private Long tipoMovilVenta;
	private Date fecha;
	private String estado;
	private Double precio;

}
