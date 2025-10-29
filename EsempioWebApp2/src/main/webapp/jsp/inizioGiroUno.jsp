<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View di partenza del giro uno.</title>
</head>
<body>
	<form action="<%= request.getContextPath()+"/numero"%>" method="get">
		numero<input type="number" name="num">
		<br>
		<input type="submit" value="prova">
	
	
	</form>
</body>
</html>