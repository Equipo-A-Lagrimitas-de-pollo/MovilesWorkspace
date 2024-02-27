package com.moviles.service;

import java.util.List;

import com.moviles.model.DTO.DTOAnuncio;
import com.moviles.model.entity.PostVenta;

public interface AnucioService {
    public boolean crearAnuncio(DTOAnuncio dtoAnuncio, String token);

    public List<DTOAnuncio> getAnuncios(String token);

    public boolean crearAnuncioNoComplete(PostVenta post);
}
