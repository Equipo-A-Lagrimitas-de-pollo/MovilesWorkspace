package com.moviles.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOMovilFilter {
	private int idMarca;
	private double precioMax;
	private double precioMin;
	private int ramMax;
	private int ramMin;
	private boolean nfc;
	private int idTecnologiaPantalla;
}
