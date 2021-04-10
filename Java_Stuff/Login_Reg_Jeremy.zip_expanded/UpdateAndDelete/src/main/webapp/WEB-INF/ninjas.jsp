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
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<h1>New Ninja signup</h1>
<form:form action="/ninjas" method="post" modelAttribute="newNinja">
    <p>
        <form:label path="firstName">Ninja First Name</form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">Ninja Last Name</form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
    <p>
        <form:label path="age">age</form:label>
        <form:errors path="age"/>
        <form:input path="age"/>
    </p>
    <p>
        <form:label path="dojo"></form:label>
        <form:errors path="dojo"/>     
        <form:select path="dojo">
        	<option value="" disabled selected>Choose your Dojo?</option>
        	<c:forEach items="${dojo}" var="d">
        		<form:option value="${d}">
        			<c:out value="${d.title}"></c:out>
        		</form:option>
        	</c:forEach>
        </form:select>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>