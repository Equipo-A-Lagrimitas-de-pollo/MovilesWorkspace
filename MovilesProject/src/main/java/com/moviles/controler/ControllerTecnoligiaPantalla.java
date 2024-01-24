package com.moviles.controler;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.model.entity.TecnologiaPantalla;

@RestController
@RequestMapping("api/tecnologiaPantalla")
public class ControllerTecnoligiaPantalla {

    @GetMapping("find")
    public java.util.List<TecnologiaPantalla> get() {
        return new ArrayList<>();
    }

    @DeleteMapping("borrar")
    public boolean delete() {
        return false;
    }

    @PostMapping("crear")
    public boolean post() {
        return false;

    }

    @PutMapping("update")
    public boolean put() {
        return false;

    }
}
