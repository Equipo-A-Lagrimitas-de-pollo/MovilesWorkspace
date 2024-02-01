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
	private Long referencia;
	private String nombre;
	private int numeronucleos;
	private double gigaHerziosMaximos;
	
	public Procesador(Long referencia, String nombre, int numeronucleos, double gigaHerziosMaximos) {
		super();
		this.referencia = referencia;
		this.nombre = nombre;
		this.numeronucleos = numeronucleos;
		this.gigaHerziosMaximos = gigaHerziosMaximos;
	}



}
