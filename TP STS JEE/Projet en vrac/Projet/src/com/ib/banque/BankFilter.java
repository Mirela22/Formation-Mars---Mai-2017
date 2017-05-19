package com.ib.banque;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("/BankFilter")
public class BankFilter implements Filter {
	
	public static final String PUBLIC_PATH ="/login.jsp" ;
	public static final String COOKIE = "cookie";

   
    public BankFilter() {
    }

	
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		// TEST LA PRESENCE D'un COOKIE
		
		if(myCookie.getAttribute(COOKIE) == null){
			response.sendRedirect(request.getContextPath()+PUBLIC_PATH);
		}else{
			chain.doFilter(request,response);
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
