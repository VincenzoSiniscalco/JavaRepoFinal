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
	private List<String> lista= new ArrayList<>();


	public RicercaServlet() {
		lista.add("Roma");
		lista.add("Napoli");
		lista.add("Milano");
		lista.add("Torino");
		lista.add("Firenze");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			String campoInserito= req.getParameter("citta");

			if(req.getParameter("operazione").equals("ricerca")) {

			List<String> trovati= new ArrayList<String>();
				for(String citta:lista) {
					if(citta.toUpperCase().contains(campoInserito)) {
						trovati.add(citta);
					}
				}
				req.setAttribute("chiaveRisultati", trovati);

				req.getRequestDispatcher("/jsp/risultatiRicerca.jsp").forward(req, resp);
			}else if(req.getParameter("operazione").equals("elimina")){
				String cittaDaEliminare = req.getParameter("citta");
				if (lista != null && lista.contains(cittaDaEliminare)) {
					lista.remove(cittaDaEliminare);
				}
				resp.sendRedirect(req.getContextPath()+"/ricerca?operazione=ricerca&citta=");
			}




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
