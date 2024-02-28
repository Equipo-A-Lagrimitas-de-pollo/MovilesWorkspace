package com.moviles.populate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

    }
}
