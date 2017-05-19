/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.formation.jsf.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author ib
 */
@ManagedBean (name="fonctionBean")
@RequestScoped
public class Fonctions {
    
         public void removePersonn(int ID1){
        Connection cnx = null;
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("Driver ok");
	            
	            cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tpjsf","root","root");
	            System.out.println("Connexion ok");
	            
	            Statement stat = (Statement)cnx.createStatement();
	            System.out.println("Statement ok");
	            System.out.println("------------------");
	          
	            String query = "DELETE FROM `listpersonn2` WHERE Id=?";
	           PreparedStatement preparedStmt = (PreparedStatement) cnx.prepareStatement(query);
	           
	           preparedStmt.setInt(1,ID1);
	          
	           preparedStmt.executeUpdate();
	
	            ResultSet resultat = stat.executeQuery("SELECT Nom,Prenom,Description From listpersonn2");
	          
	            resultat.close();
	            stat.close();
	            cnx.close();
	            
	        }catch(Exception e){
	            System.out.println("erreur");
	        }
		}
    
}
