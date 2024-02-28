package com.moviles.controler;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.model.DTO.DTOPeticion;
import com.moviles.service.PeticionService;

@RestController
@RequestMapping("api/peticion")
public class ControllerPeticion {
	private final PeticionService peticionService;

	public ControllerPeticion(PeticionService peticionService) {
		super();
		this.peticionService = peticionService;
	}

	/*public boolean crearPeticionIntercambio(DTOPeticion dto);
	public boolean crearPeticionVenta(DTOPeticion dto);
	public List<DTOPeticion> getAll();
	public boolean editPeticionIntercambio(DTOPeticion dto);
	public boolean editPeticionVenta(DTOPeticion dto);
	public boolean deletePeticion(DTOPeticion dto);
	
	Implementar estos metodos
	*/
	
}
