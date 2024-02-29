package com.moviles.service;

import java.util.List;
import java.util.Optional;

import com.moviles.model.DTO.DTOAnuncio;

public interface AnucioService {

	public boolean createPostIntercambio(DTOAnuncio dtoAnuncio);

	public List<DTOAnuncio> getAnuncios();

	public boolean createPostVenta(DTOAnuncio dtoAnuncio);

	public boolean deletePostVenta(Long id);

	public Optional<DTOAnuncio> getByUserName(String name);

	public boolean update();
	/*
	 * Plantear implementar un metodo putAnuncio
	 * Revisar los parametros de entrada de los metodos ya creados
	 */
}
