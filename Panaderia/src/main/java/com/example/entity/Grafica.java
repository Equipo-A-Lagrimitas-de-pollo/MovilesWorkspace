package com.example.entity;

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

public class Grafica {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGrafica;

	private String marcaGrafica;
	private String tipoGrafica;

	public Grafica(String marcaGrafica, String tipoGrafica) {
		super();
		this.marcaGrafica = marcaGrafica;
		this.tipoGrafica = tipoGrafica;
	}

}
