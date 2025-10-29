package com.azienda.esempiowebapp.ui;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/primo")
public class PrimoEsempioServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String campoInserito= req.getParameter("testo");
			req.setAttribute("chiaveInserimento", campoInserito);
			req.getRequestDispatcher("/jsp/primoEsempio.jsp").forward(req, resp);
			
			
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
