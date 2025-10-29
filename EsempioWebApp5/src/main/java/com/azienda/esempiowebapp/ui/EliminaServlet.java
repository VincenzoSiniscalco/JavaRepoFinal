package com.azienda.esempiowebapp.ui;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/elimina")
public class EliminaServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			HttpSession session = req.getSession();
			
			String cittaDaEliminare = req.getParameter("citta");

			List<String> trovati = (List<String>) session.getAttribute("chiaveRisultati");

			if (trovati != null && cittaDaEliminare != null) {
				trovati.remove(cittaDaEliminare);
			}
			session.setAttribute("chiaveRisultati", trovati);
			
			req.setAttribute("chiaveRisultati", trovati);
			req.getRequestDispatcher("/jsp/risultatiRicerca.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			req.getRequestDispatcher("/jsp/errore.jsp").forward(req, resp);
		}
	}
}
