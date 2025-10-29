<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<div>Pagina di Vincenzo Siniscalco.</div>
<br>
		<%
			LocalDateTime dataOra= LocalDateTime.now();
			DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			String oggi= dataOra.format(dtf);
		%>
		<p>Data e ora: <%= oggi %></p>
		