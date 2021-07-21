create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(

	id bigint auto_increment,
    mago boolean,
    guerreiro boolean,
    arqueiro boolean,
    
    primary key (id)

);
-- comentario pra separar aqui

create table tb_personagem (

	id bigint auto_increment,
    
    nome varchar(15) not null,
    poder_de_ataque int,
    poder_defesa int,
	velocidade_de_movimento int,
    mana int,
    furtividade double,
  
    
    classe_id bigint not null,
    
    primary key(id),
    foreign key(classe_id) references tb_classe(id)
);

-- comentario pra separar aqui

insert into tb_classe(patente, mago, guerreiro, arqueiro) values ("Bronze", true, false, false);
insert into tb_classe(patente, mago, guerreiro, arqueiro) values ("Bronze", false, false, true);
insert into tb_classe(patente, mago, guerreiro, arqueiro) values ("Bronze", false, true, false);
insert into tb_classe(patente, mago, guerreiro, arqueiro) values ("Prata", true, false, false);
insert into tb_classe(patente, mago, guerreiro, arqueiro) values ("Ouro", false, true, false);

-- comentario pra separar aqui

 select * from tb_classe;

  insert into tb_personagem(nome, poder_de_ataque, poder_defesa, velocidade_de_movimento, mana, furtividade, classe_id )
  values ("Lynx", 45, 25, 22, 60, 45.6, 1 );
    insert into tb_personagem(nome, poder_de_ataque, poder_defesa, velocidade_de_movimento, mana, furtividade, classe_id )
  values ("Crintine", 90, 86, 15, 20, 5, 3 );
    insert into tb_personagem(nome, poder_de_ataque, poder_defesa, velocidade_de_movimento, mana, furtividade, classe_id )
  values ("Caim", 35, 12, 32, 40, 70, 2 );
    insert into tb_personagem(nome, poder_de_ataque, poder_defesa, velocidade_de_movimento, mana, furtividade, classe_id )
  values ("Torim", 89, 78, 12, 15, 0, 3 );
    insert into tb_personagem(nome, poder_de_ataque, poder_defesa, velocidade_de_movimento, mana, furtividade, classe_id )
  values ("Ming", 41, 35, 32, 80, 41.2, 1 );
    insert into tb_personagem(nome, poder_de_ataque, poder_defesa, velocidade_de_movimento, mana, furtividade, classe_id )
  values ("Atom", 99, 96, 30, 20, 10, 5 );
    insert into tb_personagem(nome, poder_de_ataque, poder_defesa, velocidade_de_movimento, mana, furtividade, classe_id )
  values ("Zaretreus", 65, 15, 28, 72, 28.5, 4 );
    insert into tb_personagem(nome, poder_de_ataque, poder_defesa, velocidade_de_movimento, mana, furtividade, classe_id )
  values ("Aslan", 31, 12, 52, 10, 80, 2 );
 

  select * from tb_personagem;
  
  -- comentario pra separar aqui
  
  select * from tb_personagem where poder_de_ataque > 20;
  
  select * from tb_personagem where poder_defesa < 20 and poder_defesa > 10;
  
  select * from tb_personagem where nome like "%c%";
  
  select * from tb_personagem
	inner join tb_classe on  tb_classe.id = tb_personagem.classe_id;
    
    select tb_personagem.nome, tb_classe.arqueiro, tb_classe.mago, tb_classe.guerreiro from tb_personagem
    inner join  tb_classe on  tb_classe.id = tb_personagem.classe_id
    where tb_classe.id = 3;
    