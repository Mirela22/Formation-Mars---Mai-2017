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
 * Servlet implementation class PageAccueil
 */
@WebServlet("/PageAccueil")
public class PageAccueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageAccueil() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter(); 
		HttpSession session = request.getSession();
		
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset = \"UTF-8\">");
	    out.println("<title> Accueil </title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<hr>");
	    out.println("<h1> ACCUEIL </h1>");
	    out.println("<hr>");
	    
	    // login ?
	    if (session.getAttribute( "login" )!=null && session.getAttribute( "login2" )!=null ){
	    	 out.println("<h3> Bonjour </h3> " +  session.getAttribute( "login" ) + "<span>  </span>" + session.getAttribute( "login2" ) );
	    	
	    }else {
	    	out.println("<a href=\"/Projet/Formulaire\"> Remplissez le formulaire </a> ");
	    }
	    out.println("<hr>");
	    out.println("<a href=\"/Projet/LogOut\">< LOG OUT </a>");
	    
	    out.println("<hr>");
	    out.println("</body>");
	    out.println("</html>");
	    
	  //this.getServletContext().getRequestDispatcher( "/WEB-INF/Accueil.jsp" ).forward( request, response );	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
		
	}

}
