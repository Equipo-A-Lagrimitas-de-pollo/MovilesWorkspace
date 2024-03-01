package com.moviles.OMs;

import java.util.ArrayList;
import java.util.List;

import com.moviles.model.entity.Usuario;

public class UsuarioOM {
    public List<Usuario> createUsuarios() {
        List<Usuario> listaUsuarios = new ArrayList<>();

        listaUsuarios.add(new Usuario("john.doe@example.com", "john_doe", "contrasena123"));
        listaUsuarios.add(new Usuario("jane.smith@example.com", "jane_smith", "password456"));
        listaUsuarios.add(new Usuario("alex.jones@example.com", "alex_jones", "testpass789"));
        listaUsuarios.add(new Usuario("emily.white@example.com", "emily_white", "securepass123"));
        listaUsuarios.add(new Usuario("michael.brown@example.com", "michael_brown", "mypassword567"));
        listaUsuarios.add(new Usuario("olivia.jones@example.com", "olivia_jones", "pass123"));

        return listaUsuarios;
    }
}
