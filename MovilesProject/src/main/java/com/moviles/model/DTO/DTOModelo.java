package com.moviles.model.DTO;

import com.moviles.model.entity.Marca;

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


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class DTOModelo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long claveModelo;
	
	private Long claveMarca;
	
	private String nombre;

	public Long getMarcaId() {
		return claveMarca.getId();

	}

	public DTOModelo(Long claveMarca, String nombre) {
		super();
		this.claveMarca = claveMarca;
		this.nombre = nombre;
	}

}