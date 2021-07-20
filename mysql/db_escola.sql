create database db_escola;

use db_escola;

create table tb_estudantes(
	
    id bigint auto_increment,
	nome varchar(40),
    cpf varchar(11),
    responsavel varchar(40),
    turma varchar (15),
    periodo varchar(15),
    nota_final int,
    
    primary key (id)
);

insert into tb_estudantes(nome, cpf, responsavel, turma, periodo, nota_final) values ("Ana julia santos", "83564913984", "Maria santos", "turma27java", "integral", 8.2);
insert into tb_estudantes(nome, cpf, responsavel, turma, periodo, nota_final) values ("Alan Kardec", "83522318494", "Joana Kardec", "turma27java", "integral", 6.2);
insert into tb_estudantes(nome, cpf, responsavel, turma, periodo, nota_final) values ("Elon Musk", "56729878444", "Elen Musk", "turma27java", "integral", 4.7);
insert into tb_estudantes(nome, cpf, responsavel, turma, periodo, nota_final) values ("Sophia araújo", "12789318494", "Augusto araújo", "turma27java", "integral", 9.6);
insert into tb_estudantes(nome, cpf, responsavel, turma, periodo, nota_final) values ("Diego silva", "86662348494", "Rose Silva", "turma27java", "integral", 8.2);
insert into tb_estudantes(nome, cpf, responsavel, turma, periodo, nota_final) values ("Jessica lopes", "56787118494", "Maria lopes", "turma27java", "integral", 6.2);
insert into tb_estudantes(nome, cpf, responsavel, turma, periodo, nota_final) values ("Marina oliveira", "83529004594", "José de oliveira", "turma27java", "integral", 4.5);
insert into tb_estudantes(nome, cpf, responsavel, turma, periodo, nota_final) values ("Marlon Silva", "84442678494", "Marlon silva ", "turma27java", "integral", 10);


select * from tb_estudantes where nota_final > 7;

select * from tb_estudantes where nota_final < 7;

update tb_estudantes set nota_final = 8.9 where id = 6;


