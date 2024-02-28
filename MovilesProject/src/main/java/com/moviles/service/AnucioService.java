package com.moviles.service;

import java.util.List;

import com.moviles.model.DTO.DTOAnuncio;

public interface AnucioService {
    public boolean createPostIntercambio(DTOAnuncio dtoAnuncio, String token);

    public List<DTOAnuncio> getAnuncios(String token);

    public boolean createPostVenta(String token);

    public boolean deletePostVenta(String token);

}
