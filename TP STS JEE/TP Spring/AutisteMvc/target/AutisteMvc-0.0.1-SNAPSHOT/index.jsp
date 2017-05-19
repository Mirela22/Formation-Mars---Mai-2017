<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
				
		<spring:url value="/res/principal.css" var="principalCss"/>
		<link href="${principalCss}" rel="stylesheet"/>
		
	
	</head> 
	<body>
	 
		<c:url value="/showMessage.html" var="messageUrl" />

					
			<form method="get" action="Bonjour">	
				<br>
				
				<input type="text" id="nom" name="nom" value="nom" size="30" maxlength="30" ></input>
				<input type="text" id="prenom" name="prenom" value="prenom" size="30" maxlength="30" ></input>
				<input type="submit" value="Valider" />
			</form>
		

		
		

		<!-- 	<div id="conteneur">
	
			<form method="get" action="Bonjour">
				
				<input type="text" id="nom" name="nom" value="nom" size="30" maxlength="30" ></input>
				<input type="text" id="prenom" name="prenom" value="prenom" size="30" maxlength="30" ></input>
				<input type="submit" value="Valider" />
			</form>
			
		
	
	</div>	 -->
		
		
	</body>
</html>
