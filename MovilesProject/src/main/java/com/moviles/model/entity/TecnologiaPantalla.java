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
public class TecnologiaPantalla {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long referencia;
	private String tipo;
	public TecnologiaPantalla(Long referencia, String tipo) {
		super();
		this.referencia = referencia;
		this.tipo = tipo;
	}

	

}
