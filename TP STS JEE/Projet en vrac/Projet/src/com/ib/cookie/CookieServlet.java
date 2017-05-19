package com.ib.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public CookieServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Cookie[] cookies = request.getCookies();
		if (cookies != null){
			for(Cookie oneCookie: cookies){
				request.setAttribute(oneCookie.getName(), oneCookie.getValue());
			}
		}
		this.getServletContext().getRequestDispatcher("/WEB-INF/banque/*").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
		String password = request.getParameter("password"); //accestoken
		
		Cookie myCookie = new Cookie ("nom", nom);
		Cookie myCookie2 = new Cookie ("password", password);
		myCookie.setMaxAge(365*7*60*60);
		myCookie2.setMaxAge(365*7*60*60);
		response.addCookie(myCookie);
		response.addCookie(myCookie2);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/banque/*").forward(request, response);;
		
		
	}

}
