<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%-- <c:forEach items="${students}" var="stu">
<p>
<c:out value="${firstName}"></c:out>
<c:out value="${lastName}"></c:out>
</p>
</c:forEach> --%>

<a href="/">Back</a>
<h1>Create a new Student</h1>

<form:form action="/students" method="post" modelAttribute="student">
    <p>
        <form:label path="firstName">First Name</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
     <p>
        <form:label path="lastName">Last Name</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
     <p>
        <form:label path="age">Age</form:label>
        <form:errors path="age"/>
        <form:input path="age"/>
    </p>
   <p>
   <form:label path="school"></form:label>
   <form:errors path="school"></form:errors>
    <form:select path="school">
    <option value= "" disabled selected>Select a School</option>
    <c:forEach items="${schools}" var="s">
    <form:option value="${s}"> 
		<c:out value="${s.name}"></c:out>
		</form:option>
	</c:forEach>
 	</form:select>
 	</p>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>