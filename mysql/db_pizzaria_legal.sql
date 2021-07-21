create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(

	id bigint auto_increment,
	
    tipo varchar(7) not null,
    tamanho varchar (10),
    borda varchar (15),
    
    primary key	(id)
);


create table tb_pizza(

	id bigint auto_increment,

	nome varchar(10) not null,
    tempo_de_preparo varchar(20),
    recheio varchar (50),
    recheio_da_borda varchar(20),
    preco double not null,
    
    categoria_id bigint not null,
    
	primary key(id),
    foreign key (categoria_id) references tb_categoria(id)
    
);

-- populando a tabela tb_categoria

insert into tb_categoria(tipo, tamanho, massa) values ("Doce", "Broto","Fina");
insert into tb_categoria(tipo, tamanho, massa) values ("Doce", "Grande","Fina");
insert into tb_categoria(tipo, tamanho, massa) values ("Salgada", "Broto","Fina");
insert into tb_categoria(tipo, tamanho, massa) values ("Salgada", "Grande","grossa");
insert into tb_categoria(tipo, tamanho, massa) values ("2 sabores", "Grande","grossa");

-- populando a tabela tb_pizza

insert into tb_pizza(nome, tempo_de_preparo, recheio, recheio_da_borda, preco, categoria_id) 
values ("Baiana", "45 minutos", "molho de tomate, mussarela, calabresa, ovos, cebola, pimenta", "Catupiry", 40.0, 4);
insert into tb_pizza(nome, tempo_de_preparo, recheio, recheio_da_borda, preco, categoria_id) 
values ("Bacon", "25 minutos", "molho de tomate, mussarela e bacon", "Catupiry", 25.0, 4);
insert into tb_pizza(nome, tempo_de_preparo, recheio, recheio_da_borda, preco, categoria_id) 
values ("Acebolada", "20 minutos", " mussarela, carne bovina e cebola", "Catupiry", 20.0, 3);
insert into tb_pizza(nome, tempo_de_preparo, recheio, recheio_da_borda, preco, categoria_id) 
values ("Filé c/ Cheddar", "25 minutos", "mussarela, carne bovina e cheddar", "Catupiry", 75.0, 4);
insert into tb_pizza(nome, tempo_de_preparo, recheio, recheio_da_borda, preco, categoria_id) 
values ("Romeu e julieta", "40 minutos", "Goiabada com mussarela", "Doce de leite", 50.0, 2);
insert into tb_pizza(nome, tempo_de_preparo, recheio, recheio_da_borda, preco, categoria_id) 
values ("Prestígio", "40 minutos", "Coco, chocolate preto e leite condensado", "Chocolate", 65.0, 2);
insert into tb_pizza(nome, tempo_de_preparo, recheio, recheio_da_borda, preco, categoria_id) 
values ("Brigadeiro", "15 minutos", "Chocolate preto, granulado e leite condensado", "Doce de leite", 20.0, 1);
insert into tb_pizza(nome, tempo_de_preparo, recheio, recheio_da_borda, preco, categoria_id) 
values ("M & M's", "15 minutos", "M&Ms e leite condensado", "Catupiry", 30.0, 1);


select * from tb_pizza where preco > 45;

select * from tb_pizza where preco > 29 and preco < 60;

select * from tb_pizza where nome like "%C%";

select * from tb_pizza 
	inner join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;

select tb_pizza.nome, tb_categoria.tipo from tb_pizza
	inner join tb_categoria on tb_categoria.id =  tb_pizza.categoria_id
    where tipo like "%Do%";

