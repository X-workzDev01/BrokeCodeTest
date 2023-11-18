<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Festival</title>
</head>
<body>
<h1> Festival Begins</h1>

<form action="save">
Name
<input type="text" name="festivaLName"/>
No Of Days 
<input type="number" name="noOFDays"/>
Date
<input type="text" name="season"/>
Season
<input type="text" name="date"/>

<button type="submit"> Save</button>
</form>
<h2>${saved}</h2>
</body>
</html>