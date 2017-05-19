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
	
		<fieldset>
                <legend> Formulaire </legend>
		
		
 		<br>
	 		
		<form method="Post" action="index2" id="login-form">
		
			<label> Nom : </label>
		
			<input type="text" id="nom" name="nom"  size="30" maxlength="30" ></input>
			<br><br>
			<label> Prenom : </label>
			<input type="text" id="prenom" name="prenom"size="30" maxlength="30" ></input>
			
		<br><br>
		
		</div>
		<label> Thème: </label>
			<select id="select" name="theme">
			  <option value="dark">dark</option> 
			  <option value="light" >light</option> 
			</select>
				
		<br><br>	
		<label> Afficher l'entête ? </label>
			<select id="select" name="entete">
			  <option value="afficher">Oui</option> 
			  <option value="pasafficher" >Non</option> 
			</select>
				
		<br><br>						
			
			<input type="submit" value="Enregistrer " />
			<br><br>
		</form>
		
		
				
	</body>
</html>
