<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Survey Info</title>
</head>
<body>
	<div class="container">
		<h1>Here's your stuff!!</h1>
		<p>Your Name:<c:out value="${yourname}"/></p>
		<p>Dojo Location:<c:out value="${location}"/></p>
		<p>Language you like:<c:out value="${favLang}"/></p>
		<p>Comments:<c:out value="${comment}"/></p>
	</div>
	<a href="/">Back</a>
</body>
</html>