package com.moviles.service;

import java.util.List;
import java.util.Optional;

import com.moviles.model.DTO.CreatePostDTOIntercambio;
import com.moviles.model.DTO.CreatePostDTOVenta;
import com.moviles.model.DTO.PostInfoDto;
import com.moviles.model.DTO.UpdateDtoAnuncio;

public interface AnucioService {

	public boolean createPostIntercambio(CreatePostDTOIntercambio createPostDTOIntercambio);

	public List<PostInfoDto> getAnuncios();

	public boolean createPostVenta(CreatePostDTOVenta dtoAnuncio);

	public boolean deletePostVenta(Long id);

	public List<PostInfoDto> getByUserName(String name);

	public boolean update(UpdateDtoAnuncio dto);
	/*
	 * Plantear implementar un metodo putAnuncio
	 * Revisar los parametros de entrada de los metodos ya creados
	 */
}
