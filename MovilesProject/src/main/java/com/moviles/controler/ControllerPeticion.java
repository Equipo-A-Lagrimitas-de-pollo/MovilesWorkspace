package com.moviles.controler;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.model.DTO.AceptarPeticionDto;
import com.moviles.model.DTO.CreatePeticionIntercambioDto;
import com.moviles.model.DTO.CreatePeticionVentaDto;
import com.moviles.model.DTO.DTOPeticion;
import com.moviles.service.impl.PeticionServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/peticion")
public class ControllerPeticion {
	private final PeticionServiceImpl peticionService;

	public ControllerPeticion(PeticionServiceImpl peticionService) {
		super();
		this.peticionService = peticionService;
	}

	@PostMapping("createPeticionIntercambio")
	public ResponseEntity<Boolean> createPeticionIntercambio(
			@Valid @RequestBody CreatePeticionIntercambioDto createPeticionIntercambioDto) {
		if (peticionService.crearPeticionIntercambio(createPeticionIntercambioDto)) {
			return ResponseEntity.ok().body(true);
		}
		return ResponseEntity.badRequest().body(false);
	}

	@PostMapping("createPeticionVenta")
	public ResponseEntity<Boolean> createPeticionVenta(
			@Valid @RequestBody CreatePeticionVentaDto createPeticionVentaDto) {
		if (peticionService.crearPeticionVenta(createPeticionVentaDto)) {
			return ResponseEntity.ok().body(true);
		}
		return ResponseEntity.badRequest().body(false);
	}

	@GetMapping("findAll")
	public ResponseEntity<List<DTOPeticion>> get() {
		return ResponseEntity.ok(peticionService.getAll());
	}

	@GetMapping("aceptar")
	public ResponseEntity<Boolean> aceptarPeticon(@Valid @RequestBody AceptarPeticionDto aceptarPeticion) {
		return ResponseEntity.ok(peticionService.aceptarPeticon(aceptarPeticion));
	}

}
