package com.teste.agenda.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.agenda.entidades.Usuarios;

public interface UsuariosRepositor extends JpaRepository<Usuarios, Long> {

}
