/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.formation.fonctions;

import fr.formation.dbb.beans.PersonBean;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author ib
 */

@ManagedBean(name="PersonConnectDBB2")
@SessionScoped
public class PersonConnectDBB implements Serializable{
    
    private static final long serialVersionUID = 1L;
     
    //la fonction qui permet d'afficher les personnes de la BDD
    public static List<PersonBean> getPersonn() throws SQLException  {
        
        //connection à la base de données
        Connection connect = null;
        String url = "jdbc:mysql://localhost:3306/tpjsf";

		String username = "root";
		String password = "root";
                
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    System.out.println("Driver ok");
                    connect = DriverManager.getConnection(url, username, password);
                    System.out.println("Connection établie"+connect);
                    } catch (SQLException ex) {
			System.out.println("il y a une erreur");
			System.out.println(ex.getMessage());
		} catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonConnectDBB.class.getName()).log(Level.SEVERE, null, ex);
        }
         //récupération des éléments de la BDD  
         List<PersonBean> ListPersonn = new ArrayList<>();
         
         PreparedStatement pstmt = connect.prepareStatement("select * from listpersonn");
		ResultSet rs = pstmt.executeQuery();
                
                while (rs.next()) {

			PersonBean newPersonn = new PersonBean();
                        
			newPersonn.setId(rs.getInt("Id"));
                        newPersonn.setPrenom(rs.getString("Prenom"));
                        newPersonn.setNom(rs.getString("Nom"));
                        newPersonn.setDescription(rs.getString("Description"));
                        newPersonn.setPassword(rs.getString("password"));
                      
                        ListPersonn.add(newPersonn);

		}
            //fermeture des ressources
            rs.close();
            pstmt.close();
            connect.close();

	return ListPersonn;//on retourne la liste aves toutes les personnes et leurs infos
    }
    
    public void test(){
        
    }
    
}
