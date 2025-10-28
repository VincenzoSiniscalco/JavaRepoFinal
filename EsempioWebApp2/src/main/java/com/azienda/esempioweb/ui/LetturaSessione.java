package com.azienda.esempioweb.ui;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/read")
public class LetturaSessione extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String nome= (String) req.getSession().getAttribute("chiaveNome");
			System.out.println(nome);
			resp.sendRedirect(req.getContextPath()+"/remove");
			
		} catch (Exception e) {
			e.printStackTrace();
			req.getRequestDispatcher("/html/errore.html").forward(req, resp);
		}
	}
}
