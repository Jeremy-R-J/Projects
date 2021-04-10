<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>I have your Dojo</title>
</head>
<body>
<h1><c:out value="${dojo.title}"/></h1>
<p>Description: <c:out value="${dojo.description}"/></p>
<p>Language: <c:out value="${dojo.language}"/></p>
<p>Number of pages: <c:out value="${dojo.numberOfPages}"/></p>
<a href="/dojos/${dojo.id}/edit">Edit Book</a>
<form action="/dojos/${dojo.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
<a href="/dojos">Back</a>
</body>
</html>