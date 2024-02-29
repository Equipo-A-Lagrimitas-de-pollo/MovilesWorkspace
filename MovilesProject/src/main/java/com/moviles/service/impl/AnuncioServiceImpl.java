package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

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
        Optional<PostVenta> postVentas = postVentaRepository.findByReferencia();
        if (postVentas.isPresent()) {
            return false;
        } else {

        }

    }

    @Override
    public List<DTOAnuncio> getAnuncios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAnuncios'");
    }

    @Override
    public boolean createPostVenta(DTOAnuncio dtoAnuncio) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deletePostVenta(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<DTOAnuncio> getByUserName(String name) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    public void createPost(PostVenta post) {
        postVentaRepository.save(post);
    }

}
