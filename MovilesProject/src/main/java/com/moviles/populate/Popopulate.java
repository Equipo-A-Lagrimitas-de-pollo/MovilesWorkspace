package com.moviles.populate;

import java.sql.Date;

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
    	//TODO
        //anucioService.createPost(new PostVenta(1, 1, "Heroico", new Date(10, 10, 2), 0));
    }
}
