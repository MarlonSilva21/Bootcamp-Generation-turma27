create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(

	id bigint auto_increment,
    
    tipo varchar(20),
    descricao varchar(20) not null,
    estoque boolean,
    
    primary key(id)

);

create table tb_produto(

	id bigint auto_increment,
    
    nome varchar(30) not null,
    marca varchar(20) not null,
    quantidade double,
    biodegradavel boolean,
	preco decimal(10, 2),
    
    categoria_id bigint not null,
    
	primary key(id),
    foreign key (categoria_id) references tb_categoria(id)

);
 -- alter table tb_produto modify quantidade varchar(10);

insert into tb_categoria(tipo, descricao, estoque) values ("Construção","Materiais com função estrutural",true);
insert into tb_categoria(tipo, descricao, estoque) values ("Decoração"," Quadros, tintas, papeis de parede etc..  para decoração",true);
insert into tb_categoria(tipo, descricao, estoque) values ("Acabamento","Janelas, portas, massa corrida etc...",true);
insert into tb_categoria(tipo, descricao, estoque) values ("Elétrico","Fios, cabos, eletrodutos, interruptores etc...",true);
insert into tb_categoria(tipo, descricao, estoque) values ("Hidráulico","Torneiras, tubos e conexões, registros etc...",true);


insert into tb_produto(nome, marca, quantidade, biodegradavel, preco, categoria_id) 
values ("Cimento", "Votoran", "50kg", false, 30.99, 1);
insert into tb_produto(nome, marca, quantidade, biodegradavel, preco, categoria_id) 
values ("Bloco de concreto", " ", "1", false, 2.59, 1);
insert into tb_produto(nome, marca, quantidade, biodegradavel, preco, categoria_id) 
values ("Massa corrida", "Coral", "25kg", false, 73.90, 3);
insert into tb_produto(nome, marca, quantidade, biodegradavel, preco, categoria_id) 
values ("Tinta acrílica", " Coral", "18L", true, 393.80, 2);
insert into tb_produto(nome, marca, quantidade, biodegradavel, preco, categoria_id) 
values ("Papel de parede", "arthouse", "10M", false, 290.69, 2);
insert into tb_produto(nome, marca, quantidade, biodegradavel, preco, categoria_id) 
values ("Porta", "Eucatex", "1", true, 638.43, 3);
insert into tb_produto(nome, marca, quantidade, biodegradavel, preco, categoria_id) 
values ("Tubos", "Tigre", "3m", false, 69.90, 4);
insert into tb_produto(nome, marca, quantidade, biodegradavel, preco, categoria_id) 
values ("Torneira p/ cozinha", "Lorenzetti", "1", false, 999.90, 5);


select * from tb_produto where preco > 50;

select * from tb_produto where preco > 3 and preco < 60;

select * from tb_produto where nome like "C%";

select * from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
    
select tb_produto.nome, tb_categoria.tipo from tb_produto
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id 
    where tb_categoria.tipo like "De%";