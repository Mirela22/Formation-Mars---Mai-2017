CREATE DATABASE Contact ;
CREATE TABLE civilite ( 
	id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT, 
	Civilité VARCHAR (255) 
);
insert into civilite (civilité) 
values 
('Mme'),
('Mlle'),
('M'),
('Mme et M');

CREATE TABLE contact.client2 ( 
	id2 int unsigned primary key not null auto_increment,
	Nom VARCHAR (255),
    Prenom VARCHAR (255),
    id int unsigned not null

);
alter table client1 drop foreign key fk_civiliteID;
alter table contact.client2
Add constraint fk_Client2_Civilite
foreign key (id)
references contact.civilite(id);

select * from client2;

use Contact;
create table Civilité(
Civilité_Id int unsigned primary key not null auto_increment,
Civil varchar(15)
);