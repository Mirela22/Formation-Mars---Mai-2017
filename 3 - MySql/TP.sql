create database TP;

create table eleve (

	nom varchar(255) not null primary key,
    prenom varchar (255),
    date_naissance date,
    ville varchar(255) 
    );
    
create table classe (
	nom_classe varchar (255) not null primary key 
    );
    
create table ville ( 
	nom_ville varchar (255) not null primary key
    );
    
create table matirere ( 
	nom_matiere varchar (255) not null primary key
    );

insert into eleve (nom, prenom, date_naissance, ville)
values ('Sidibe','Fanta', '1991-06-21', 'Nanterre'),
('Smajovic','Mirela', '1992-01-22','PSB'),
('Samake','Fatou', '1991-06-03','Aubervillier'),
('Chatelain','Jeremy', '1991-08-27','Paris');

insert into classe (nom_classe)
values ('CM1'),('CM2'),('CP'),('CE1'),('CE2') ;

insert into ville (nom_ville)
values ('Nanterre'),('PSB'),('Aubervillier'),('Paris');

insert into matirere (nom_matiere)
values ('math'),('francais'),('physique');

alter table eleve 
Add constraint fk_eleve_ville
foreign key (ville)
references ville(nom_ville);

create table note (
	nom_eleve2 varchar (255),
    nom_classe2 varchar (255),
    matiere2 varchar (255),
    note int
    );
    
alter table note 
Add constraint fk_note_eleve
foreign key (nom_eleve2)
references eleve(nom);

alter table note 
Add constraint fk_note_classe
foreign key (nom_classe2)
references classe(nom_classe);

alter table note 
Add constraint fk_note_matiere
foreign key (matiere2)
references matirere(nom_matiere);

insert into note (nom_eleve2, nom_classe2,  matiere2, note)
values ('Sidibe','CM1', 'math',15),
('Sidibe','CM1', 'francais',16),
('Sidibe','CM1', 'physique',9),
('Smajovic','CP', 'math',17),
('Smajovic','CP', 'francais',13),
('Smajovic','CP', 'physique',19),
('samake','CM2', 'math',15),
('Samake','CM2', 'francais',16),
('Samake','CM2', 'physique',19),
('chatelain','CE1', 'math',13),
('chatelain','CE1', 'francais',16),
('chatelain','CE1', 'physique',9);

select * from note;

select nom_eleve2 , avg(note) from note group by nom_eleve2  ; #affiche les moyennes

select * from note
left join eleve on note.id_note = eleve.nom_eleve group by nom_eleve2;


alter table note add column id_note int primary key auto_increment;
