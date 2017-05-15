create database TP;
use TP;

create table classe (
	nom_classe varchar (255),
    id_classe int unsigned not null primary key auto_increment
    ); 
insert into classe (nom_classe) values ('CM1'),('CM2'),('CP'),('CE1'),('CE2') ;
select * from classe;
create table ville ( 
	nom_ville varchar (255),
    id_ville int unsigned not null primary key auto_increment); 
insert into ville (nom_ville) values ('Nanterre'),('PSB'),('Aubervillier'),('Paris');
select * from ville;
create table matiere ( 
	nom_matiere varchar (255),
    id_matiere int unsigned not null primary key auto_increment
    ); 
insert into matiere (nom_matiere) values ('math'),('francais'),('physique');
select * from matiere;

create table eleve (
	nom varchar(255),
    prenom varchar (255),
    date_naissance date,
    ville int unsigned not null,
    id_eleve int unsigned not null primary key auto_increment,
    constraint fk_eleve_ville
    foreign key (ville) /* on indique sur quelle colonne on met la clé */
    references ville(id_ville)
	);
    
insert into eleve (nom, prenom, date_naissance, ville)
values ('Sidibe','Fanta', '1991-06-21', 1),
('Smajovic','Mirela', '1992-01-22',2),
('Samake','Fatou', '1991-06-03',3),
('Smajovic','Haris', '2009-03-14',1),
('Calma','Wendy', '2008-03-14',4);
select * from eleve join (ville) on eleve.ville = ville.id_ville; 
select nom, prenom, date_naissance, nom_ville from eleve join (ville) on eleve.ville = ville.id_ville;    
update eleve set ville = 2 where id_eleve = 4;

create table note (
	id_note int unsigned not null primary key auto_increment,
    id_eleve int not null,
	nom_eleve2 int unsigned not null,
    prenom_eleve2 int unsigned not null,
    nom_classe2 int unsigned not null,
    matiere2 int unsigned not null,
    note int unsigned not null
    );
alter table note 
Add constraint fk_note_classe
foreign key (nom_classe2)
references classe(id_classe);

alter table note 
Add constraint fk_note_matiere
foreign key (matiere2)
references matiere(id_matiere);

select * from note;

alter table note modify id_eleve int unsigned not null;
alter table note drop column nom_eleve2;
alter table note drop column prenom_eleve2;

alter table note 
Add constraint fk_note_eleve
foreign key (id_eleve)
references eleve(id_eleve);

insert into note (id_eleve, nom_classe2 , matiere2, note) 
values 
(1,1,1 ,15),
(1,1,2,15),
(1,1, 3,12),
(4,3, 1,13),
(4,3, 2,13),
(4,3, 3,19),
(3,2, 1,11),
(3,2, 2,16),
(3,2, 3,18),
(2,4, 1,16),
(2,4,2,16),
(2,4,2,19),
(5,5,3,13),
(5,5,2,14),
(5,5,3,9),
(5,5, 2,14);


select prenom, nom, avg(note), nom_ville from note inner join (ville, eleve, classe, matiere) on (note.id_eleve=eleve.id_eleve 
and note.nom_classe2=classe.id_classe and note.matiere2=matiere.id_matiere and eleve.ville=ville.id_ville) group by prenom;

select prenom, nom, avg(note), nom_ville from note join (ville, eleve, classe, matiere) on (note.id_eleve=eleve.id_eleve 
and note.nom_classe2=classe.id_classe and note.matiere2=matiere.id_matiere and eleve.ville=ville.id_ville) group by prenom
having avg(note) < 14.5; #mystere, ne marche que avec group by nom
 

select prenom, nom, avg(note), nom_ville, nom_classe from note join (ville, eleve, classe, matiere) on (note.id_eleve=eleve.id_eleve 
and note.nom_classe2=classe.id_classe and note.matiere2=matiere.id_matiere and eleve.ville=ville.id_ville) where (classe.nom_classe='CM2' or classe.nom_classe='CP') 
group by prenom
 ;
select prenom, nom, avg(note), nom_ville, nom_classe 
from note join (ville, eleve, classe, matiere) 
on (note.id_eleve=eleve.id_eleve 
and note.nom_classe2=classe.id_classe 
and note.matiere2=matiere.id_matiere 
and eleve.ville=ville.id_ville) 
where ((classe.nom_classe='CM2' or classe.nom_classe='CP') and eleve.date_naissance<'1998-01-01') 
group by prenom
;
select prenom, nom, avg(note), nom_ville, nom_classe 
from note join (ville, eleve, classe, matiere) 
on (note.id_eleve=eleve.id_eleve 
and note.nom_classe2=classe.id_classe 
and note.matiere2=matiere.id_matiere 
and eleve.ville=ville.id_ville) 
where eleve.date_naissance<'1998-01-01'
group by prenom
;

alter table note add column avgnote int unsigned;

select count(note) 
from note 
having avg(note)>10;
