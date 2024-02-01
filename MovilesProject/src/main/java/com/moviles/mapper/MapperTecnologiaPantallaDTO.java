package com.moviles.mapper;

import com.moviles.model.DTO.DTOTecnologiaPantalla;
import com.moviles.model.entity.TecnologiaPantalla;

public class MapperTecnologiaPantallaDTO implements BiMap<TecnologiaPantalla, DTOTecnologiaPantalla> {

	@Override
	public DTOTecnologiaPantalla mapToDto(TecnologiaPantalla entity) {
		DTOTecnologiaPantalla dtoTecnologiaPantalla = new DTOTecnologiaPantalla(entity.toString());
		return dtoTecnologiaPantalla;
	}

	@Override
	public TecnologiaPantalla mapToEntity(DTOTecnologiaPantalla dto) {
		TecnologiaPantalla tecnologia = new TecnologiaPantalla(dto.getClaveTecnologiaPantalla(), dto.getTipo());
		return tecnologia;
	}

}
