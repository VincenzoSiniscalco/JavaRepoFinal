package com.azienda.esempioweb.ui;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/numero")
public class PrimoGiroServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int numero= new Random().nextInt(5);
			String numeroForm= req.getParameter("num");
			int numero2=Integer.parseInt(numeroForm);
			String esito="";
			if(numero2==numero) {
				esito="hai vinto";
			}else {
				esito="hai perso";
			}
			req.setAttribute("chiaveEsito", esito);
			req.getRequestDispatcher("/jsp/esito.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("chiaveErrore", "Problema generazione numero random");
			req.getRequestDispatcher("/jsp/errore.jsp").forward(req, resp);
		}
	}
}
