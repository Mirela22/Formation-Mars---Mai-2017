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
    <c:if test="${sessionScope.entete=='afficher'}"> 
            <div class="formulaire" >
                <fieldset>
                <legend> <strong>Actualités </strong></legend>
                <a href="/AutistMVC/Color">Welcome</a>
                <a href="/AutistMVC/index2">formulaire</a>
                </fieldset>    
            </div>
        </c:if>
        <c:if test="${sessionScope.entete!='oui'}">
            <div class="formulaire"> <strong>Actualités </strong>
            	<a href="/AutistMVC/Color">Welcome</a>
                <a href="/AutistMVC/index2">formulaire</a>
            </div>
        </c:if>
    </body>
</html>