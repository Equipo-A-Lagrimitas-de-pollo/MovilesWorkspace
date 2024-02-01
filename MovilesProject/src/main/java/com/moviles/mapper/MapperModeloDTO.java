package com.moviles.mapper;

import com.moviles.model.DTO.DTOModelo;
import com.moviles.model.entity.Modelo;

public class MapperModeloDTO implements BiMap<Modelo, DTOModelo> {

	@Override
	public DTOModelo mapToDto(Modelo entity) {
		DTOModelo dtoModelo = new DTOModelo(entity.getMarca().getNombre(), entity.getNombre());
		return dtoModelo;
	}

	@Override
	public Modelo mapToEntity(DTOModelo dto) {
		//TODO
		return null;
	}

}
