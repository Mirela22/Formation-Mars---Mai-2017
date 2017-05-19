package com.ib.start;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
//import com.mysql.jdbc.Driver;
public class Start {

	public static void main(String[] args) {
		
		try{
			//chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver ok");
			
			// on charge la connection
			Connection cnx= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bdd","root","root");
			System.out.println("connection ok");
			// Création d'un statement 
			Statement stat=(Statement) cnx.createStatement();
			System.out.println("Statement ok");
			//Resutlat a partir du statement
			//ResultSet resultat = stat.executeQuery("SELECT 'Hello, the world!' as 'hello'");
			//stat.executeUpdate(''); // quand on ne renvoie pas de relsutlat						
			/*
			 while(resultat.next()){
							System.out.println(resultat.getObject(1));
				System.out.println(resultat.getString("hello"));
			} */
			//----------------------------------------------------------------------------------------------------------
			//stat.executeUpdate("USE bdd") ;
			/*stat.executeUpdate("CREATE TABLE TODO ("
					+"id INTEGER UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,"
					+"tache1 varchar (255) ,"
					+"tache2 varchar (255),"
					+"tache3 varchar (255));");
			*/		
			//stat.executeUpdate( "INSERT INTO TODO (tache1, tache2, tache3) VALUES ( 'tache numero 1', 'tache numero 2', 'tache numero 3'),('tache numero  4', 'tache numero 5', 'tache numero 6');" ); //requète d'écriture
			//stat.executeQuery("SELECT * from bdd.TODO;");
					
			ResultSet resultat =stat.executeQuery("SELECT * FROM TODO;");
			
			while(resultat.next()){
				System.out.print(resultat.getInt("id")+" ");
				System.out.print(resultat.getString("tache1")+" ");
				System.out.print(resultat.getString("tache2")+" ");
				System.out.print(resultat.getString("tache3")+" ");
				System.out.println();
				
			}
			
			//--------------------------------------------
			
			PreparedStatement prep = (PreparedStatement)cnx.prepareStatement("Select * from bdd);");
			//prep.setString+1,"true";
			//prep.executeUpdate( "INSERT INTO TODO (tache1, tache2, tache3) VALUES ('tache numero prep  8', 'tache numero prep 9', 'tache numero prep 10');" );
			//prep.setString(0, "modif 1");
			while(resultat.next()){
				System.out.print(resultat.getInt("id")+" ");
				System.out.print(resultat.getString("tache1")+" ");
				System.out.print(resultat.getString("tache2")+" ");
				System.out.print(resultat.getString("tache3")+" ");
				System.out.println();
				
			}
			
			//on ferme le statement			
			stat.close();
			//on ferme la connection
			cnx.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
