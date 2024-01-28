package com.moviles.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.moviles.model.entity.Movil;
import com.moviles.repositories.MovilRepository;
import com.moviles.service.MovilService;

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movil> getAll() {
		return movilRepository.findAll();
	}

}
