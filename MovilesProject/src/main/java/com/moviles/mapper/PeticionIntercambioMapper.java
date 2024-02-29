package com.moviles.mapper;

import com.moviles.mapper.Mapper;
import com.moviles.model.DTO.CreatePeticionIntercambioDto;
import com.moviles.model.entity.PeticionIntercambio;

public class PeticionIntercambioMapper implements Mapper<CreatePeticionIntercambioDto, PeticionIntercambio>{

	@Override
	public PeticionIntercambio map(CreatePeticionIntercambioDto t) {
		return new PeticionIntercambio();
	}


}
