<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Edit Dojo</h1>
<form:form action="/dojos/${dojo.id}" method="post" modelAttribute="dojo">

    <p>
        <form:label path="title">Dojo Name</form:label>
        <form:errors path="title"/>
        <form:input path="title"/>
    </p>
    <p>
        <form:label path="description">Location</form:label>
        <form:errors path="description"/>
        <form:input path="description"/>
    </p>
    <p>
        <form:label path="language">Trainers</form:label>
        <form:errors path="language"/>
        <form:input path="language"/>
    </p>
    <p>
        <form:label path="numberOfPages"> World Ranking</form:label>
        <form:errors path="numberOfPages"/>     
        <form:input type="number" path="numberOfPages"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>