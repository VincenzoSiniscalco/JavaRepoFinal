<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Risultati Ricerca</title>
</head>
<body>
	<%
		List<String> cittaList= (List<String>) request.getSession().getAttribute("chiaveRisultati");
		if(cittaList.size()==0){
	%>
	<div>Nessun risultato</div>
	<%
		}else{
	%>
	<table width="100px" height="100 px" border="1">
		<tr>
			<th>Citta</th>
		</tr>
	<%
			for(String citta:cittaList){
	%>
		<tr>
			<td><%=citta %></td>
				<td>
                    <form action="<%= request.getContextPath()+"/elimina"%>" method="post">
                        <input type="hidden" name="citta" value="<%= citta %>">
                        <input type="submit" value="Elimina">
                    </form>
                </td>
		</tr>
	<%
			}
	%>
	</table>
	<%
		}	
	%>
	<jsp:include page="menuRedirect.jsp"></jsp:include>
	<br>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>