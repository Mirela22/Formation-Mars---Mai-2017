<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Accueil </title>

<link rel="stylesheet" href="Assets/CSS/principal.css" type="text/css"/>



</head>

<body>


	<h1> Accueil 1</h1>

	<div id= pair>
			<% 
			for(int i=0; i<=50; i=i+2){
			%>
		  <%= i %> 
		  <% } %>
	  </div>
	  
	  	<div id= impair>
			<% 
			for(int i=1; i<=50; i=i+2){
			%>
		  <%= i %> 
		  <% } %>
	  </div>
	  
	  <%for (int i=0;i<51;i++){
    		if (i%2==0){ %>
    			<div id="pair"> <% out.println(i); %> </div>
    			<%}if (i%2!=0){%>
       			 <div id="impair"> <% out.println(i); %> </div>
    	<%}}%>



</body>


</html>


