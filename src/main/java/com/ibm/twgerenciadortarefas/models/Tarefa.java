package com.ibm.twgerenciadortarefas.models;


import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tar_tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tar_id")
    private Long id;

    @Column(name = "tar_titulo", length = 50, nullable = false)
    @NotNull(message = "O campo título é obrigatório.")
    private String titulo;
    @Column(name = "tar_descricao", length = 100, nullable = true)
    private String descricao;
    @Column(name = "tar_data_expiracao", nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dataExpiracao;
    @Column(name = "tar_concluida", nullable = false)
    private boolean concluida = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataExpiracao() {
        return dataExpiracao;
    }

    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}
