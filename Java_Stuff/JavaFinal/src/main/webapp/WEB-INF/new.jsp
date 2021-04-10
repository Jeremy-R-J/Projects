<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Idea</title>
</head>
<body>
<h1>Idea Maker 3000</h1>
<form:form action="/tasks" method="post" modelAttribute="task">
    <p>
        <form:label path="name">Idea</form:label>
        <form:errors path="name"></form:errors>
        <form:input path="name"/>
    </p>
  
    
     <form:input type="hidden" path="creator" value="${user.id}"/>   
    <input type="submit" value="Create"/>
</form:form>
<a href="/tasks">Back</a><br><a href="/logout">logout</a>
</body>
</html>