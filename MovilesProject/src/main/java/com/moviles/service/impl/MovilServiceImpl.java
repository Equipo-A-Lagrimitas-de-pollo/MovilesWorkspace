package com.moviles.service.impl;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.filterV2.Filter;
import com.moviles.mapper.MapDTOFilterToListFilter;
import com.moviles.model.DTO.DTOMovilFilter;
import com.moviles.model.DTO.DTORequestPuntuacion;
import com.moviles.model.DTO.DTOcompare;
import com.moviles.model.entity.Movil;
import com.moviles.model.entity.MovilKey;
import com.moviles.repositories.MovilRepository;
import com.moviles.service.FilterService;
import com.moviles.service.MovilService;

import io.micrometer.common.lang.NonNull;

@Service
public class MovilServiceImpl implements MovilService,FilterService<List<Movil>, DTOMovilFilter> {

	private MovilRepository movilRepository;

	public MovilServiceImpl(MovilRepository movilRepository) {
		this.movilRepository = movilRepository;
	}

	@Override
	public List<Movil> getAll() {
		return this.movilRepository.findAll();
	}

	@Override
	public Optional<Movil> getById(@NonNull MovilKey key) {
		return this.movilRepository.findById(key);
	}

	@Override
	public boolean save(@NonNull Movil entity) {
		return this.movilRepository.save(entity) != null ? true : false;

	}

	@Override
	public boolean update(Movil entity) {
		return this.movilRepository.findById(new MovilKey(entity.getModelo(), entity.getId())).isPresent()
				? save(entity)
				: false;
	}

	@Override
	public boolean delete(@NonNull MovilKey key) {
		this.movilRepository.deleteById(key);
		return !this.movilRepository.findById(key).isPresent();
	}

	@Override
	public boolean updatePuntuacion(DTORequestPuntuacion requestPuntuacion) {
		Movil movil = getById(requestPuntuacion.getKey()).get();
		movil.setPuntuacion(movil.getPuntuacion() + requestPuntuacion.getPuntuacion());
		return save(movil);
	}

	@Override
	public List<Movil> findTopMovil() {
		return this.movilRepository.findTop5ByOrderByPuntuacionDesc();
	}

	@Override
	public List<Movil> filterByMarca(Long marcaId) {
		return this.movilRepository.findAll().stream().filter(movil -> {
			return movil.getMarcaId() == marcaId;
		}).toList();
	}

	@Override
	public List<Movil> compareMovile(DTOcompare keys) {
		List<Movil> list = new ArrayList<>();
		list.add(this.movilRepository.findById(keys.getKey1()).get());
		list.add(this.movilRepository.findById(keys.getKey2()).get());
		return list;
	}

	@Override
	public List<Movil> filter(DTOMovilFilter parametros) {
		List<Movil> toFilter = getAll();
		List<Filter<?>> filtros= new MapDTOFilterToListFilter().map(parametros);
		for (Filter<?> filter : filtros) {
			toFilter=toFilter.stream().filter(movil->filter.filter(movil)).toList();
		}
		return toFilter;	
		
	}

}
