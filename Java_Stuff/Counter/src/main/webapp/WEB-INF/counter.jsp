<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<meta charset="ISO-8859-1">
<title>Counter</title>
</head>
<body>
<h1>>You have visited http://your_server at least:<c:out value="${count}"/> times just now!</h1>
<a href="/">return to main</a>
</body>
</html>