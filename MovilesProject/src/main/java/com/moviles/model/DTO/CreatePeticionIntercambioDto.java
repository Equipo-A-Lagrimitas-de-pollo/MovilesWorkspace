package com.moviles.model.DTO;

public record CreatePeticionIntercambioDto(
		String tokenUsuarioAnunciante,
		String tokenUsuarioSolicitante,
		int referenciaPostIntercambioAnunciante,
		int referenciaPostIntercambioSolicitante
		) 
{}

