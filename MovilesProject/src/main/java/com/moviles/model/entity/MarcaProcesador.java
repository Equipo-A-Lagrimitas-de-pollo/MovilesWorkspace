package com.moviles.model.entity;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class MarcaProcesador {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//Este campo es unique
	@NotBlank
	private String marca;
	
	@OneToMany(mappedBy = "marcaProcesador", cascade = CascadeType.ALL)
	private List<Procesador> procesadores;

	@Override
	public int hashCode() {
		return Objects.hash(id, marca);
	}

	public MarcaProcesador(String marca, List<Procesador> procesadores) {
		super();
		this.marca = marca;
		this.procesadores = procesadores;
	}
	
	
	
	
	
	
}
