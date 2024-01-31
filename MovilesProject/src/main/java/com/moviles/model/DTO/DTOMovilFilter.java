package com.moviles.model.DTO;

import org.springframework.beans.factory.annotation.Value;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOMovilFilter {
	@NotNull
	private Long idMarca;
	@NotNull
	@Positive
	private double precioMax;
	@NotNull
	@Positive
	@Value("1")
	private double precioMin;
	@Positive
	private int ramMax;
	@Positive
	@Value("1")
	private int ramMin;
	private Boolean nfc;
	private Long idTecnologiaPantalla;
	
}
