package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.model.DTO.AceptarPeticionDto;
import com.moviles.model.DTO.CreatePeticionIntercambioDto;
import com.moviles.model.DTO.CreatePeticionVentaDto;
import com.moviles.model.DTO.DTOPeticion;
import com.moviles.model.entity.PeticionIntercambio;
import com.moviles.model.entity.PeticionVenta;
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
		return aceptarPeticionIntercambio(dto)||aceptarPeticionVenta(dto);
	}

	private boolean aceptarPeticionIntercambio(AceptarPeticionDto dto) {
		Optional<PeticionIntercambio> optionalPeticionIntercambio = peticioniIntercambioRepository.findByReferencia(dto.referenciaPeticion());
		if(optionalPeticionIntercambio.isPresent()) {
			PeticionIntercambio peticionIntercambio = optionalPeticionIntercambio.get();
			if(peticionIntercambio.isSameUser(dto.userName())) {
				peticionIntercambio.setAceptada(true);
				peticioniIntercambioRepository.save(peticionIntercambio);
				return true;
			}
			
		}
		return false;
	}
	
	private boolean aceptarPeticionVenta(AceptarPeticionDto dto) {
		Optional<PeticionVenta> optionalPeticionVenta = peticionVentaRepository.findByReferencia(dto.referenciaPeticion());
		if(optionalPeticionVenta.isPresent()) {
			PeticionVenta peticionVenta = optionalPeticionVenta.get();
			if(peticionVenta.isSameUser(dto.userName())) {
				peticionVenta.setAceptada(true);
				peticionVentaRepository.save(peticionVenta);
				return true;
			}
			
		}
		return false;
	}

	@Override
	public Long filterPeticiones() {
		// TODO Auto-generated method stub
		return null;
	}

}
