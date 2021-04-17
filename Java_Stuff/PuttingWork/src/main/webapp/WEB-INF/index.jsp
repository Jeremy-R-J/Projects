<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<h1>All Tasks</h1>
<table>
    <thead>
        <tr>
            <th>Title</th>
            <th>Description</th>
            <th>Language</th>
            <th>age</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${tasks}" var="task">
        <tr>
            <td><c:out value="${task.title}"/></td>
            <td><c:out value="${task.desc}"/></td>
            <td><c:out value="${task.lang}"/></td>
            <td><c:out value="${task.age}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/tasks/new">New Task</a>

</body>
</html>