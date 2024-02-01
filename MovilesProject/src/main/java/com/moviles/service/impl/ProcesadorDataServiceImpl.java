package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

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
	public Optional<Procesador> getById(Long id) {
		return procesadorRepository.findById(id);
	}

	@Override
	public List<Procesador> getAll() {
		return procesadorRepository.findAll();
	}

	@Override
	public boolean save(Procesador entity) {
		return this.procesadorRepository.save(entity) != null ? true : false;
	}

	@Override
	public boolean update(Procesador entity) {
		return getById(entity.getId()).isPresent() ? save(entity) : false;

	}

	@Override
	public boolean delete(Long id) {
		procesadorRepository.deleteById(id);
		return !this.procesadorRepository.findById(id).isPresent();
	}

}
