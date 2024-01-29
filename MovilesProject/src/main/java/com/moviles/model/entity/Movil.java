package com.moviles.model.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
@IdClass(value = MovilKey.class)
public class Movil {

	@Id
	@ManyToOne
	private Modelo modelo;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Procesador procesador;
	@ManyToOne
	private TecnologiaPantalla tecnologiaPantalla;
	private double ancho;
	private double grosor;
	private double alto;
	private double tamanoPantalla;
	private int almacenamiento;
	private int ram;
	private double peso;
	private int megaPixeles;
	private boolean nfc;
	private double precio;
	private Date fechaLanzamiento;

	public Long getMarcaId() {
		return modelo.getMarcaId();	
	}
	public Long getTecId() {
		return tecnologiaPantalla.getId();
	}
	private int puntuacion;


}
