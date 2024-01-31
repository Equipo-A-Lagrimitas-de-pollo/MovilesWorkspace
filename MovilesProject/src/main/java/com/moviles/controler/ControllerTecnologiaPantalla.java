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

import com.moviles.model.entity.TecnologiaPantalla;
import com.moviles.service.TecnologiaPantallaService;

@RestController
@RequestMapping("api/tecnologiaPantalla")
public class ControllerTecnologiaPantalla {

    private TecnologiaPantallaService pantallaService;

    public ControllerTecnologiaPantalla(TecnologiaPantallaService pantallaRepository) {
        this.pantallaService = pantallaRepository;
    }

    @GetMapping("find")
    public ResponseEntity<List<TecnologiaPantalla>> get() {
        return ResponseEntity.ok(pantallaService.getAll());
    }
    @GetMapping("findById")
    public ResponseEntity<TecnologiaPantalla> getById(@RequestParam Long id) {
        return ResponseEntity.ok(pantallaService.getById(id).get());
    }

    @DeleteMapping("borrar")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return ResponseEntity.ok(pantallaService.delete(id));
    }

    @PostMapping("crear")
    public ResponseEntity<Boolean> post(@RequestBody TecnologiaPantalla tecnologiaPantalla) {
        return ResponseEntity.ok(pantallaService.save(tecnologiaPantalla));

    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody TecnologiaPantalla tecnologiaPantalla) {
        return ResponseEntity.ok(pantallaService.update(tecnologiaPantalla));

    }
}
