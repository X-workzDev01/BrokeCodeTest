<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>

<form action="update" method="post">

<input type="text" name="festivalName" placeholder="Festival Name"/>

<input type="text" name="date" placeholder="Date"/>

<button type="submit">Update</button>

<h2>${updateMessage}</h2>
<h4>${dateNotValid}</h4>
<h4>${nameNotValid}</h4>
<h4>${notFound}</h4>


<h2>${updateDto.festivalName}</h2>
<h2>${updateDto.date}</h2>
<h2>${updateDto.season}</h2>
<h2>${updateDto.noOfDays}</h2>






</form>



</body>
</html>