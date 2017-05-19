<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mon site internet</title>

<link rel="stylesheet" href="Assets/CSS/principal.css" type="text/css"/>
</head>
<body>

	<div class="conteneur">

		<h1> Journal du Net </h1>
		
		<div id=identification > 
		
		<jsp:useBean id="utilisateur1" scope="session" class="com.ib.bean.User"> </jsp:useBean>
		<jsp:setProperty name="utilisateur1" property="*" />
		
		<% if (utilisateur1.getLogin()==null  ){ %>
		
		
			  <form method="post" >
			  
			  	<label> Login : </label>
			    <input type="text" name="login">
			    <label> Mot de passe : </label>
			    <input type="text" name="MDP">
			    			  	

			  	<input type="submit" value="Valider">
			  </form>
			  
		<% } else { %>
	  	    	
				<h3> Bonjour <jsp:getProperty name="utilisateur1" property="login" /></h3>                                       
				
				<div id="posterInfo"> 
					<form id="posterCom" method="post" action="/Projet/Info2"  >
					<input type="submit" name="commenter" value="Poster un commentaire" >   
					</form>                                                           
					              
				  	<form id="logOut" method= <% session.invalidate(); %> >
					<input type="submit" name="logOut" value="se deconnecter" >   
					</form>  
		      </div> 
	    	
	    	
	    <% }%>
	    
	    
	    	  
	    	
	  
			 
		</div>
	</div>
			<div id="conteneur2">
				<div id="new">                 
					<h2> New </h2>  
					<p> Commentaire </p>              
			</div>   
				<div id="new">                 
					<h2> New </h2>    
					<p> Commentaire </p>  
					         
				</div> 
			</div>        
	
	



</body>
</html>