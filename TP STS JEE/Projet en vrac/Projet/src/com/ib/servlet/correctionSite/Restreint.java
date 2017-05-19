package com.ib.servlet.correctionSite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Restreint")
public class Restreint extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PUBLIC_PATH ="/Accueil2.jsp" ;
	private static final String PRIVATE_PATH = "/WEB-INF/profil.jsp";
	private static final String SESSION_USER = "session";
  
	
    public Restreint() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		if (session.getAttribute(SESSION_USER)==null){
			response.sendRedirect(request.getContextPath()+PUBLIC_PATH);
		} else {
			this.getServletContext().getRequestDispatcher( PRIVATE_PATH ).forward( request, response );

        }	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
