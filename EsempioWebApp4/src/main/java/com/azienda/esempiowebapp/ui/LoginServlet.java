package com.azienda.esempiowebapp.ui;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String utente= req.getParameter("un");
			String password= req.getParameter("pwd");
			if("Pippo".equalsIgnoreCase(utente) && "Pluto".equals(password)) {
				req.getSession().setAttribute("loggato", "SI");
				req.getRequestDispatcher("/html/privata/homePrivata.html").forward(req, resp);
			}else {
				req.getRequestDispatcher("/html/pubblica/loginErrato.html").forward(req, resp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			req.getRequestDispatcher("/html/pubblica/errore.html").forward(req, resp);
			
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
