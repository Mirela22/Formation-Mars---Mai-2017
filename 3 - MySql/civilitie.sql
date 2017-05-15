CREATE  DATABASE Contact2;

Use contact2;
 CREATE TABLE civilite (
	id INT      UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	Civilite    VARCHAR(255)
   );

INSERT INTO civilite (civilite)
VALUES
('Mme'),
('Mlle'),
('Mr'),
('Mme et M');

CREATE TABLE contact2.client1 (
	id2 INT UNSIGNED PRIMARY KEY NOT NULL AUTO_INCREMENT,
	Nom    VARCHAR(255),
	Prenom VARCHAR (255),
    id_client int unsigned not null,
   constraint fk_client_civilite foreign key (id_client) references contact2.civilite(id)
);

alter table client drop foreing key fk_civiliteID;

INSERT INTO contact2.client1 (nom, prenom, id_client)
VALUES
('nomgarçon', 'prenomgarçon',3),
('nomgarçon2', 'prenomgarçon2',3),
('nomfllette2', 'prenomfillette2',2),
('nomfemme', 'prenomfemme',1),
('nomfllette3', 'prenomfillette3',2);


select civilite.civilite, client1.nom , client1.prenom  from client1
inner join civilite on client1.id_client = civilite.id 
where civilite.civilite ='mlle';