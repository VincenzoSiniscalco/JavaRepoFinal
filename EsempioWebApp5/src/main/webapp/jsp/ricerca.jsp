<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ricerca</title>
</head>
<body>
		<form action="<%= request.getContextPath()+"/ricerca"%>" method="get">
			Ricerca<input type="text" name="citta">
			<br>
                <input type="hidden" name="operazione" value="ricerca">
				<input type="submit" value="invia">
		</form>
	<jsp:include page="menuRedirect.jsp"></jsp:include>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>