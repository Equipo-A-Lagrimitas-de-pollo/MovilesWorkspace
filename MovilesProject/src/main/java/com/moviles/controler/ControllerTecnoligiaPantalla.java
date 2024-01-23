package com.moviles.controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/tecnologiaPantalla")
public class ControllerTecnoligiaPantalla {

    @GetMapping("find")
    public void get() {

    }

    @DeleteMapping("borrar")
    public void delete() {

    }

    @PostMapping("crear")
    public void post() {

    }

    @PutMapping("update")
    public void put() {

    }
}
