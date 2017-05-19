<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
    <head>
        <meta charset="utf-8">
        <title>Welcome</title>
        
        <spring:url value="/res/${theme}.css" var="themeCss"/>
        <link href="${themeCss}" rel="stylesheet"/>
    </head> 
    
    <body>
     
     	
		<fieldset>
                <legend> Actualités </legend>
                
					<c:if test="${entete == 'afficher'}" >
									
						<h2> ENTETE</h2>
						
							<h3> Bonjour ${prenom} ${nom} </h3>
							<p id="theme"> Thème : ${theme} </p>
					
							<div>
								<p>Ici on récupère les éléments via les sessions</p>
								<c:out value="${sessionScope.prenom}" />
								<c:out value="${sessionScope.nom}" />
							</div>
						</c:if>
		      
		      
		            <div class="formulaire"> <strong>Actualités </strong>
		            	<a href="/AutisteMvc/Color">Welcome</a>
		                <a href="http://localhost:8080/AutisteMvc/index2.jsp">formulaire</a>
		            </div>
		       
		  </fieldset>
       
    </body>
</html>