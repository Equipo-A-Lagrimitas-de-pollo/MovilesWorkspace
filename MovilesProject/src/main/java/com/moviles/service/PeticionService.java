package com.moviles.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviles.model.DTO.DTOPeticion;

@Service
public interface PeticionService {
	public boolean crearPeticionIntercambio(DTOPeticion dto);
	public boolean crearPeticionVenta(DTOPeticion dto);
	public List<DTOPeticion> getAll();
	public boolean editPeticionIntercambio(DTOPeticion dto);
	public boolean editPeticionVenta(DTOPeticion dto);
	public boolean deletePeticion(DTOPeticion dto);
}
