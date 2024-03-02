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
	private String userName;
	private Long referencia;
	private Long referenciaMovil;
	private String fecha;
	private String estado;
	private Double precio;
	
	

}
