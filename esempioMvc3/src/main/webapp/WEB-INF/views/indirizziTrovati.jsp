<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
<c:if test="${listaIndirizziTrovati.size()==0}">
		<div>
			<p>Nessun risultato corrispondente alla città.</p>
		</div>
	</c:if>	
	<c:if test="${listaIndirizziTrovati.size()>0}">
	<table width="200px" height="150px" border="1">
		<tr>
			<th>Citta</th>
			<th>Via</th>
			<th>Civico</th>
		</tr>
		<c:forEach var="ind" items="${listaIndirizziTrovati}">
			<tr>
				<td>${ind.citta}</td>
				<td>${ind.via}</td>
				<td>${ind.civico}</td>
			</tr>
		</c:forEach>
	</table>
	
	
	</c:if>
	<jsp:include page="menuRedirect.jsp"></jsp:include>
	<jsp:include page="footer.jsp"></jsp:include>
	
</body>
</html>