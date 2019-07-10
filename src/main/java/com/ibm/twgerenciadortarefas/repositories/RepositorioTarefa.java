package com.ibm.twgerenciadortarefas.repositories;


import com.ibm.twgerenciadortarefas.models.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {


}
