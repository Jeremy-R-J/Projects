<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ideas showing up Page</title>
</head>
<body>
<h2>The wonderful idea you had was:<c:out value="${task.name}"/></h2>
<h3>Creator: <c:out value="${task.creator.name}"/></h3>

<form action="/tasks/${task.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
<form action="/tasks/${task.id}/edit" method="get">
    <input type="hidden" name="_method" value="edit">
    <input type="submit" value="Edit Idea">
</form>
<a href="/tasks">Back</a><br><a href="/logout">logout</a>
</body>
</body>
</html>