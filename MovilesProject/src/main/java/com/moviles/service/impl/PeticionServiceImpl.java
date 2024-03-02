package com.moviles.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviles.model.DTO.AceptarPeticionDto;
import com.moviles.model.DTO.CreatePeticionIntercambioDto;
import com.moviles.model.DTO.CreatePeticionVentaDto;
import com.moviles.model.DTO.DTOPeticion;
import com.moviles.repositories.PeticionIntercambioRepository;
import com.moviles.repositories.PeticionVentaRepository;
import com.moviles.repositories.PostIntercambioRepository;
import com.moviles.repositories.PostVentaRepository;
import com.moviles.service.PeticionService;

@Service
public class PeticionServiceImpl implements PeticionService {

	PeticionIntercambioRepository peticioniIntercambioRepository;
	PeticionVentaRepository peticionVentaRepository;
	PostIntercambioRepository postIntercambioRepository;
	PostVentaRepository postVentaRepository;

	public PeticionServiceImpl(PeticionIntercambioRepository peticioniIntercambioRepository,
			PeticionVentaRepository peticionVentaRepository, PostIntercambioRepository postIntercambioRepository,
			PostVentaRepository postVentaRepository) {
		super();
		this.peticioniIntercambioRepository = peticioniIntercambioRepository;
		this.peticionVentaRepository = peticionVentaRepository;
		this.postIntercambioRepository = postIntercambioRepository;
		this.postVentaRepository = postVentaRepository;
	}

	@Override
	public boolean crearPeticionIntercambio(CreatePeticionIntercambioDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean crearPeticionVenta(CreatePeticionVentaDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<DTOPeticion> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean aceptarPeticon(AceptarPeticionDto dto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Long filterPeticiones() {
		// TODO Auto-generated method stub
		return null;
	}

}
