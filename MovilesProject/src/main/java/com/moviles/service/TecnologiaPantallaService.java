package com.moviles.service;

import java.util.Optional;

import com.moviles.model.DTO.DTOProcesador;
import com.moviles.model.DTO.DTOTecnologiaPantalla;

public interface TecnologiaPantallaService extends DataService<DTOTecnologiaPantalla, Long> {
	public Optional<DTOTecnologiaPantalla> getByTipo(String tipo);
	public boolean deleteByTipo(String tipo);
}
