create database musique;

use musique; 
create table artiste (
	id INT unsigned primary key auto_increment,
    nom varchar (255)
    );
    
insert into artiste (nom) 
values ('Elton John'),
('Jenifer Lopez'),
('Maria Carrey'),
('John Legend'),
('Matt Pokora');


create table musique.instruments (
	id int unsigned primary key not null auto_increment,
    nom_instrument varchar (255),
    id2 int unsigned, 
    constraint fk_artiste_instruments foreign key (id2) references musique.artiste(id)
    );
    
insert into musique.instruments (nom_instrument,id2)
values ('piano', 1), 
('guitarre',4),
('violon',3);

insert into musique.instruments (nom_instrument,id2)
values 
('tambour',3);

insert into musique.instruments (nom_instrument,id2)
values 
('tambour2', null);

select * from artiste
left join instruments on artiste.id = instruments.id2;