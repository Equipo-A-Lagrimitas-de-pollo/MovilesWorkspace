package com.moviles.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.model.DTO.DTOMovilFilter;
import com.moviles.model.entity.Movil;
import com.moviles.model.entity.MovilKey;
import com.moviles.service.MovilService;

@RestController
@RequestMapping("api/movil")
public class ControlerMovil {

    private final MovilService movilService;

    public ControlerMovil(MovilService movilService) {
        this.movilService = movilService;
    }

    @GetMapping("find")
    public ResponseEntity<List<Movil>> get() {
        return ResponseEntity.ok(movilService.getAll());
    }

    // Para buscar por marca
    @GetMapping("find/{marca}")
    public ResponseEntity<List<Movil>> get(@RequestParam String marca) {
        return ResponseEntity.ok(movilService.filterByMarca(marca));
    }

    @DeleteMapping("delete")
    public boolean delete(@RequestParam MovilKey key) {
        return movilService.delete(key);
    }

    @PostMapping("create")
    public boolean post(@RequestBody Movil movil) {
        return movilService.save(movil);
    }

    @PutMapping("update")
    public boolean put(@RequestBody Movil movil) {
        return movilService.update(movil);
    }

    @GetMapping("filter/{marca}{modelo}{precio}")
    public ResponseEntity<List<Movil>> getMethodName(@RequestBody DTOMovilFilter movilFilter) {
        return ResponseEntity.ok(new ArrayList<Movil>());
    }

    // Ruta la cual aztualizara la puntuacion de cada movil
    @PutMapping("updatePuntuacion/{MovilKey}{puntuacion}")
    public boolean put(@PathVariable MovilKey key, @RequestParam int puntuacion) {
        return false;
    }

}
