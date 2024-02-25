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
		Optional<Procesador> procesadorEncontrado = procesadorRepository.findByReferencia(entity.getReferencia());
		if(procesadorEncontrado.isPresent()){
			return false;
		}
		procesadorRepository.save(entity);
		return true;
	}

	@Override
	public boolean delete(Long id) {
		procesadorRepository.deleteById(id);
		return !this.procesadorRepository.findById(id).isPresent();
	}

}
