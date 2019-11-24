package com.alhussad.web;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alhussad.web.dao.CreateAccountDao;

public class CreateAccount extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int student_id = Integer.parseInt(request.getParameter("student_id"));
		String fn = request.getParameter("fn");
		String ln = request.getParameter("ln");
		String dob = request.getParameter("dob");
		String nation = request.getParameter("nation");
		String dep = request.getParameter("dep");
		String tel = request.getParameter("tel");
		String email = request.getParameter("email");
		String pass1 = request.getParameter("pass1");
		
		CreateAccountDao dao = new CreateAccountDao();
		dao.createAccount(student_id, fn, ln, dob, nation, dep, tel, email, pass1);
		String fos = "Weldone";
		request.setAttribute("mess", fos);
		RequestDispatcher rd = request.getRequestDispatcher("accountCreated.jsp");
		rd.forward(request, response);
		//response.sendRedirect("accountCreated.jsp");
		
	}
}
