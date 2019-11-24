package com.alhussad.web.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class PasswordFilter implements Filter 
{
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	{
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest)request;
		String pass1 = request.getParameter("pass1");
		String pass2 = request.getParameter("pass2");
		
		if(pass1.equals(pass2))
		{
			chain.doFilter(request, response);
		}
		else
		{
			//out.println("Password not correct!");
			String error = "Incorrect Password";
			req.setAttribute("error", error);
			RequestDispatcher rd = req.getRequestDispatcher("createAccount.jsp");
			rd.forward(request, response);
		}
		
	}
}
