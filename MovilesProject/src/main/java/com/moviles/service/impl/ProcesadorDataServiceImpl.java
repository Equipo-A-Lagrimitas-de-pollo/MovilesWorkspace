package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.mapper.MapperProcesadorDTO;
import com.moviles.model.DTO.DTOProcesador;
import com.moviles.model.entity.Procesador;
import com.moviles.repositories.ProcesadorRepository;
import com.moviles.service.ProcesadorService;

@Service
public class ProcesadorDataServiceImpl implements ProcesadorService {

	private ProcesadorRepository procesadorRepository;

	public ProcesadorDataServiceImpl(ProcesadorRepository procesadorRepository) {
		this.procesadorRepository = procesadorRepository;
	}

	@Override
	public Optional<DTOProcesador> getById(Long id) {
		return procesadorRepository.findById(id).map(procesador->new MapperProcesadorDTO().mapToDto(procesador));
	}

	@Override
	public List<DTOProcesador> getAll() {
		return procesadorRepository.findAll().stream()
				.map(procesador->new MapperProcesadorDTO().mapToDto(procesador)).toList();
	}

	@Override
	public boolean save(DTOProcesador dto) {
		return this.procesadorRepository.save(new MapperProcesadorDTO().mapToEntity(dto)) != null ? true : false;
	}

	@Override
	public boolean update(DTOProcesador dto) {
		Procesador procesador = new MapperProcesadorDTO().mapToEntity(dto);
		return getById(procesador.getId()).isPresent() ? save(new MapperProcesadorDTO().mapToDto(procesador)) : false;

	}

	@Override
	public boolean delete(Long id) {
		procesadorRepository.deleteById(id);
		return !this.procesadorRepository.findById(id).isPresent();
	}

}
