<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Find Festival</h1>

<h2>${message}</h2>

<form action="find" method="get">


<input type="text" name = "festivalName" placeholder="Festival Name"/>
<button type="submit">Find</button>


</form>

<h2>${festival.festivalName}</h2>
<h2>${festival.noOfDays}</h2>
<h2>${festival.date}</h2>
<h2>${festival.season}</h2>


<h2>READ ALL</h2>
<form action="getAll">
<button type="submit" > Read All</button>
<h3>${readMessage}</h3>
</form>





</body>
</html>