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

import com.moviles.model.DTO.DTOMarca;
import com.moviles.service.impl.MarcaServiceImpl;

@RestController
@RequestMapping("api/marca")
public class ControllerMarca {

    private MarcaServiceImpl marcaServiceImpl;

    public ControllerMarca(MarcaServiceImpl marcaServiceImpl) {
        this.marcaServiceImpl = marcaServiceImpl;
    }

    @GetMapping("find")
    public ResponseEntity<List<DTOMarca>> get() {
        return ResponseEntity.ok(marcaServiceImpl.getAll());
    }

    @GetMapping("findByNombre")
    public ResponseEntity<DTOMarca> getById(@RequestParam String nombre) {
        return ResponseEntity.ok(marcaServiceImpl.getByNombre(nombre).get());
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestParam String nombre) {
        return ResponseEntity.ok(marcaServiceImpl.deleteByNombre(nombre));
    }
    

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody DTOMarca marca) {
        return ResponseEntity.ok(marcaServiceImpl.save(marca));
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody DTOMarca marca) {
        return ResponseEntity.ok(marcaServiceImpl
                .update(marca));
    }
}
