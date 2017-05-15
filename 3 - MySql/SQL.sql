CREATE DATABASE TopZik

CREATE TABLE topzik.Artiste (
	id INT PRIMARY KEY NOT NULL,
    Nom VARCHAR (255) , 
    Prenom VARCHAR(255),
    Date_naissance DATE,
    Date_deces DATE,
    information TEXT
);  


ALTER table topzik.artiste add column instrument varchar (255);
ALTER table topzik.artiste modify column nom varchar (55);
INSERT INTO topzik.artiste VALUES (0,'Jackson','Michael','1958-08-29','2009-07-25','Membre des Jackson five','guitarre');
INSERT INTO topzik.artiste VALUES (2,'Adkins','Adel','1988-05-05',NULL,'Née à Londres','Piano');
INSERT INTO topzik.artiste (id, nom, prenom) VALUES (3, 'Sidibe', 'Fanta');
UPDATE topzik.artiste set id=1 where id=0; 

Select * from topzik.artiste;

load data local infile 'C:/Users/ib/Desktop/Classeur1.csv'
into table topzik.artiste
fields terminated by ';'
enclosed by''
lines terminated by '\n' ;



Select 'Voici l\'artiste' as '',nom, prenom from topzik.artiste;

select * from topzik.artiste where prenom ='fanta';

select * from topzik.artiste where (prenom ='michael' or prenom='fanta') and nom ='sidibe' ; */
select * from topzik.artiste where date_naissance < '1996-05-05' and date_naissance > '1990-01-01' ;
select * from topzik.artiste ORDER BY Date_naissance desc;
select * from topzik.artiste where prenom like 'M%' ;
select * from topzik.artiste where date_naissance between '1996-05-05' and '1990-01-01' ;

CREATE TABLE topzik.personnage (
	id INT PRIMARY KEY NOT NULL,
    Nom VARCHAR (255) , 
    Prenom VARCHAR(255)
); 

INSERT INTO topzik.personnage (id,nom, prenom) 
VALUES (1,'Jackson','Michael'),
(2,'Smajovic','Mirela'),
(3,'Sidibe','Fanta'),
(4,'nom2','Manel'),
(5,'nom3','Jeremy'),
(6,'nom4','OUsama'),
(7,'nom5','Edward');

use topzik ;
Select distinct prenom from artiste where prenom   in (select prenom from personnage) ; 

delete from personnage where id = 2 ;

