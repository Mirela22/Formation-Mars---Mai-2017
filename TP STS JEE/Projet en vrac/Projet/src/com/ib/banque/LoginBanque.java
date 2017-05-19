package com.ib.banque;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginBanque")
public class LoginBanque extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PUBLIC_PATH ="/login.jsp" ;
	private static final String PRIVATE_PATH = "/WEB-INF/banque/noLogin.jsp";
	private static final String SESSION_USER = "session";
 
    public LoginBanque() {
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
		
		// insertion lien avec la base de donnée 
		// test des informations 
		// si MDP incorecte M !!!!
		// si Ok redirige vers private_path
		/*
		if email && MDP correspondent aux email et MDP de la been alors : va vers nologin 
		sinon MESSAGE erreur
*/
		
		
	}

}
