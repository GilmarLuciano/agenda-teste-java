package com.teste.agenda.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.agenda.entidades.Usuarios;

@RestController
@RequestMapping(value="/usuario")
public class UsuariosRecursos {
	
	@GetMapping
	public ResponseEntity<Usuarios> findAll () {
		Usuarios u = new Usuarios ("maria", "25/01/1980", "30036188877", "rua um", "11 80304059");
		return ResponseEntity.ok().body(u);
	}

}

