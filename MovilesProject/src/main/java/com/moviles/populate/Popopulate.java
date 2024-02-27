package com.moviles.populate;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moviles.model.entity.PostVenta;
import com.moviles.service.impl.AnuncioServiceImpl;

import jakarta.annotation.PostConstruct;

@Component
public class Popopulate {
    @Autowired
    private final AnuncioServiceImpl anucioService;

    public Popopulate(AnuncioServiceImpl anucioService) {
        this.anucioService = anucioService;
    }

    @PostConstruct
    public void init() {
        populate();
    }

    public void populate() {
        List<PostVenta> postVentas = new ArrayList<>();

        postVentas.add(new PostVenta("1", 1, 1, "Perfecto", Date.valueOf(LocalDate.now()), 20));
        anucioService.crearAnuncioNoComplete(postVentas.get(0));
    }
}
