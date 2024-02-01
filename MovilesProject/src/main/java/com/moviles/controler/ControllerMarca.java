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

import com.moviles.model.entity.Marca;
import com.moviles.service.impl.MarcaServiceImpl;

@RestController
@RequestMapping("api/marca")
public class ControllerMarca {

    private MarcaServiceImpl marcaServiceImpl;

    public ControllerMarca(MarcaServiceImpl marcaServiceImpl) {
        this.marcaServiceImpl = marcaServiceImpl;
    }

    @GetMapping("find")
    public ResponseEntity<List<Marca>> get() {
        return ResponseEntity.ok(marcaServiceImpl.getAll());
    }
    @GetMapping("findById")
    public ResponseEntity<Marca> getById(@RequestParam Long id) {
        return ResponseEntity.ok(marcaServiceImpl.getById(id).get());
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return ResponseEntity.ok(marcaServiceImpl.delete(id));
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody Marca marca) {
        return ResponseEntity.ok(marcaServiceImpl.save(marca));
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody Marca marca) {
        return ResponseEntity.ok(marcaServiceImpl
                .update(marca));
    }
}
