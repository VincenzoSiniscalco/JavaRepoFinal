package com.azienda.esempiowebapp.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/ricerca")
public class RicercaServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			List<String> lista= Arrays.asList("Roma","Napoli","Milano","Torino","Firenze");
			String campoInserito= req.getParameter("citta");
			List<String> trovati= new ArrayList<String>();
			for(String citta:lista) {
				if(citta.toUpperCase().contains(campoInserito)) {
					trovati.add(citta);
				}
					
			}
			req.getSession().setAttribute("chiaveRisultati", trovati);
			
			req.getRequestDispatcher("/jsp/risultatiRicerca.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			req.getRequestDispatcher("/jsp/errore.jsp").forward(req, resp);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
