<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:useBean id="user" scope="session" class="com.ib.beans.User"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bonjour <jsp:getProperty property="name" name="user"/></h1>

<form action="/testFilters/TestConnect" method="get">
<input id="valide" type="submit" value="Logout">
</form>

</body>
</html>