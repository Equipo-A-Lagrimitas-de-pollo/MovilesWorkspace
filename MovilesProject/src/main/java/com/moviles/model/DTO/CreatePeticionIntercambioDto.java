package com.moviles.model.DTO;

public record CreatePeticionIntercambioDto(
		String userNameAnunciante,
		String userNameSolicitante,
		int referenciaPostIntercambioAnunciante,
		int referenciaPostIntercambioSolicitante
		) 
{}

