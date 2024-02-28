package com.moviles.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.moviles.model.DTO.DTOAnuncio;
import com.moviles.model.entity.PostVenta;
import com.moviles.repositories.PostVentaRepository;
import com.moviles.service.AnucioService;

@Service
public class AnuncioServiceImpl implements AnucioService {

    private final PostVentaRepository postVentaRepository;

    public AnuncioServiceImpl(PostVentaRepository postVentaRepository) {
        this.postVentaRepository = postVentaRepository;
    }

    @Override
    public boolean createPostIntercambio(DTOAnuncio dtoAnuncio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPostIntercambio'");
    }

    @Override
    public List<DTOAnuncio> getAnuncios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAnuncios'");
    }

    @Override
    public boolean createPostVenta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createPostVenta'");
    }

    @Override
    public boolean deletePostVenta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePostVenta'");
    }

    public void createPost(PostVenta post) {
        postVentaRepository.save(post);
    }

}
