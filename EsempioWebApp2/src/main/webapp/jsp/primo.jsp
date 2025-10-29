<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Random"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Prima jsp</title>
</head>
	<body>
		<%
			LocalDate data= LocalDate.now();
			DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
			String oggi= data.format(dtf);
		%>
		<p>Oggi: <%= oggi %></p>
		
		<%
			Random rand= new Random();
			int numero= rand.nextInt(10);
			if(numero<5){
		%>
		<div>
		Il numero <%= numero %> è minore di 5.
		</div>
		<%
			}else{
		%>
		<div>
		Il numero <%= numero %> è maggiore o uguale a 5.
		</div>
		<%
			}
		%>
		<table width="100px" height="100px" border="1">
			<tr>
				<th>nome</th>
			</tr>
			<tr>
				<td>mario</td>
			</tr>
			<tr>
				<td>laura</td>
			</tr>
			<tr>
				<td>giulia</td>
			</tr>
		</table>
		<table width="100px" height="100px" border="1">
			<tr>
				<th>nome</th>
			</tr>
					
		<%
			List<String> nomi= Arrays.asList("mario","laura","giulia");
		for(String n:nomi){
		%>
			<tr>
				<td> <%= n %></td>
			</tr>
		<%
			}
		%>
		</table>
	</body>
</html>