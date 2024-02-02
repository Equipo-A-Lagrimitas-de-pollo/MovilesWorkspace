package com.moviles.service;

import java.util.Optional;

import com.moviles.model.DTO.DTOProcesador;
import com.moviles.model.entity.Procesador;

public interface ProcesadorService extends DataService<DTOProcesador, Long>{
	public Optional<DTOProcesador> getByNombre(String nombre);
	public boolean deleteByNombre(String nombre);
}
