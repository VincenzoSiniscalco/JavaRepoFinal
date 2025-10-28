package com.azienda.esempioweb.ui;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String latitudine= req.getParameter("lt");
			String longitudine= req.getParameter("lg");
			Integer lat= Integer.parseInt(latitudine);
			Integer log=Integer.parseInt(longitudine);

			resp.sendRedirect(req.getContextPath()+"/acquisisci?lt="+lat+"&lg="+log);
		} catch (IOException e) {
			e.printStackTrace();
			req.getRequestDispatcher("/html/errore.html").forward(req, resp);
		}
	}
}

