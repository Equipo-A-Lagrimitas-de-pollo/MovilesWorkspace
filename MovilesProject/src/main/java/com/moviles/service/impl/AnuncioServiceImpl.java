package com.moviles.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.mapper.CreatePostIntercambioToPostIntercambio;
import com.moviles.model.DTO.CreatePostDTOIntercambio;
import com.moviles.model.DTO.CreatePostDTOVenta;
import com.moviles.model.DTO.PostInfoDto;
import com.moviles.model.DTO.UpdateDtoAnuncio;
import com.moviles.model.entity.Post;
import com.moviles.model.entity.PostIntercambio;
import com.moviles.model.entity.PostVenta;
import com.moviles.repositories.PostIntercambioRepository;
import com.moviles.repositories.PostVentaRepository;
import com.moviles.service.AnucioService;

@Service
public class AnuncioServiceImpl implements AnucioService {

    private final PostVentaRepository postVentaRepository;
    private final PostIntercambioRepository postIntercambioRepository;
    private final UserServiceImpl userServiceImpl;

    public AnuncioServiceImpl(PostVentaRepository postVentaRepository, PostIntercambioRepository postIntercambioRepository, UserServiceImpl userServiceImpl) {
        this.postVentaRepository = postVentaRepository;
		this.postIntercambioRepository = postIntercambioRepository;
		this.userServiceImpl = userServiceImpl;
    }

    @Override
    public boolean createPostIntercambio(CreatePostDTOIntercambio dtoAnuncio) {
        Optional<PostVenta> postVentas = postVentaRepository.findByReferencia(dtoAnuncio.getReferencia());
        if (postVentas.isPresent()) {
            return false;
        } 
        PostIntercambio post = new CreatePostIntercambioToPostIntercambio().map(dtoAnuncio);
        postIntercambioRepository.save(post);
        return true;

    }

    @Override
    public List<PostInfoDto> getAnuncios() {
        List<PostInfoDto> posts = new ArrayList<>();
        
        return null;
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
