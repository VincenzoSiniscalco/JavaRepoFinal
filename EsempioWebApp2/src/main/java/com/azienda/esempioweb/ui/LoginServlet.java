package com.azienda.esempioweb.ui;

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
			String username= req.getParameter("un");
			String password= req.getParameter("pwd");
			if("admin".equals(username) && "admin".equals(password)) {
				
				req.getRequestDispatcher("/html/areaPrivata.html").forward(req, resp);
				
			}else {
				req.getRequestDispatcher("/html/loginKo.html").forward(req, resp);

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
