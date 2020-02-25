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
		Usuarios u = new Usuarios (1L, "maria", "25/01/1980", "30036188877", "rua um", "11", "rua", "casa", "não tem", "berrini", "sao paulo", "09870-830", "980304010", "11", "055", "10", "20", "null");
		return ResponseEntity.ok().body(u);
	}

}

