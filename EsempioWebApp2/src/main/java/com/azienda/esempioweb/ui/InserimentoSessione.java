package com.azienda.esempioweb.ui;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/insert")
public class InserimentoSessione extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			HttpSession session= req.getSession();
			session.setAttribute("chiaveNome", "Mario");
			resp.sendRedirect(req.getContextPath()+"/read");
		} catch (Exception e) {
			req.getRequestDispatcher("/html/errore.html").forward(req, resp);
			e.printStackTrace();
		}
	}
}
