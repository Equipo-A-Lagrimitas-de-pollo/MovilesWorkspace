package com.moviles.populate;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moviles.model.DTO.DTOCreateUser;
import com.moviles.model.entity.ERole;
import com.moviles.model.entity.RoleEntity;
import com.moviles.repositories.RoleRepository;
import com.moviles.service.UserService;

import jakarta.annotation.PostConstruct;

@Component
public class PopulateUsers {
    @Autowired
    private final UserService userService;
    private final RoleRepository roleRepository;

    public PopulateUsers(UserService userService, RoleRepository roleRepository) {
        this.userService = userService;
		this.roleRepository = roleRepository;
    }

    @PostConstruct
    public void init() {
        populate();
    }

    public void populate() {
        // TODO
        // anucioService.createPost(new PostVenta(1, 1, "Heroico", new Date(10, 10, 2),
        // 0));
//    	Arrays.asList(ERole.values()).forEach(role->{
//    		roleRepository.save(new RoleEntity(role));
//    	});
        //userService.createUser(new DTOCreateUser("pepe@gmail.com", "Pepe", "pepepepe", "USER"));
//        userService.createUser(new DTOCreateUser("Jose@gmail.com", "JOSE", "Joselito", "ADMIN"));
//        userService.createUser(new DTOCreateUser("Juana@gmail.com", "Juana", "jasdasdasd", "USER"));
//        userService.createUser(new DTOCreateUser("fermin@gmail.com", "Fermin", "fermina", "USER"));

    }
}
