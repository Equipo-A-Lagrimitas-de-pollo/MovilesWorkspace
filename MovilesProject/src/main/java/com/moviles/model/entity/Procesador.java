package com.moviles.model.entity;

import jakarta.persistence.Id;

public class Procesador {

	@Id
	private Long id;
	private String nombre;
	private int Numeronucleos;
	private double gigaHerziosMaximos;
	
}
