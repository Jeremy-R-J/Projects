<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello There</title>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<c:out value="${count}"/>
<h1 style="center">Welcome User!</h1>
<a href="/counter">Click here to see count</a>
<a href="/reset">Reset</a>
</body>
</html>