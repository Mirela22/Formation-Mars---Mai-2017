package com.ib.servlet.correctionSite;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebFilter("/RestrictionFilter")
public class RestrictionFilter implements Filter {
	
	public static final String PUBLIC_PATH ="/Accueil2.jsp" ;
	public static final String SESSION = "session";


    public RestrictionFilter() {
  
    }
	public void destroy() {
		
	}
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) servletRequest;
		HttpServletResponse res = (HttpServletResponse ) servletResponse;
		
		HttpSession session = req.getSession();
		 
		if(session.getAttribute(SESSION) ==null){
			res.sendRedirect(req.getContextPath()+PUBLIC_PATH);
			
		}else{
			filterChain.doFilter(req,res);
		}
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
