package com.azienda.esempioweb.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/numero2")
public class SecondoGiroServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String nome= req.getParameter("name");
			List<String> lista1= Arrays.asList("Mario","Claudia","Gianni");
			List<String> lista2= Arrays.asList("Paola","Andrea","Anna");
			if(nome.toUpperCase().startsWith("A")) {
				req.setAttribute("chiaveRisultati", lista2);
			}else if(nome.toUpperCase().startsWith("C")){
				req.setAttribute("chiaveRisultati", lista1);
			}else {
				req.setAttribute("chiaveRisultati", new ArrayList<String>());
			}
			req.getRequestDispatcher("/jsp/fineGiroDue.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("chiaveRisultati", "Risultato non trovato.");
			req.getRequestDispatcher("/jsp/errore.jsp").forward(req, resp);
		}
	}
}
