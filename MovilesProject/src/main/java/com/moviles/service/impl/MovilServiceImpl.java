package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviles.model.DTO.DTORequestPuntuacion;
import com.moviles.model.entity.Movil;
import com.moviles.model.entity.MovilKey;
import com.moviles.repositories.MovilRepository;
import com.moviles.service.MovilService;

import io.micrometer.common.lang.NonNull;

@Service
public class MovilServiceImpl implements MovilService {
	@Autowired
	MovilRepository movilRepository;

	@Override
	public List<Movil> filterByMarca(String nombre) {
		return null;
	}

	@Override
	public List<Movil> filterByPrecioMin(float precioMin) {
		return movilRepository.findAll().stream()
				.filter((movil) -> movil.getPrecio() > precioMin)
				.toList();
	}

	@Override
	public List<Movil> filterByPrecioMax(float precioMax) {
		return movilRepository.findAll().stream()
				.filter((movil) -> movil.getPrecio() < precioMax)
				.toList();
	}

	@Override
	public List<Movil> filterByRamMin(int ramMin) {
		return movilRepository.findAll().stream()
				.filter((movil) -> movil.getRam() > ramMin)
				.toList();
	}

	@Override
	public List<Movil> filterByRamMax(int ramMax) {
		return movilRepository.findAll().stream()
				.filter((movil) -> movil.getRam() < ramMax)
				.toList();
	}

	@Override
	public List<Movil> filterByNFC(boolean nfc) {
		return movilRepository.findAll().stream()
				.filter((movil) -> movil.isNfc() == nfc)
				.toList();
	}

	@Override
	public List<Movil> filterByTec(String tipo) {

		return null;
	}

	@Override
	public List<Movil> getAll() {
		return movilRepository.findAll();
	}

	@Override
	public Optional<Movil> getById(@NonNull MovilKey key) {
		return movilRepository.findById(key);
	}

	@Override
	public boolean save(@NonNull Movil entity) {
		return movilRepository.save(entity) != null ? true : false;

	}

	@Override
	public boolean update(Movil entity) {
		return true;
	}

	@Override
	public boolean delete(@NonNull MovilKey key) {
		movilRepository.deleteById(key);
		return getById(key) != null ? true : false;
	}

	@Override
	public boolean updatePuntuacion(DTORequestPuntuacion requestPuntuacion) {
		Movil movil = getById(requestPuntuacion.getKey()).get();
		movil.setPuntuacion(movil.getPuntuacion() + requestPuntuacion.getPuntuacion());
		return save(movil);
	}

	@Override
	public List<Movil> findTopMovil() {
		return movilRepository.findTop5ByOrderByPuntuacionDesc();
	}

}
