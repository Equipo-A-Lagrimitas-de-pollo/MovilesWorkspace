package com.moviles.service;

import java.util.List;

import com.moviles.model.DTO.AceptarPeticionDto;
import com.moviles.model.DTO.CreatePeticionIntercambioDto;
import com.moviles.model.DTO.CreatePeticionVentaDto;
import com.moviles.model.DTO.DTOPeticion;

public interface PeticionService {
	public boolean crearPeticionIntercambio(CreatePeticionIntercambioDto dto);

	public boolean crearPeticionVenta(CreatePeticionVentaDto dto);

	public List<DTOPeticion> getAll();

	public boolean aceptarPeticon(AceptarPeticionDto dto);

	public Long filterPeticiones();

}
