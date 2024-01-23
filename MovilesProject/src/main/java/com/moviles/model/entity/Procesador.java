package com.moviles.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Procesador {

	@Id
	private Long id;
	private String nombre;
	private int Numeronucleos;
	private double gigaHerziosMaximos;
	
}
