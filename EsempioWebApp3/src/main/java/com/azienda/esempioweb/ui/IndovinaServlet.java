package com.azienda.esempioweb.ui;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/indovina")
public class IndovinaServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String numero= req.getParameter("num");
			Integer num=Integer.parseInt(numero);
			Integer random= new Random().nextInt(10);
			if(num.equals(random)) {
				req.getRequestDispatcher("/html/vittoria.html").forward(req, resp);
			}else {
				req.getRequestDispatcher("/html/sconfitta.html").forward(req, resp);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			req.getRequestDispatcher("/html/errore.html").forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
