<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Indirizzi</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<c:if test="${listaIndirizzi.size()==0}">
		<div>
			<p>Nessun Risultato.</p>
		</div>
	</c:if>	
	<c:if test="${listaIndirizzi.size()>0}">
	<table width="200px" height="150px" border="1">
		<tr>
			<th>Citta</th>
			<th>Via</th>
			<th>Civico</th>
			<th>Aggiorna</th>
			<th>Elimina</th>
		</tr>
		<c:forEach var="ind" items="${listaIndirizzi}">
			<tr>
                    <form action="<%= request.getContextPath()+"/updateParziale"%>" method="post">
                      <td> <input type="text" name="citta" value="${ind.citta}"> </td>
                      <td> <input type="text" name="via" value="${ind.via}"> </td>
                      <td>  <input type="text" name="civico" value="${ind.civico}"> </td>
                      <input type="hidden" name="id" value="${ind.id}"> 
                      <td> <input type="submit" value="Aggiorna"> </td>
                    </form>
                <td> 
                <form action="<%= request.getContextPath()+"/elimina"%>" method="post">
                        <input type="hidden" name="citta" value="${ind.citta}">
                        <input type="hidden" name="via" value="${ind.via}">
                        <input type="hidden" name="civico" value="${ind.civico}">
                        <input type="submit" value="Elimina">
                    </form> 
                    </td>
			</tr>
		</c:forEach>
	</table>
	</c:if>
	<jsp:include page="menuRedirect.jsp"></jsp:include>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>