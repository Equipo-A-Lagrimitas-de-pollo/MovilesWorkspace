package com.moviles.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.mapper.CreatePostDtoToPostIntercambio;
import com.moviles.mapper.PostIntercambioToPostInfoDto;
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
    private final MovilServiceImpl movilServiceImpl;
    private final UserServiceImpl userServiceImpl;
    
    public AnuncioServiceImpl(PostVentaRepository postVentaRepository, PostIntercambioRepository postIntercambioRepository, MovilServiceImpl movilServiceImpl, UserServiceImpl userServiceImpl) {
        this.postVentaRepository = postVentaRepository;
		this.postIntercambioRepository = postIntercambioRepository;
		this.movilServiceImpl = movilServiceImpl;
		this.userServiceImpl = userServiceImpl;
    }

    @Override
    public boolean createPostIntercambio(CreatePostDTOIntercambio dtoAnuncio) {
        Optional<PostIntercambio> postVentas = postIntercambioRepository.findByReferenciaMovil(dtoAnuncio.getReferencia());
        if (postVentas.isPresent()) {
            return false;
        }
        PostIntercambio post = new CreatePostDtoToPostIntercambio().map(dtoAnuncio);
        postIntercambioRepository.save(post);
        return true;

    }

    @Override
    public List<PostInfoDto> getAnuncios() {
       List<PostIntercambio> posts = postIntercambioRepository.findAll();
       List<PostInfoDto> info = posts.stream().map(post->new PostIntercambioToPostInfoDto().map(post)).toList();
       //TODO venta
       return info;
    }

    @Override
    public boolean createPostVenta(CreatePostDTOVenta dtoAnuncio) {
    	Optional<PostVenta> post = postVentaRepository.findByReferencia(dtoAnuncio.getReferencia());
    	if(post.isPresent()) {
    		return false;
    	}
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
