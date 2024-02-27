package com.moviles.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviles.model.DTO.DTOAnuncio;
import com.moviles.model.entity.PostVenta;
import com.moviles.repositories.PostVentaRepository;
import com.moviles.service.AnucioService;

@Service
public class AnuncioServiceImpl implements AnucioService {

    private PostVentaRepository postVentaRepository;

    public AnuncioServiceImpl(PostVentaRepository postVentaRepository) {
        this.postVentaRepository = postVentaRepository;
    }

    @Override
    public boolean crearAnuncio(DTOAnuncio dtoAnuncio, String token) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'crearAnuncio'");
    }

    @Override
    public List<DTOAnuncio> getAnuncios(String token) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAnuncios'");
    }

    @Override
    public boolean crearAnuncioNoComplete(PostVenta post) {
        postVentaRepository.save(post);
        return true;
    }

}
