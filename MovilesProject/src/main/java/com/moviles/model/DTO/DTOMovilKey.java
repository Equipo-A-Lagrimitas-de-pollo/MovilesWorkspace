package com.moviles.model.DTO;

import java.io.Serializable;

import com.moviles.model.entity.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DTOMovilKey {
	private Modelo modelo;
	private Long claveMovilKey;

}
