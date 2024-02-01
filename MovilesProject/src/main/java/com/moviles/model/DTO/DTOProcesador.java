package com.moviles.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DTOProcesador {
	
	private Long claveProcesador;
	private String nombre;
	private int numeronucleos;
	private double gigaHerziosMaximos;

	public DTOProcesador(String nombre, int numeronucleos, double gigaHerziosMaximos) {
		super();
		this.nombre = nombre;
		this.numeronucleos = numeronucleos;
		this.gigaHerziosMaximos = gigaHerziosMaximos;
	}

}
