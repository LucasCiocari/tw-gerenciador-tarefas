create database tw_gerenciador_tarefas;

use tw_gerenciador_tarefas;

create table tar_tarefas
(
	tar_id INT PRIMARY KEY auto_increment,
    tar_titulo VARCHAR(50) NOT NULL,
    tar_descricao VARCHAR(100) DEFAULT NULL,
    tar_data_expiracao DATE NOT NULL,
    tar_concluida BIT DEFAULT FALSE
);

insert into tar_tarefas(tar_titulo, tar_descricao, tar_data_expiracao)
values('Tarefa 1', 'descricao da tarefa 1', now());

select * from tar_tarefas;

alter table tar_tarefas drop column tar_data_expiracao;

drop table tar_tarefas;

create table usr_usuarios
(
	usr_id int primary key auto_increment,
    usr_email varchar(100) not null,
    usr_senha varchar(100) not null
);

set global time_zone = '-3:00';

delete from tar_tarefas;

alter table tar_tarefas add column usr_id int not null;

alter table tar_tarefas add constraint fk_tar_tarefas_usr_usuarios FOREIGN KEY (usr_id) REFERENCES usr_usuarios(usr_id);

























