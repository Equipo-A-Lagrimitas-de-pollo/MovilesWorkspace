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

import com.moviles.model.DTO.DTOMovil;
import com.moviles.model.DTO.DTOMovilFilter;
import com.moviles.model.DTO.DTORequestPuntuacion;
import com.moviles.model.DTO.DTOcompare;
import com.moviles.model.entity.Movil;
import com.moviles.model.entity.MovilKey;
import com.moviles.service.impl.MovilServiceImpl;

@RestController
@RequestMapping("api/movil")
public class ControlerMovil {

    private final MovilServiceImpl movilService;

    public ControlerMovil(MovilServiceImpl movilService) {
        this.movilService = movilService;
    }

    @GetMapping("find")
    public ResponseEntity<List<DTOMovil>> get() {
        return ResponseEntity.ok(movilService.getAll());
    }

    // Para buscar por marca
    @GetMapping("findByMarca")
    public ResponseEntity<List<DTOMovil>> getByMarca(@RequestParam String Marca) {
        return ResponseEntity.ok(movilService.filterByMarca(Marca));
    }

    @DeleteMapping("delete")
    public ResponseEntity<Boolean> delete(@RequestBody MovilKey key) {
        return ResponseEntity.ok(movilService.delete(key));
    }

    @PostMapping("create")
    public ResponseEntity<Boolean> post(@RequestBody DTOMovil movil) {
        return ResponseEntity.ok(movilService.save(movil));
    }

    @PutMapping("update")
    public ResponseEntity<Boolean> put(@RequestBody DTOMovil movil) {
        return ResponseEntity.ok(movilService.update(movil));
    }

    @GetMapping("filter")
    public ResponseEntity<List<DTOMovil>> getMethodName(@RequestBody DTOMovilFilter movilFilter) {
        return ResponseEntity.ok(movilService.filter(movilFilter));
    }

    // Ruta la cual aztualizara la puntuacion de cada movil
    @PutMapping("updatePuntuacion")
    public ResponseEntity<Boolean> put(@RequestBody DTORequestPuntuacion requestPuntuacion) {
        return ResponseEntity.ok(movilService.updatePuntuacion(requestPuntuacion));
    }

    @GetMapping("topMovil")
    public ResponseEntity<List<DTOMovil>> getTopMovil() {
        return ResponseEntity.ok(movilService.findTopMovil());
    }

    @GetMapping("compareMovile")
    public ResponseEntity<List<DTOMovil>> compareMovile(@RequestBody DTOcompare keys) {
        return ResponseEntity.ok(movilService.compareMovile(keys));
    }

}
