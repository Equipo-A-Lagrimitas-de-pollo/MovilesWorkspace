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

import com.moviles.model.entity.Modelo;
import com.moviles.service.impl.ModeloServiceImpl;

@RestController
@RequestMapping("api/modelo")
public class ControllerModelo {

    private ModeloServiceImpl modeloServiceImpl;

    public ControllerModelo(ModeloServiceImpl modeloServiceImpl) {
        this.modeloServiceImpl = modeloServiceImpl;
    }

    @GetMapping("find")
    public ResponseEntity<List<Modelo>> get() {
        return ResponseEntity.ok(modeloServiceImpl.getAll());
    }
    @GetMapping("findById")
    public ResponseEntity<Modelo> getById(@RequestParam Long id) {
        return ResponseEntity.ok(modeloServiceImpl.getById(id).get());
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return ResponseEntity.ok(modeloServiceImpl.delete(id));
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody Modelo modelo) {
        return ResponseEntity.ok(modeloServiceImpl.save(modelo));
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody Modelo modelo) {
        return ResponseEntity.ok(modeloServiceImpl.save(modelo));
    }
}
