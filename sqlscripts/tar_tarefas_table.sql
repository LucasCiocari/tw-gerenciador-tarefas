create table tar_tarefas
(
	tar_id INT PRIMARY KEY auto_increment,
    tar_titulo VARCHAR(50) NOT NULL,
    tar_descricao VARCHAR(100) DEFAULT NULL,
    tar_data_expiracao DATE NOT NULL,
    tar_concluida BIT DEFAULT FALSE,
    usr_id INT NOT NULL
);