
package fr.formation.jsf.database;

import fr.formation.jsf.personn.PersonnBean;
import java.sql.DriverManager;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="userImm")
@SessionScoped
public class ConnectToDB implements Serializable{
        private static final long serialVersionUID = 1L;
     
    //la fonction qui permet d'afficher les personnes de la BDD
    public List<PersonnBean> getPersonn() throws ClassNotFoundException, SQLException {
        
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
		}
         //récupération des éléments de la BDD  
         List<PersonnBean> ListPersonn = new ArrayList<>();
         
         PreparedStatement pstmt = connect.prepareStatement("select * from listpersonn2");
		ResultSet rs = pstmt.executeQuery();
                
                while (rs.next()) {

			PersonnBean newPersonn = new PersonnBean();
                        
			newPersonn.setID(rs.getInt("Id"));
                        newPersonn.setName(rs.getString("Prenom"));
                        newPersonn.setFirstName(rs.getString("Nom"));
                        newPersonn.setDescription(rs.getString("Description"));
                        
                      

                        ListPersonn.add(newPersonn);

		}
            //fermeture des ressources
            rs.close();
            pstmt.close();
            connect.close();

	return ListPersonn;//on retourne la liste aves toutes les personnes et leurs infos
        
    }
    
    
    public boolean checkLog(String nom, String mdp) {
                
        return true;
    }
    
    
    
    
    
    
    
        
}
