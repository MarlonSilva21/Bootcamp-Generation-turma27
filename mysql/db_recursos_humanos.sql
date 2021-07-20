create database db_recursos_humanos;

use db_recursos_humanos;

create table tb_funcionarios(
	id bigint auto_increment,
    nome varchar(30),
    funcao varchar(20),
    periodo varchar (10),
    salario double,
    ativo boolean,
    primary key (id)
);

insert into tb_funcionarios(nome, funcao, periodo, salario, ativo) values ("Ednilson Nascimento", "Intrutor GEN", "Diurno", 5500.50, true);
insert into tb_funcionarios(nome, funcao, periodo, salario, ativo) values ("Marcelo Nascimento", "Intrutor GEN", "Diurno", 4500.50, true);
insert into tb_funcionarios(nome, funcao, periodo, salario, ativo) values ("Jessica Nascimento", "Intrutor GEN", "Diurno", 5000.50, true);
insert into tb_funcionarios(nome, funcao, periodo, salario, ativo) values ("Marlon Silva ", "Desenvolvedor java jr", "Flexível", 5000.30, true);
insert into tb_funcionarios(nome, funcao, periodo, salario, ativo) values ("Sabrina  Oliveira ", "Desenvolvedora Android", "Diurno", 4500.20, true);


select * from tb_funcionarios where salario > 4600;
select * from tb_funcionarios where salario < 4600;

update tb_funcionarios  set funcao = "Coordenador de TI" where id = 1;

select * from tb_funcionarios;