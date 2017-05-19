
package fr.formation.jsf.personn;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean (name="PersonnBean")
@RequestScoped

//Création de la bean personne
public class PersonnBean {
    private int ID;
    private String name;
    private String firstName;
    private String description;
    private String password;
    private int status;
    
    //creation des constructeurs 
     public PersonnBean(){
     }//constructeur par défaut

    //création des getters et setters
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    
    //la fonction qui permet d'ajouter une personne à la BDD
    public void addPersonn( String firstName, String name, String description ){
        Connection cnx = null;
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("Driver ok");
	            
	            cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tpjsf","root","root");
	            System.out.println("Connexion ok");
	            
	            Statement stat = (Statement)cnx.createStatement();
	            System.out.println("Statement ok");
	            System.out.println("------------------");
	          
	            String query = "INSERT INTO listpersonn2 SET Nom=?,Prenom=?,Description=?";
	           PreparedStatement preparedStmt = (PreparedStatement) cnx.prepareStatement(query);
	           
	           preparedStmt.setString(1, firstName);
	           preparedStmt.setString(2, name);
	           preparedStmt.setString(3, description);
	       	           
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
