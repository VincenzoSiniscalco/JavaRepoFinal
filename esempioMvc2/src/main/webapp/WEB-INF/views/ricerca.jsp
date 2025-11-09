<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ricerca</title>
</head>
<body>
	<form:form action="/ricerca" method="post" modelAttribute="chiaveIndirizzo">
		Citta<form:input path="citta"/>
		<br>
		Via<form:input path="via"/>
		<br>
		<input type="submit" value="ricerca">
	</form:form>
	<jsp:include page="menuRedirect.jsp"></jsp:include>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>