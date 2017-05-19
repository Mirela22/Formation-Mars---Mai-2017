package com.ib.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Tp
 */
@WebServlet("/Tp")
public class Tp extends HttpServlet  {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Tp() {
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset = \"UTF-8\">");
	    out.println("<title> PREMIERE PAGE </title>");
	    out.println("</head>");
	    out.println("<body>");

	    
	    out.println("<form method= \"POST\">");
	    out.println("<input type=\"text\" name=\"nom\">");
	    out.println("<input type=\"submit\" value=\"Click\">");
	    out.println("</form>");
	    out.println("<hr>");
	    out.println("<h1> Hello,the world ! </h1>");
	    out.println("<hr>");
	    out.println("</body>");
	    out.println("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		
	    out.println("<html>");
	    out.println("<head>");
	    out.println("<meta charset = \"UTF-8\">");
	    out.println("<title> Reponse </title>");
	    out.println("</head>");
	    out.println("<body>");
	    
	    if( request.getParameter("nom")!=null)
	    	out.println("<span>" + request.getParameter("nom") + "</span>");


	    
	    out.println("<a href=\"/Projet/Tp\"><-- Retour </a>");

	    out.println("</body>");
	    out.println("</html>");
		
	}

}
