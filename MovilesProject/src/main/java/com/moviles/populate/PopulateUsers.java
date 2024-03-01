package com.moviles.populate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moviles.model.DTO.DTOCreateUser;
import com.moviles.service.UserService;

import jakarta.annotation.PostConstruct;

@Component
public class PopulateUsers {
    @Autowired
    private final UserService userService;

    public PopulateUsers(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    public void init() {
        populate();
    }

    public void populate() {
        // TODO
        // anucioService.createPost(new PostVenta(1, 1, "Heroico", new Date(10, 10, 2),
        // 0));
        userService.createUser(new DTOCreateUser("pepe@gmail.com", "Pepe", "pepepepe", "USER"));
        userService.createUser(new DTOCreateUser("Jose@gmail.com", "JOSE", "Joselito", "ADMIN"));
        userService.createUser(new DTOCreateUser("Juana@gmail.com", "Juana", "jasdasdasd", "USER"));
        userService.createUser(new DTOCreateUser("fermin@gmail.com", "Fermin", "fermina", "USER"));

    }
}
