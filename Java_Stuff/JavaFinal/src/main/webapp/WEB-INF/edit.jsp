<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Idea for your brain!</title>
</head>
<body>
<h1>Idea editor 3000</h1>
<form:form action="/tasks/edit/${task.id}" method="post" modelAttribute="task">
<input type="hidden" name="_method" value="put">
    <p>
        <form:label path="name">Idea</form:label>
         <form:errors path="name"></form:errors>
        <form:input path="name"/>
    </p>
     <form:input type="hidden" path="creator" value="${task.creator.id}"/>   
    <input type="submit" value="Update"/>
</form:form>


<form action="/tasks/${task.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
<br>
<a href="/tasks/new">New Idea</a><br><a href="/logout">logout</a><br><a href="/tasks">Back</a>
</body>
</html>