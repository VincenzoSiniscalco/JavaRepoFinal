<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/update" method="post" modelAttribute="chiaveUpdateIndirizzo">
		Città da aggiornare<form:input path="cittaDaAggiornare"/>
		<br>
		Via da aggiornare<form:input path="viaDaAggiornare"/>
		<br>
		Civico da aggiornare<form:input path="civicoDaAggiornare"/>
		<br>
		Città aggiornata<form:input path="cittaAggiornata"/>
		<br>
		Via aggiornata<form:input path="viaAggiornata"/>
		<br>
		Civico aggiornato<form:input path="civicoAggiornata"/>
		<input type="submit" value="Aggiorna">
	</form:form>
	<jsp:include page="menuRedirect.jsp"></jsp:include>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>