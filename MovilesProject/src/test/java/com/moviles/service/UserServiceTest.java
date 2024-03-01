package com.moviles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.moviles.model.entity.Usuario;

@SpringBootTest
class UserServiceTest {
	@Autowired
	private UserService userService;

	private static List<Usuario> listaUsers; // se pronuncia iusers
	// me da igual como se pronuncie

	/*
	 * 
	 * @BeforeAll
	 * static void poblar(@Autowired UserService userService) {
	 * UserServiceTest.listaUsers = new UsuarioOM().createUsuarios();
	 * for (Usuario usuario : listaUsers) {
	 * userService.save(usuario);
	 * }
	 * }
	 * 
	 * @Test
	 * void test() {
	 * Usuario usuario = new Usuario("13212313", "Antonio", "Gomez");
	 * userService.save(usuario);
	 * }
	 * 
	 * 
	 * 
	 */

	// private static List<Usuario> listaUsers; //se pronuncia iusers
	// @BeforeAll
	// static void poblar(@Autowired UserService userService) {
	// UserServiceTest.listaUsers = new UsuarioOM().createUsuarios();
	// for (Usuario usuario : listaUsers) {
	// userService.save(usuario);
	// }
	// }
	// @Test
	// void test() {
	// Usuario usuario = new Usuario("13212313", "Antonio","Gomez");
	// userService.save(usuario);
	// }

}
