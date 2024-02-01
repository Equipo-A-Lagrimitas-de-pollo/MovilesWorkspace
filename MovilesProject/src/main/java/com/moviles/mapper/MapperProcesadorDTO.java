package com.moviles.mapper;

import com.moviles.model.DTO.DTOProcesador;
import com.moviles.model.entity.Procesador;

public class MapperProcesadorDTO implements BiMap<Procesador, DTOProcesador> {

	@Override
	public DTOProcesador mapToDto(Procesador entity) {
		DTOProcesador dtoProcesador = new DTOProcesador(entity.getReferencia(), entity.getNombre(),
				entity.getNumeronucleos(), entity.getGigaHerziosMaximos());
		return dtoProcesador;
	}

	@Override
	public Procesador mapToEntity(DTOProcesador dto) {
		Procesador procesador = new Procesador(dto.getClaveProcesador(), dto.getNombre(), dto.getNumeronucleos(),
				dto.getGigaHerziosMaximos());
		return procesador;
	}

}
