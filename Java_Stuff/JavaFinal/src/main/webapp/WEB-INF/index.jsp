<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Ideas are ready!</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
</head>
<body>
<h1>All of the Ideas Here you go,<c:out value="${user.name}"/>!</h1>
<table>
    <thead>
        <tr>
            <th>Idea</th>
            <th>Creator</th>
            <th>Likes</th>
            <th>action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${tasks}" var="b">
        <tr>
            <td><a href="/tasks/${b.id}"><c:out value="${b.name}"/></a></td>
            <td><c:out value="${b.creator.name}"/></td>
            <td><c:out value="${b.assignee.name}"/></td>
            <td><c:out value="${b.priority}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/tasks/new">New Task</a><br><a href="/logout">logout</a>
</body>
</html>