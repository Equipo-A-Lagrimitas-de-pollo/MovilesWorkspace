package com.moviles.mapper;

import java.sql.Date;

import com.moviles.model.DTO.PostInfoDto;
import com.moviles.model.entity.Post;
import com.moviles.model.entity.PostIntercambio;

public class PostIntercambioToPostInfoDto implements Mapper<PostIntercambio, PostInfoDto> {

	@Override
	public PostInfoDto map(PostIntercambio t) {
		return new PostInfoDto(t.getUser().getUsername(),"",t.getDate(),t.getEstado());
	}

}
