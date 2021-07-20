create database db_estoque_ecommerce;

USE db_estoque_ecommerce;

CREATE TABLE  produtos(
id bigint auto_increment,
tipo varchar(25) not null,
marca varchar(25)not null,
nome varchar (30) not null,
preco decimal(10,2),
pais_de_fabricacao varchar (30),

primary key (id)

);

INSERT INTO produtos(tipo, marca, nome, preco, pais_de_fabricacao) VALUES ("Eletrônico", "Xiaomi","Redmi note 9", 2000,"China");
INSERT INTO produtos(tipo, marca, nome, preco, pais_de_fabricacao) VALUES ("Eletrônico", "Apple"," Iphone", 4300,"Estados Unidos");
INSERT INTO produtos(tipo, marca, nome, preco, pais_de_fabricacao) VALUES ("Eletrônico", "Acer","Notebook Nitro 5", 5300,"Estados Unidos");
INSERT INTO produtos(tipo, marca, nome, preco, pais_de_fabricacao) VALUES ("Eletrônico", "Sony","Playstation 5", 4999,"Japão");
INSERT INTO produtos(tipo, marca, nome, preco, pais_de_fabricacao) VALUES ("Eletrônico", "Microsoft","Xbox series X", 4999,"Japão");
INSERT INTO produtos(tipo, marca, nome, preco, pais_de_fabricacao) VALUES ("Eletrônico", "Razer","Mouse deathadder", 160,"EUA");
INSERT INTO produtos(tipo, marca, nome, preco, pais_de_fabricacao) VALUES ("Eletrônico", "AOC","Monitor Speed ", 1199,"China");
INSERT INTO produtos(tipo, marca, nome, preco, pais_de_fabricacao) VALUES ("Eletrônico", "Kingston","SSD NVMe ", 439,"EUA");

select * from produtos where preco > 500;

select * from produtos where preco < 500;

update produtos  set preco = 999 where id = 7;