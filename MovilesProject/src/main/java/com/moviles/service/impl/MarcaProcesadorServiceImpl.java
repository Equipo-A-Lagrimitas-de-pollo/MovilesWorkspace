package com.moviles.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.model.entity.MarcaProcesador;
import com.moviles.model.entity.Procesador;
import com.moviles.repositories.MarcaProcesadorRepository;
import com.moviles.repositories.MarcaRepository;
import com.moviles.repositories.ProcesadorRepository;
import com.moviles.service.MarcaProcesadorService;

@Service
public class MarcaProcesadorServiceImpl implements MarcaProcesadorService{

	private MarcaProcesadorRepository marcaProcesadorRepository;
	
	public MarcaProcesadorServiceImpl(MarcaProcesadorRepository marcaProcesadorRepository,
			ProcesadorRepository procesadorRepository) {
		super();
		this.marcaProcesadorRepository = marcaProcesadorRepository;
	}

	@Override
	public Optional<MarcaProcesador> getById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<MarcaProcesador> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(MarcaProcesador entity) {
		Optional<MarcaProcesador> marcaProcesador = marcaProcesadorRepository.findByMarca(entity.getMarca());
		if(marcaProcesador.isPresent()) {
			return false;
		}
		marcaProcesadorRepository.save(entity);
		return true;
	}

	@Override
	public boolean update(MarcaProcesador entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
