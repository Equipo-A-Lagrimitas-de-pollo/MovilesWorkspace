package com.moviles.mapper;

import com.moviles.model.DTO.PostInfoDto;
import com.moviles.model.entity.PostIntercambio;
import com.moviles.model.entity.PostVenta;

public class PostVentaToPostInfoDto implements Mapper<PostVenta, PostInfoDto> {

	@Override
	public PostInfoDto map(PostVenta t) {
		return new PostInfoDto(t.getUser().getUsername(),"",t.getDate(),t.getEstado());
	}
}