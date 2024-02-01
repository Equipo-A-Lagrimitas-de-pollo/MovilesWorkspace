package com.moviles.mapper;

import com.moviles.model.DTO.DTOMarca;
import com.moviles.model.entity.Marca;

public class MapperMarcaDTO implements BiMap<Marca, DTOMarca>{

	@Override
	public DTOMarca mapToDto(Marca entity) {
		DTOMarca dtoMarca = new DTOMarca(entity.getNombre());
		return dtoMarca;
	}

	@Override
	public Marca mapToEntity(DTOMarca dto) {
		Marca marca = new Marca(dto.getNombre());
		return marca;
	}



}
