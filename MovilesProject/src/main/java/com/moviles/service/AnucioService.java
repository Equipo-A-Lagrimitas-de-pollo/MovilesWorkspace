package com.moviles.service;

import java.util.List;

import com.moviles.model.DTO.DTOAnuncio;

public interface AnucioService {
    public boolean createPostIntercambio(DTOAnuncio dtoAnuncio);

    public List<DTOAnuncio> getAnuncios();

    public boolean createPostVenta();

    public boolean deletePostVenta();

}
