
#use eleve


CREATE TABLE eleve.test ( 
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, 
	Nom VARCHAR (255) , 
    Prenom VARCHAR(255)
);

insert into eleve.test (nom, prenom) 
values 
('Smajovic', 'Mirela'),
('nom2', 'prenom2'),
('nom3','prenom2'),
('nom4', 'prenom4'),
('nom5','prenom5');


select * from eleve.test ;