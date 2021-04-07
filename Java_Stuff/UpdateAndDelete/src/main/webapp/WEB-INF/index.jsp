<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    

<!DOCTYPE html>
<h1>All Dojos</h1>
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
        <c:forEach items="${dojos}" var="dojo">
        <tr>
            <td><a href="/dojos/${dojo.id}"><c:out value="${dojo.title}"/></a></td>
            <td><c:out value="${dojo.description}"/></td>
            <td><c:out value="${dojo.language}"/></td>
            <td><c:out value="${dojo.numberOfPages}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
<a href="/dojos/new">New Dojo</a>