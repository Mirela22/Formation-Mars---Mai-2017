package com.ib.BDD;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


@WebServlet("/ListeDesComptes")
public class ListeDesComptes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ListeDesComptes() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher( "/WEB-INF/Client/ListesDesComptes.jsp" ).forward( request, response );
		
		//on recupere les noms et les id de la table sac_personn
		try{
            
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver ok");
            
            Connection cnx = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/societe_agricole_test","root","root");
            System.out.println("Connexion ok");
            
            Statement stat = (Statement)cnx.createStatement();
            System.out.println("Statement ok");
            System.out.println("------------------");
          
            stat.executeQuery("SELECT person_id,person_external_id From sac_person");
            ResultSet resultat = stat.executeQuery("SELECT person_id,person_external_id From sac_person");
            
            stat.executeQuery("SELECT account_customer_id,account_type From sac_accounts");
            ResultSet resultat2 = stat.executeQuery("SELECT account_customer_id, account_type From sac_accounts");
          
            String account_customer_id2 = request.getParameter("clientIdLogin");
           while(resultat.next()){
               System.out.print(resultat.getObject(1)+" "); //account_customer_id
               System.out.print(resultat.getObject(2)+" "); //account_type
              
               int account_customer_id = (int)resultat.getObject(1);
               String account_type = (String)resultat.getObject(2);
              
               listedescomptes.put(account_customer_id, account_type);
               System.out.println();
           }
           resultat.close();
           stat.close();
           cnx.close();
            
        }catch(Exception e){
            System.out.println("erreur");
        }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
