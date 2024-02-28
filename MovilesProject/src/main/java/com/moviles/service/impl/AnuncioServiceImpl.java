package com.moviles.service.impl;

import java.util.List;

import com.moviles.model.DTO.DTOAnuncio;
import com.moviles.repositories.PostVentaRepository;
import com.moviles.service.AnucioService;

public class AnuncioServiceImpl implements AnucioService {

    private PostVentaRepository postVentaRepository;

    @Override
    public boolean createPostIntercambio(DTOAnuncio dtoAnuncio, String token) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPostIntercambio'");
    }

    @Override
    public List<DTOAnuncio> getAnuncios(String token) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAnuncios'");
    }

    @Override
    public boolean createPostVenta(String token) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPostVenta'");
    }

    @Override
    public boolean deletePostVenta(String token) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePostVenta'");
    }

}
