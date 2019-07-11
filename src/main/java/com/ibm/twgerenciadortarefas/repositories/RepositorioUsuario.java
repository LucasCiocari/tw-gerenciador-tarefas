package com.ibm.twgerenciadortarefas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.twgerenciadortarefas.models.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);

	
}
