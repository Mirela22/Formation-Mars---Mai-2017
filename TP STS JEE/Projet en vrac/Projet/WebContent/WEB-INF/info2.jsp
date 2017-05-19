<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<jsp:useBean id="utilisateur1" scope="session" class="com.ib.bean.User"> 
		</jsp:useBean>        
		<jsp:setProperty name="utilisateur1" property="*" /> 
		
				<form method="post" action="/Projet/Site">                                
					<label> Entrer votre nom </label>                
					<input type="text" name="nom" >                
					<label> Entrer votre commentaire </label>                
					<input type="text" name="commentaire">                                                    
					<input type="submit" value="Valider">              
				</form> 
				
				
				  
<a href="http://localhost:8080/Projet/Site">  Revenir à la page d'accueil  </a>

</body>
</html>