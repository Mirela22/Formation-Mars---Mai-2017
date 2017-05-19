package com.ib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Formulaire
 */
@WebServlet("/Formulaire")
public class Formulaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Formulaire() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		

		
		
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset = \"UTF-8\">");
	    out.println("<title> Formulaire </title>");
	    out.println("</head>");
	    out.println("<body>");

	    out.println("<hr>");
	    out.println("<h1> Formulaire </h1>");
	    out.println("<hr>");
	    
	   
	    
	    out.println("<form method= \"POST\">");
	    out.println("<label> Nom </label>");
	    out.println("<input type=\"text\" name=\"nom\">");
	    out.println("<label> Prenom </label>");
	    out.println("<input type=\"text\" name=\"prenom\">");
	   
	    out.println("<label> Ville </label>");
	    out.println("<input type=\"text\" name=\"ville\">");
	    
	    out.println("<input type=\"submit\" value=\"Valider\">");
	    out.println("</form>");
	    

 
	    out.println("</body>");
	    out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		/*User user = new User();
		if (request.getParameter("nom")!=null && request.getParameter("prenom")!=null){
	    	user = new User();
	    	 user.setLogin(request.getParameter("login") );
	    	 session.setAttribute("user", user); //on a passé un objet en attribut
	    }else {
	    	
	    }*/
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset = \"UTF-8\">");
	    out.println("<title> Reponse au formulaire </title>");
	    out.println("</head>");
	    out.println("<body>");
	    
	    if( request.getParameter("nom")!=null && request.getParameter("prenom")!=null && request.getParameter("ville")!=null){
	    	out.println("<p>" + "Nom : " +  request.getParameter("nom") + "</p>");
	    	out.println("<p>" + "Prenom : " + request.getParameter("prenom") + "</p>");
	    	out.println("<p>" + "Ville : " +  request.getParameter("ville") + "</p>");
	    }
	    
	
		
		
	    // login ?
	   if (request.getParameter("nom")!=null && request.getParameter("prenom")!=null){
	    	
	    	 session.setAttribute("login", request.getParameter("nom") );
	    	 session.setAttribute("login2", request.getParameter("prenom") );
	    }else {
	    	
	    }
	   
		
	    
		out.println("<a href=\"/Projet/PageAccueil\"><-- Retour à l'accueil </a>");

	    out.println("</body>");
	    out.println("</html>");
	}

}
