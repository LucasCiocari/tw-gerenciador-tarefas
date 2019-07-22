package com.ibm.twgerenciadortarefas.repositories;


import com.ibm.twgerenciadortarefas.models.Tarefa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {

	@Query("SELECT t FROM Tarefa t WHERE t.usuario.email = :emailUsuario")
	List<Tarefa> carregarTarefasPorUsuario(@Param("emailUsuario") String email);

}
