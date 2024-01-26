package com.moviles.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.model.entity.Movil;
import com.moviles.model.entity.MovilKey;

@RestController
@RequestMapping("api/movil")
public class ControlerMovil {

    @GetMapping("find")
    public List<Movil> get() {

        return new ArrayList<>();
    }

    // Para buscar por marca
    @GetMapping("find/{marca}")
    public List<Movil> get(@PathVariable String marca) {
        return new ArrayList<>();
    }

    @DeleteMapping("delete")
    public boolean delete() {
        return false;
    }

    @PostMapping("create")
    public boolean post() {
        return false;
    }

    @PutMapping("update")
    public boolean put() {
        return false;
    }

    // Ruta la cual aztualizara la puntuacion de cada movil
    @PutMapping("updatePuntuacion/{MovilKey}{puntuacion}")
    public boolean put(@PathVariable MovilKey key, @PathVariable int puntuacion) {
        return false;
    }

}
