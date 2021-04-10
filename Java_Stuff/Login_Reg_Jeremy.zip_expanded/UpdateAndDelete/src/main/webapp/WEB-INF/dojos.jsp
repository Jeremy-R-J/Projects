<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Page</title>
</head>
<body>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<h1>New Dojo</h1>
<form:form action="/dojos" method="post" modelAttribute="dojo">
    <p>
        <form:label path="title">Dojo Name</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="location">Location</form:label>
        <form:errors path="location"/>
        <form:input path="location"/>
    </p>
    <p>
        <form:label path="mainCoach">Main Coach</form:label>
        <form:errors path="mainCoach"/>
        <form:input path="mainCoach"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>    

<h1>All the Dojos</h1>
<ul>
<c:forEach items="${dojos}" var="d"><li><c:out value="${d.title}"></c:out></li></c:forEach>

</ul>
</body>
</html>