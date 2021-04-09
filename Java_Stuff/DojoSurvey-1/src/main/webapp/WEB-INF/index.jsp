<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
<c:out value="${Bubble}"/>
<div>
<form action="/result" method="post">
		<div>
        <label for="yourName">Your Name</label>
        <input type="text" id="yourName" name="yourname">
        </div>
        <div>
            <label for="select">Dojo Location:</label>
            <select name="location">   
                <option value="Seattle">Seattle</option>
                <option value="San Jose">San JoseL</option>
                <option value="Cleveland">Cleveland</option>
            </select>
        </div>
        <div>
        <label for="select">Poison you will take:</label>
            <select name="favLang">   
                <option value="java ">java</option>
                <option value="HTML ">HTML</option>
                <option value="C# ">Python</option>
            </select>
        </div>        
        
        <label for="comments">Write something about yourself!</label><br>
        <textarea name="comments" id="comments" cols="50" rows="10"></textarea>
         
        
        <button>Submit!</button>
    </form>
</div>
</body>
</html>