package com.moviles.model.entity;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
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
	@ManyToOne(cascade= CascadeType.ALL)
	private Modelo modelo;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL)
	private Procesador procesador;
	@ManyToOne(cascade = CascadeType.ALL)
	private TecnologiaPantalla tecnologiaPantalla;
	private Long referencia;
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
	private LocalDate fechaLanzamiento;
	private int puntuacion;

	public Long getMarcaId() {
		return modelo.getMarcaId();
	}
	
	public String getNombreMarca() {
		return modelo.getNombreMarca();
	}

	public Long getTecId() {
		return tecnologiaPantalla.getId();
	}

	public Movil(Modelo modelo, Procesador procesador, TecnologiaPantalla tecnologiaPantalla, Long referencia,
			double ancho, double grosor, double alto, double tamanoPantalla, int almacenamiento, int ram, double peso,
			int megaPixeles, boolean nfc, double precio, LocalDate fechaLanzamiento, int puntuacion) {
		super();
		this.modelo = modelo;
		this.procesador = procesador;
		this.tecnologiaPantalla = tecnologiaPantalla;
		this.referencia = referencia;
		this.ancho = ancho;
		this.grosor = grosor;
		this.alto = alto;
		this.tamanoPantalla = tamanoPantalla;
		this.almacenamiento = almacenamiento;
		this.ram = ram;
		this.peso = peso;
		this.megaPixeles = megaPixeles;
		this.nfc = nfc;
		this.precio = precio;
		this.fechaLanzamiento = fechaLanzamiento;
		this.puntuacion = puntuacion;
	}



}
