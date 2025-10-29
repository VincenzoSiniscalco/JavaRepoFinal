<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Start</title>
</head>
	<jsp:include page="header.jsp"></jsp:include>
<body>
	<form action="<%= request.getContextPath()+"/primo"%>" method="get">
		Testo<input type="text" name="testo">
		<br>
		<input type="submit" value="invia">
	</form>
	<jsp:include page="menuRedirect.jsp"></jsp:include>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>