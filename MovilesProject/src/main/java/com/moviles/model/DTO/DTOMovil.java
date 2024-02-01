package com.moviles.model.DTO;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@AllArgsConstructor
@Data
public class DTOMovil {


	private Long claveModelo;
	
	private Long claveMovil;
	
	private Long claveProcesador;

	private Long claveTecnologiaPantalla;
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

	public DTOMovil(Long claveModelo, Long claveProcesador, Long claveTecnologiaPantalla, double ancho,
			double grosor, double alto, double tamanoPantalla, int almacenamiento, int ram, double peso,
			int megaPixeles, boolean nfc, double precio, LocalDate fechaLanzamiento, int puntuacion) {
		super();
		this.claveModelo = claveModelo;
		this.claveProcesador = claveProcesador;
		this.claveTecnologiaPantalla = claveTecnologiaPantalla;
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
