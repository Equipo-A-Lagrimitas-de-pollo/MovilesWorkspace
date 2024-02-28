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

import com.moviles.model.DTO.DTOAnuncio;
import com.moviles.model.entity.Marca;
import com.moviles.service.impl.AnuncioServiceImpl;

@RestController
@RequestMapping("api/anuncio")
public class ControllerAnuncio {

	private final AnuncioServiceImpl anuncioServiceImpl;

	public ControllerAnuncio(AnuncioServiceImpl anuncioServiceImpl) {
		super();
		this.anuncioServiceImpl = anuncioServiceImpl;
	}

	@GetMapping("find")
	public ResponseEntity<List<DTOAnuncio>> get() {
		return ResponseEntity.ok(anuncioServiceImpl.getAnuncios());
	}

	@GetMapping("findById")
	public ResponseEntity<DTOAnuncio> getById(@RequestParam Long id) {
		return ResponseEntity.ok(anuncioServiceImpl.getById(id).get());
	}

	@DeleteMapping("delete")
	public ResponseEntity<Boolean> delete(@RequestParam Long id) {
		return ResponseEntity.ok(anuncioServiceImpl.delete(id));
	}

	@PostMapping("create")
	public ResponseEntity<Boolean> post(@RequestBody Marca marca) {
		return ResponseEntity.ok(anuncioServiceImpl.save(marca));
	}

	@PutMapping("update")
	public ResponseEntity<Boolean> put(@RequestBody Marca marca) {
		return ResponseEntity.ok(anuncioServiceImpl.update(marca));
	}
}
