<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

<h1>Welcome Ninjas time to talk about your Dojo's!</h1>
<a href="/dojos">New Dojo Register</a>  || <a href="/ninjas">Welcome new Ninjas!</a>||<a href="/logout">Logout</a>
<h1>All Dojos with current Ninjas</h1>

<ul>
<c:forEach items="${dojos}" var="d">
<li><c:out value="${d.title}"></c:out>
<ul>
    <c:forEach items="${d.ninjas}" var="nins">
    <li><c:out value="${nins.firstName}"></c:out>,
    <c:out value="${nins.lastName}"></c:out></li>
    </c:forEach>
</ul>
</li></c:forEach>
</ul>
<table>
    <thead>
        <tr>
            <th>Task</th>
            <th>Description</th>
            <th>Ninjas</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${dojos}" var="d">
        <tr>
        <c:forEach items="${d.ninjas}" var="nins">
            <td><c:out value="${d.title}"/></td>
            <td><c:out value="${d.location}"/></td>
            <td><c:out value="${nins.firstName}"></c:out></td>
            <td><a href="">Edit</a>|<a href="">View</a></td>|
        </c:forEach>
        </tr>
        </c:forEach>
        
    </tbody>
</table>       
   

</body>
</html>