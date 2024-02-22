package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ordenador {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPc;

	@ManyToOne
	private Grafica grafica;
	@ManyToOne
	private Procesador procesador;
	@ManyToOne
	private Ram ram;

	private String marcaPc;
	private double precioPc;

	public Ordenador(Grafica grafica, Procesador procesador, Ram ram, String marcaPc, double precioPc) {
		super();
		this.grafica = grafica;
		this.procesador = procesador;
		this.ram = ram;
		this.marcaPc = marcaPc;
		this.precioPc = precioPc;
	}

}
