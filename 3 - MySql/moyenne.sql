create database moyenne;
create table notes  (
	id int unsigned not null primary key auto_increment,
    prenom varchar (255),
    matiere varchar (255),
    note int unsigned 
    );
    
insert into notes (prenom, matiere, note)
values ('un', 'maths', 19),
('un', 'francais', 3),
('un', 'geo', 15),
('deux', 'maths', 9),
('deux', 'maths', 19),
('deux', 'francais', 12),
('deux', 'geo', 4);

select prenom , avg(note) from notes group by prenom;

#il y a dautres fonctions d'agrégations
#having = toujour avec un operateur d'agrégations : having avg (note)>9

select prenom , avg(note) from notes group by prenom 
having avg(note) > 12;