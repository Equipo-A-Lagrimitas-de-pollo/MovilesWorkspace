package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.model.DTO.CreatePostDTOIntercambio;
import com.moviles.model.DTO.CreatePostDTOVenta;
import com.moviles.model.DTO.PostInfoDto;
import com.moviles.model.DTO.UpdateDtoAnuncio;
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
    public boolean createPostIntercambio(CreatePostDTOIntercambio dtoAnuncio) {
        Optional<PostVenta> postVentas = postVentaRepository.findByReferencia();
        if (postVentas.isPresent()) {
            return false;
        } else {

        }
        return false;

    }

    @Override
    public List<PostInfoDto> getAnuncios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAnuncios'");
    }

    @Override
    public boolean createPostVenta(CreatePostDTOVenta dtoAnuncio) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean deletePostVenta(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Optional<PostInfoDto> getByUserName(String name) {
        // TODO Auto-generated method stub
        return Optional.empty();
    }

    public void createPost(PostVenta post) {
        postVentaRepository.save(post);
    }

	@Override
	public boolean update(UpdateDtoAnuncio dto) {
		return false;
	}

}
