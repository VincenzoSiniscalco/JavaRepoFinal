<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View finale giro 2</title>
</head>
<body>
	
	<%
		List<String> nomi= (List<String>) request.getAttribute("chiaveRisultati");
		if(nomi.size()==0){
	%>
	<div>Nessun risultato</div>
	<%
		}else{
	%>
	<table width="100px" height="100 px" border="1">
		<tr>
			<th>Nomi</th>
		</tr>
	<%
			for(String nome:nomi){
	%>
		<tr>
			<td><%=nome %></td>
		</tr>
	<%
			}
	%>
	</table>
	<%
		}	
	%>
	
</body>
</html>