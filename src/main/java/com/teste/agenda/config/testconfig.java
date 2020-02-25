package com.teste.agenda.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.teste.agenda.entidades.Usuarios;
import com.teste.agenda.recursos.UsuariosRecursos;

@Configuration
@Profile ("test")
public class testconfig implements CommandLineRunner {

	@Autowired
	private UsuariosRecursos usuariosRecursos;

	@Override
	public void run(String... args) throws Exception {
		
		Usuarios u1 = new Usuarios(null, "maria", "25/01/1980", "30036188877", "rua um", "11", "rua", "casa", "não tem", "berrini", "sao paulo", "09870-830", "980304010", "11", "055", "10", "20", "null");
		Usuarios u2 = new Usuarios(null, "jose", "25/01/1970", "30036188877", "rua um", "11", "rua", "casa", "não tem", "berrini", "sao paulo", "09870-830", "980304010", "11", "055", "10", "20", "null");
	
		usuariosRecursos.saveAll(Arrays.asList(u1, u2));
		 
	}
}
