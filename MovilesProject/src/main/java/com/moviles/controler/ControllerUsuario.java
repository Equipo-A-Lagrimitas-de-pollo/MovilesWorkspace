package com.moviles.controler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.model.DTO.DTOCreateUser;
import com.moviles.service.impl.UserServiceImpl;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/usuario")
public class ControllerUsuario {
	private final UserServiceImpl userService;

	public ControllerUsuario(UserServiceImpl userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("new")
	public ResponseEntity<Boolean> createUser(@Valid @RequestBody DTOCreateUser dtoCreateUser) {
		if (userService.createUser(dtoCreateUser)) {
			return ResponseEntity.ok().body(true);
		}
		return ResponseEntity.badRequest().body(false);
	}

	@DeleteMapping("delete")
	public ResponseEntity<Boolean> delete(@RequestParam String username) {
		return ResponseEntity.ok(userService.delete(username));
	}

	@GetMapping("/token/refresh")
	public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String authorizationHeader = request.getHeader("AUTHORIZATION");
		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
			userService.refreshingToken(response, authorizationHeader);
		} else {
			throw new RuntimeException("Refresh token is missing");
		}
	}
}