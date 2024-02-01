package com.moviles.model.DTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DTOProcesador {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
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
