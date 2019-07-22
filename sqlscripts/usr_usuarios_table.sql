create table usr_usuarios
(
	usr_id int primary key auto_increment,
    usr_email varchar(100) not null,
    usr_senha varchar(100) not null
);