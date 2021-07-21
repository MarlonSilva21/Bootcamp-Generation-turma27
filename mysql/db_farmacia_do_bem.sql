create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(

	id bigint auto_increment,
    
    tipo_de_remedio varchar(20),
    prescricao_medica boolean,
    tarja varchar(15),
    
    primary key(id)
    
);

create table tb_produto(

	id bigint auto_increment,
    
    nome varchar(20) not null,
    tratamento varchar(100) not null,
    efeitos_colaterais varchar(100) not null,
    valor double,
    generico boolean,
    
    categoria_id bigint not null,
    
    primary key (id),
    foreign key (categoria_id) references tb_categoria(id)
	
);

-- populando a tabela tb_categoria

insert into tb_categoria(tipo_de_remedio, prescricao_medica, tarja) values ("Antidepressivo", true, "Preta");
insert into tb_categoria(tipo_de_remedio, prescricao_medica, tarja) values ("Anti-inflamatório", true, "Vermelha");
insert into tb_categoria(tipo_de_remedio, prescricao_medica, tarja) values ("Antibiótico", true, "Vermelha");
insert into tb_categoria(tipo_de_remedio, prescricao_medica, tarja) values ("Analgésico", false, "Não tarjado");
insert into tb_categoria(tipo_de_remedio, prescricao_medica, tarja) values ("Antialérgico", false, "Não tarjado");


-- populando a tabela tb_produtos

alter table tb_produto modify  nome varchar(50);

insert into tb_produto(nome, tratamento, efeitos_colaterais, valor, generico, categoria_id)
values ("Allegra", "Rinite alérgica e urticária", "Não foram observaods efeitos colaterais", 22.50, false , 5);
insert into tb_produto(nome, tratamento, efeitos_colaterais, valor, generico, categoria_id)
values ("Polaramine", "Coriza, espirro, coceira e picada de inseto", "Em pacientes com mais de 60 anos poderá causar maior sonolência,
 vertigem e pressão baixa.", 19.55, false , 5);
insert into tb_produto(nome, tratamento, efeitos_colaterais, valor, generico, categoria_id)
values ("Maleato de dexclorferiramina", "Rinite alérgica, coceiras, pruridos picadas de insetos e urticárias",
 " Sonolência, prurido, sensibilidade na pele, dor de cabeça.", 4.99, true , 5);
insert into tb_produto(nome, tratamento, efeitos_colaterais, valor, generico, categoria_id)
values ("Rivotril", "Ansiedade, depressão e disturbios de sono", "Pode ocausionar dependencia", 26.32, false , 1);
insert into tb_produto(nome, tratamento, efeitos_colaterais, valor, generico, categoria_id)
values ("Dorflex", "Dores no corpo", "Não foram observados efeitos colaterais", 7.50, false , 4);
insert into tb_produto(nome, tratamento, efeitos_colaterais, valor, generico, categoria_id)
values ("Amoxicilina", "Tratamento de infecções", "diarreia, enjoo, vermelhidão e coceira na pele", 22.50, false , 3);
insert into tb_produto(nome, tratamento, efeitos_colaterais, valor, generico, categoria_id)
values ("Ibuprofeno", "age contra inflamações não tão intensas, sendo comumente indicado contra febre e dores diversas.",
 "urticária na pele, sonolência, perda de apetite, retenção de líquidos", 8.50, true , 2);
insert into tb_produto(nome, tratamento, efeitos_colaterais, valor, generico, categoria_id)
values ("Nimesulida", "tendinite e bursite, desconforto muscular e de dente", "diarreias, náusea e vômito. Coceira, erupção cutânea e sudorese", 22.50, false , 2);

select * from tb_produto where valor > 50;

select * from tb_produto where valor > 3 and valor < 60;

select * from tb_produto where nome like "%B%";

select * from tb_produto 
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

select tb_produto.nome, tb_categoria.tipo_de_remedio from tb_produto 
	inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
    where tipo_de_remedio like "%antialergico%";
