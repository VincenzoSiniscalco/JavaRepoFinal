<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Esito</title>
</head>
<body>
	<%
		String risultato= (String) request.getAttribute("chiaveEsito");
	%>
	<div><%= risultato %></div>
</body>
</html>