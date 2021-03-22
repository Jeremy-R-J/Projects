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
<h1>Welcome to the School.....Students!</h1>
<a href="/schools">New School</a><br><a href="/students">New Student</a><br><a href="/logout">Log Out</a>




















<!-- <body> -->
<%-- <h1>All Books</h1>
<table>
    <thead>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Language</th>
            <th>Number of Pages</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${books}" var="b">
        <tr>
            <td><a href="/books/${b.id}"><c:out value="${b.title}"/></a></td>
            <td><c:out value="${b.description}"/></td>
            <td><c:out value="${b.language}"/></td>
            <td><c:out value="${b.numberOfPages}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/books/new">New Book</a>
</body>
</html> --%>