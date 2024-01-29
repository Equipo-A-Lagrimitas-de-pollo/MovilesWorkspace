package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviles.model.entity.Procesador;
import com.moviles.repositories.ProcesadorRepository;
import com.moviles.service.ProcesadorDataService;

@Service
public class ProcesadorDataServiceImpl implements ProcesadorDataService {

	@Autowired
	private ProcesadorRepository procesadorRepository;

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
		if (procesadorRepository.save(entity) != null) {
			return true;
		}
		return false;

	}

	@Override
	public boolean update(Procesador entity) {
		return true;
	}

	@Override
	public void delete(Long id) {
		procesadorRepository.deleteById(id);

	}

}
