create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(

	id bigint auto_increment,
    
    descricao varchar(15),
    sazonal boolean,
	agrotoxico boolean,
    
    primary key(id)

);


create table tb_produto(

	id bigint auto_increment,
	
    nome varchar(20) not null,
    tipo varchar (15),
    sabor varchar(20),
    quantidade int,
    preco int,
    
    categoria_id bigint not null,
    
    primary key (id),
    foreign key  (categoria_id) references tb_categoria(id)
);
-- populando tabela categoria

insert into tb_categoria(descricao, sazonal, agrotoxico) values ("Frutas", true, true);
insert into tb_categoria(descricao, sazonal, agrotoxico) values ("Verduras", false,  true);
insert into tb_categoria(descricao, sazonal, agrotoxico) values ("Legumes", false, true);
insert into tb_categoria(descricao, sazonal, agrotoxico) values ("Vegetais", false, true);
insert into tb_categoria(descricao, sazonal, agrotoxico) values ("Ervas", false, false);


-- populando tabela protudos


insert into tb_produto(nome, tipo, sabor, quantidade, preco, categoria_id) values ("Maçã","Verde","Doce", "1kg", 7.90, 1);
insert into tb_produto(nome, tipo, sabor, quantidade, preco, categoria_id) values ("Maçã","Vermelha","Doce", "1kg", 5.86, 1);
insert into tb_produto(nome, tipo, sabor, quantidade, preco, categoria_id) values ("Jaca","Dura","Doce", "1", 12.50, 1);
insert into tb_produto(nome, tipo, sabor, quantidade, preco, categoria_id) values ("Abacaxi"," ","Cítrico", "1", 7, 1);
insert into tb_produto(nome, tipo, sabor, quantidade, preco, categoria_id) values ("Abóbora"," "," Doce", "1", 6.90, 3);
insert into tb_produto(nome, tipo, sabor, quantidade, preco, categoria_id) values ("Cenoura"," ","Doce", "1kg", 5.40, 3);
insert into tb_produto(nome, tipo, sabor, quantidade, preco, categoria_id) values ("Repolho"," Roxo"," ", "1", 3.45, 2);
insert into tb_produto(nome, tipo, sabor, quantidade, preco, categoria_id) values ("Erva cidreira"," "," Amargo ", "1", 2.90, 5);

select * from tb_produto where preco > 50;

select * from tb_produto where preco > 3 and preco < 60;

select * from tb_produto where nome like "C%";

select * from tb_produto 
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
    
select tb_produto.nome, tb_categoria.descricao from tb_produto 
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
    where tb_categoria.descricao like "F%";
    