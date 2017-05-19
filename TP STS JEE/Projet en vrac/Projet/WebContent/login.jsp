<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Page Login</title>
</head>
<body>

      <p>Vous devez vous connecter. </p>
      
      <%-- ajouter le lien avec la BDD
      
     <jsp:useBean id="BDD" scope="session" class="com.ib.beans.BDD"> </jsp:useBean> 
 		--%>		     
        
         	<form method="post">
			    <input type='email' name="email" placeholder="votre adresse mail">
				<input type='password' name="password" placeholder="000000000">
			  	<input type="submit" value="Valider">
			  </form>
			  


</body>
</html>