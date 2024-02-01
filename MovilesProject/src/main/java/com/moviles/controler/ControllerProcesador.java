package com.moviles.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.model.entity.Procesador;
import com.moviles.service.ProcesadorService;

@RestController
@RequestMapping("api/procesador")
public class ControllerProcesador {

    private final ProcesadorService procesadorService;

    public ControllerProcesador(ProcesadorService procesadorService) {
        this.procesadorService = procesadorService;
    }

    @GetMapping("find")
    public ResponseEntity<java.util.List<Procesador>> get() {
        return ResponseEntity.ok(procesadorService.getAll());
    }
    @GetMapping("findById")
    public ResponseEntity<Procesador> getById(@RequestParam Long id) {
        return ResponseEntity.ok(procesadorService.getById(id).get());
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestParam Long id) {
        return ResponseEntity.ok(procesadorService.delete(id));
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody Procesador procesador) {
        return ResponseEntity.ok(procesadorService.save(procesador));
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody Procesador updateObject) {
        return ResponseEntity.ok(procesadorService.update(updateObject));
    }

}
