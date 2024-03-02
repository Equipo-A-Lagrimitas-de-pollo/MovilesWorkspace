package com.moviles.model.DTO;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class PostInfoDto {
	private String nombreUsuario;
	private String nombreMovil;
	private String fecha;
	private String estado;
	
	public PostInfoDto(String nombreUsuario, String nombreMovil, String fecha, String estado) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.nombreMovil = nombreMovil;
		this.fecha = fecha;
		this.estado = estado;
	}
	
	
	
}
