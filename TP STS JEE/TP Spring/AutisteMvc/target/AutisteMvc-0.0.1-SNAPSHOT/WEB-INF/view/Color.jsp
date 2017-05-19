<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenue</title>
		
		<spring:url value="/res/${sessionScope.theme}.css" var="themeCss"/>
		<link href="${themeCss}" rel="stylesheet"/>

</head>
<body>


		<fieldset>
                <legend> Welcome </legend>
		
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
		
		<a href="/AutistMVC/actu"> Actualités </a>
		<a href="/AutistMVC/index2">Accueil</a>
			
	</fieldset>
 
</body>
</html>

