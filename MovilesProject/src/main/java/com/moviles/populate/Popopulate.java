package com.moviles.populate;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moviles.OMs.MovilOM;
import com.moviles.model.DTO.CreatePostDTOIntercambio;
import com.moviles.model.DTO.CreatePostDTOVenta;
import com.moviles.model.DTO.DTOCreateUser;
import com.moviles.model.entity.Modelo;
import com.moviles.model.entity.Movil;
import com.moviles.repositories.MovilRepository;
import com.moviles.repositories.RoleRepository;
import com.moviles.service.impl.AnuncioServiceImpl;
import com.moviles.service.impl.UserServiceImpl;

import jakarta.annotation.PostConstruct;

@Component
public class Popopulate {
    @Autowired
    private final AnuncioServiceImpl anucioService;
    private final UserServiceImpl userService;
    private final RoleRepository roleRepository;
    private final MovilRepository movilRepository;

    public Popopulate(AnuncioServiceImpl anucioService, UserServiceImpl userServiceImpl, RoleRepository roleRepository, MovilRepository movilRepository) {
        this.anucioService = anucioService;
		this.userService = userServiceImpl;
		this.roleRepository = roleRepository;
		this.movilRepository = movilRepository;
    }

    @PostConstruct
    public void init() {
        populate();
    }

    public void populate() {
    	//TODO
//    	roleRepository.save();
    	//userService.createUser(new DTOCreateUser("pepe@gmail.com", "Pepe", "pepepepe", "USER"));
    	//movilRepository.save(MovilOM.createMovil().get(0));
        //System.out.println(anucioService.createPostIntercambio(new CreatePostDTOIntercambio("Pepe",null,null,"02-03-2024","bien","regular")));
    	//anucioService.createPostVenta(new CreatePostDTOVenta("Pepe",null,null,"02-03-2024","bien",10d));
    }
}
