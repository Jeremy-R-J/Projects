<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   


<head>
<meta charset="ISO-8859-1">
<title>I have your Language</title>
</head>
<body>
<h1><c:out value="${lang.name}"/></h1>
<p>Description: <c:out value="${lang.creator}"/></p>
<p>Language: <c:out value="${lang.version}"/></p>

<a href="/langs/${lang.id}/edit">Edit Language</a>
<form action="/langs/${lang.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
<a href="/langs">Back</a>
</body>
</html>