package com.moviles.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Procesador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private int Numeronucleos;
	private double gigaHerziosMaximos;

	public Procesador(String nombre, int numeronucleos, double gigaHerziosMaximos) {
		super();
		this.nombre = nombre;
		Numeronucleos = numeronucleos;
		this.gigaHerziosMaximos = gigaHerziosMaximos;
	}

}
