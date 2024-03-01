package com.moviles.mapper;

import com.moviles.model.DTO.CreatePostDTOVenta;
import com.moviles.model.entity.PostVenta;

public class CreatePostDtoVentaToPostVenta implements Mapper<CreatePostDTOVenta, PostVenta>{

	@Override
	public PostVenta map(CreatePostDTOVenta t) {
		return new PostVenta(t.getReferencia(),t.getReferenciaMovil(),t.getEstado(),t.getFecha(),t.getPrecio());
	}

}
