package com.moviles.mapper;

import com.moviles.model.DTO.CreatePostDTOIntercambio;
import com.moviles.model.entity.PostIntercambio;

public class CreatePostDtoToPostIntercambio implements Mapper<CreatePostDTOIntercambio, PostIntercambio>{

	@Override
	public PostIntercambio map(CreatePostDTOIntercambio t) {
		return new PostIntercambio(t.getReferencia(),t.getReferenciaMovil(),t.getEstado(),t.getFecha(),t.getEstadoMinimoRequerido());
	}

}
