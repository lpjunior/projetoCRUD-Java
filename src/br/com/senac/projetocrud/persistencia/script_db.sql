create database db_senac default character set utf8 collate utf8_general_ci; 

use db_senac;

create table tb_aluno(
	id int primary key auto_increment,
	nome varchar(255) not null,
	email varchar(150) unique not null,
	matricula int not null
);