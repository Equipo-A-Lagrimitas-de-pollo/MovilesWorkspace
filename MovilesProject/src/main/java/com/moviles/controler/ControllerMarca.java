package com.moviles.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.model.entity.Marca;

@RestController
@RequestMapping("api/marca")
public class ControllerMarca {

    @GetMapping("find")
    public List<Marca> get() {
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
}
