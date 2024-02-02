package com.moviles.service;

import java.util.Optional;

import com.moviles.model.DTO.DTOMarca;

public interface MarcaService extends DataService<DTOMarca, Long> {
	
	public Optional<DTOMarca> getByNombre(String nombre);
	public boolean deleteByNombre(String nombre);
}
