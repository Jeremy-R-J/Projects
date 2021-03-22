<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert name here</title>
</head>
<body>




<h1>All Schools</h1>
<ul>
<c:forEach items="${schools}" var="s">
	<li><c:out value="${s.name}"></c:out></li>
	<ul>
<c:forEach items="${s.students}" var="stu">
<li><c:out value="${stu.firstName}"></c:out></li>
</c:forEach>
</ul>
</c:forEach> 
</ul>



<h1>Create a new School</h1>
<form:form action="/schools" method="post" modelAttribute="school">
    <p>
       <form:label path="name">Name your School</form:label>
       <form:errors path="name"/>
       <form:input path="name"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>

<a href="/">Back</a>
</body>
</html>
