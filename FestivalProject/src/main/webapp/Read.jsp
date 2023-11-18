<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read</title>
</head>
<body>

<h1>Read Page</h1>

<c:forEach var="dto" items="${data}">
<h3>${dto.festivalname}</h3>
<h3>${dto.noOfdays}</h3>
<h3>${dto.date}</h3>
<h3>${dto.season}</h3>
<h3>**********************</h3>
</c:forEach>


</body>
</html>