/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.formation.fonctions;

import fr.formation.dbb.beans.UserBean;
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
@ManagedBean(name="UserConnectDBB")
@SessionScoped
   
public class UserConnectDBB implements Serializable{
    
    private static final long serialVersionUID = 1L;
     
    //la fonction qui permet d'afficher les personnes de la BDD
    public static List<UserBean> getUser() throws SQLException  {
        
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
         List<UserBean> ListUsers = new ArrayList<>();
         
         PreparedStatement pstmt = connect.prepareStatement("select * from users");
		ResultSet rs = pstmt.executeQuery();
                
                while (rs.next()) {

			UserBean user = new UserBean();
                        
			user.setId(rs.getInt("Id"));
                        user.setPrenom(rs.getString("Prenom"));
                        user.setNom(rs.getString("Nom"));
                        user.setStatus(rs.getInt("Status"));
                        user.setPassword(rs.getString("password"));
                        user.setTheme(rs.getString("Theme"));
                      
                        ListUsers.add(user);

		}
            //fermeture des ressources
            rs.close();
            pstmt.close();
            connect.close();

	return ListUsers;//on retourne la liste aves toutes les personnes et leurs infos
    }
}