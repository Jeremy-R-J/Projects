<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<title>Code of Honor</title>
</head>
<body>

<div style="allign-center">
<h1  id="error"><c:out value="${error}"/></h1>

<h3>What is the code?</h3>
<form action="/GotIt" method="post">
       <p><input type="text" id="code" name="code"></p>
       <button>Try Code!</button>
</form>
</div>
</body>
</html>