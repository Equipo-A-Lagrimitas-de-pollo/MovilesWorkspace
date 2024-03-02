package com.moviles.controler;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.model.DTO.CreatePostDTOVenta;
import com.moviles.model.DTO.PostInfoDto;
import com.moviles.model.DTO.UpdateDtoAnuncio;
import com.moviles.model.entity.Marca;
import com.moviles.service.impl.AnuncioServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/anuncio")
public class ControllerAnuncio {

	private final AnuncioServiceImpl anuncioServiceImpl;

	public ControllerAnuncio(AnuncioServiceImpl anuncioServiceImpl) {
		super();
		this.anuncioServiceImpl = anuncioServiceImpl;
	}

	@GetMapping("find")
	public ResponseEntity<List<PostInfoDto>> get() {
		return ResponseEntity.ok(anuncioServiceImpl.getAnuncios());
	}

	@GetMapping("findById")
	public ResponseEntity<List<PostInfoDto>> getById(@Valid @RequestParam String name) {
		return ResponseEntity.ok(anuncioServiceImpl.getByUserName(name));
	}

	@DeleteMapping("delete")
	public ResponseEntity<Boolean> delete(@Valid @RequestParam Long id) {
		return ResponseEntity.ok(anuncioServiceImpl.deletePostVenta(id));
	}

	@PostMapping("create")
	public ResponseEntity<Boolean> post(@Valid @RequestBody CreatePostDTOVenta dtoAnuncio) {
		return ResponseEntity.ok(anuncioServiceImpl.createPostVenta(dtoAnuncio));
	}

	@PutMapping("update")
	public ResponseEntity<Boolean> put(@Valid @RequestBody UpdateDtoAnuncio dtoAnuncio) {
		//TODO
		return ResponseEntity.ok(anuncioServiceImpl.update(dtoAnuncio));
	}
}
