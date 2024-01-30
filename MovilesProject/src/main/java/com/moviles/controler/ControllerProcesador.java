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
import com.moviles.service.ProcesadorDataService;

@RestController
@RequestMapping("api/procesador")
public class ControllerProcesador {

    private final ProcesadorDataService procesadorService;

    public ControllerProcesador(ProcesadorDataService procesadorService) {
        this.procesadorService = procesadorService;
    }

    @GetMapping("find")
    public ResponseEntity<java.util.List<Procesador>> get() {
        return ResponseEntity.ok(procesadorService.getAll());
    }

    @DeleteMapping("delete")
    public boolean delete(@RequestParam Long id) {
        return procesadorService.delete(id);
    }

    @PostMapping("create")
    public boolean post(@RequestBody Procesador procesador) {
        return procesadorService.save(procesador);
    }

    @PutMapping("update")
    public boolean put(@RequestBody Procesador updateObject) {
        return procesadorService.update(updateObject);
    }

}
