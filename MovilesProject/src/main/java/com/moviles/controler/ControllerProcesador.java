package com.moviles.controler;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.model.entity.Procesador;
import com.moviles.service.impl.ProcesadorDataServiceImpl;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("api/procesador")
public class ControllerProcesador {

    private ProcesadorDataServiceImpl procesadorService = new ProcesadorDataServiceImpl();

    @GetMapping("find")
    public java.util.List<Procesador> get() {
        return procesadorService.getAll();
    }

    @DeleteMapping("delete")
    public void delete(@PathParam(value = "") Long id) {
        procesadorService.delete(id);
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
