package com.moviles.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.moviles.mapper.CreatePostDtoToPostIntercambio;
import com.moviles.mapper.CreatePostDtoVentaToPostVenta;
import com.moviles.mapper.PostIntercambioToPostInfoDto;
import com.moviles.mapper.PostVentaToPostInfoDto;
import com.moviles.model.DTO.CreatePostDTOIntercambio;
import com.moviles.model.DTO.CreatePostDTOVenta;
import com.moviles.model.DTO.PostInfoDto;
import com.moviles.model.DTO.UpdateDtoAnuncio;
import com.moviles.model.entity.Movil;
import com.moviles.model.entity.PostIntercambio;
import com.moviles.model.entity.PostVenta;
import com.moviles.model.entity.Usuario;
import com.moviles.repositories.MovilRepository;
import com.moviles.repositories.PostIntercambioRepository;
import com.moviles.repositories.PostVentaRepository;
import com.moviles.service.AnucioService;

@Service
public class AnuncioServiceImpl implements AnucioService {

    private final PostVentaRepository postVentaRepository;
    private final PostIntercambioRepository postIntercambioRepository;
    private final MovilRepository movilRepository;
    private final UserServiceImpl userServiceImpl;
    
    public AnuncioServiceImpl(PostVentaRepository postVentaRepository, PostIntercambioRepository postIntercambioRepository, UserServiceImpl userServiceImpl, MovilRepository movilRepository) {
        this.postVentaRepository = postVentaRepository;
		this.postIntercambioRepository = postIntercambioRepository;
		this.movilRepository = movilRepository;
		this.userServiceImpl = userServiceImpl;
    }

    @Override
    public boolean createPostIntercambio(CreatePostDTOIntercambio dtoAnuncio) {
        Optional<PostIntercambio> post = postIntercambioRepository.findByReferenciaMovil(dtoAnuncio.getReferencia());
        if (post.isPresent()) {
            return false;
        }
        Optional<Movil> movilEncontrado = movilRepository.findByReferencia(dtoAnuncio.getReferenciaMovil());
        Usuario user = userServiceImpl.getUserByUsername(dtoAnuncio.getUserName());
        PostIntercambio newPostIntercambio = new CreatePostDtoToPostIntercambio().map(dtoAnuncio);
        newPostIntercambio.setUser(user);
        newPostIntercambio.setReferenciaMovil(dtoAnuncio.getReferencia());
        postIntercambioRepository.save(newPostIntercambio);
        return true;

    }

    @Override
    public List<PostInfoDto> getAnuncios() {
       List<PostIntercambio> posts = postIntercambioRepository.findAll();
       List<PostInfoDto> all = new ArrayList<>();
       all.addAll(posts.stream()
    		   .map(post->new PostIntercambioToPostInfoDto().map(post))
    		   .toList());
       all.addAll(postVentaRepository.findAll().stream()
    		   .map(postVenta->new PostVentaToPostInfoDto().map(postVenta))
    		   .toList());
       return all;
    }

    @Override
    public boolean createPostVenta(CreatePostDTOVenta dtoAnuncio) {
    	Optional<PostVenta> post = postVentaRepository.findByReferencia(dtoAnuncio.getReferencia());
    	if(post.isPresent()) {
    		return false;
    	}
    	Usuario user = userServiceImpl.getUserByUsername(dtoAnuncio.getUserName());
    	PostVenta postVenta = new CreatePostDtoVentaToPostVenta().map(dtoAnuncio);
    	postVenta.setUser(user);
    	postVentaRepository.save(postVenta);
    	return true;
    }

    @Override
    public boolean deletePostVenta(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<PostInfoDto> getByUserName(String name) {
        return getAnuncios().stream().filter(post->post.getNombreUsuario().equals(name)).toList();
    }

	@Override
	public boolean update(UpdateDtoAnuncio dto) {
		return false;
	}

}
