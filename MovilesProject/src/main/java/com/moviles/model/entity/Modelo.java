package com.moviles.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Modelo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL)
	private Marca marca;
	private Long referencia;
	private String nombre;

	public Long getMarcaId() {
		return marca.getId();

	}
	
	public String getNombreMarca() {
		return marca.getNombre();
	}

	public Modelo(Marca marca, Long referencia, String nombre) {
		super();
		this.marca = marca;
		this.referencia = referencia;
		this.nombre = nombre;
	}

	

}
