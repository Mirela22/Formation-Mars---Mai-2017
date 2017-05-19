package com.ib.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ib.beans.Comptes;
import com.ib.beans.User;
import com.ib.metier.BddConnect;



/**
 * Servlet implementation class Connect
 */
@WebServlet("/Connect")
public class Connect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Connect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Création d'une session
		
		HttpSession session=request.getSession();
		String person_external_id=  request.getParameter("nom_user");
		String person_password = (String) request.getParameter("pass_user");
		
		List<User> users = BddConnect.findAllUser();
		
		
		
		for (User user : users) {
			if((user.getPerson_external_id().equals(person_external_id)) && (user.getPerson_password().equals(person_password))){
				
				List<Comptes> comptes =  BddConnect.findCompte(user.getPerson_id());
				
				List<User> userss =  BddConnect.findUser(user.getPerson_advisor_id());
				
				
	
		        session.setAttribute("comptes", comptes);
		        
		        session.setAttribute("userss", userss);
				
				
				session.setAttribute("user", user);
				
				
			System.out.println(user.getPerson_is_advisor() + "ccc");
				if(user.getPerson_is_advisor()==1){
					this.getServletContext().getRequestDispatcher("/WEB-INF/AccueilConseiller.jsp").forward(request, response);
					return;
					
				}else{
					this.getServletContext().getRequestDispatcher("/WEB-INF/AccueilClient.jsp").forward(request, response);
					return;
				}
				
			}else if((user.getPerson_external_id()==person_external_id) && (!user.getPerson_password().equals(person_password))){
				request.setAttribute("msg", "le mot de passe est erroné !!!");
				
			}else{
				request.setAttribute("msg", "le login et le mot de passe sont erronés !!!");
				
			}
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/start.jsp").forward(request, response);
		return;
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
