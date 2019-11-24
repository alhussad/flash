package com.alhussad.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alhussad.web.dao.LoginDao;


public class Login extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		
		LoginDao dao = new LoginDao();
		
		if(dao.validateLogin(email, pass))
		{
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			session.setAttribute("pass", pass);
			response.sendRedirect("view");
		}
		else
		{
			response.sendRedirect("index.jsp");
		}
	}
}
