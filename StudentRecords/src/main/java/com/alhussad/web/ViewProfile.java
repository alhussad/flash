package com.alhussad.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alhussad.web.dao.ViewProfileDao;
import com.alhussad.web.student.Student;
@WebServlet("/view")
public class ViewProfile extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		String pass = (String)session.getAttribute("pass");
		ViewProfileDao dao = new ViewProfileDao();
		Student s = dao.viewProfile(email, pass);
		
		//session.setAttribute("student", s);
		//response.sendRedirect("displayProfile.jsp");
		List<Student> list = new ArrayList<>();
		list.add(s);
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("displayProfile.jsp");
		rd.forward(request, response);
	}
}
