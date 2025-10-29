<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Primo esempio Jsp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<table width="100px" height="100px" border="1">
			<tr>
				<th>Tabella generata</th>
			</tr>
					
		<%
			String campoInserito= (String)request.getAttribute("chiaveInserimento");
		%>
			<tr>
				<td> <%= campoInserito %></td>
			</tr>
		<%
			String webServer= request.getServerName();
		%>
			<tr>
				<td> <%= webServer %></td>
			</tr>
		<%
			Integer webPort= request.getServerPort();
		%>
			<tr>
				<td> <%= webPort %></td>
			</tr>
		<%
			String contextPath= request.getContextPath();
		%>
			<tr>
				<td> <%= contextPath %></td>
			</tr>
		</table>
		
		<jsp:include page="menuRedirect.jsp"></jsp:include>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>