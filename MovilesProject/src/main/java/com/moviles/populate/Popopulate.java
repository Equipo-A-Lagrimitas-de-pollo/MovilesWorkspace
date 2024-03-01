package com.moviles.populate;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moviles.model.DTO.CreatePostDTOIntercambio;
import com.moviles.model.DTO.DTOCreateUser;
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

    public Popopulate(AnuncioServiceImpl anucioService, UserServiceImpl userServiceImpl, RoleRepository roleRepository) {
        this.anucioService = anucioService;
		this.userService = userServiceImpl;
		this.roleRepository = roleRepository;
    }

    @PostConstruct
    public void init() {
        populate();
    }

    public void populate() {
    	//TODO
//    	roleRepository.save();
//    	userService.createUser(new DTOCreateUser("pepe@gmail.com", "Pepe", "pepepepe", "USER"));
        anucioService.createPostIntercambio(new CreatePostDTOIntercambio("paco",null,null,new Date(2L),"bien","regular"));
    }
}
