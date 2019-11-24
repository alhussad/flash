<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.alhussad.web.student.Student" %>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
</head>
<body bgcolor="cyan">
	<% 
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if(session.getAttribute("email") == null)
		{
			response.sendRedirect("index.jsp");
		}
	%>
	<table border="1">
		<thead>
			<tr>
				<th>Student Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Date of Birth</th>
				<th>Nationality</th>
				<th>Department</th>
				<th>Telephone</th>
				<th>Email</th>
				<th>Password</th>
			</tr>
		</thead>
		<tbody>
			<% 
				List<Student> studs = (List)request.getAttribute("list");
			%>
			<% 
				for(Student s : studs){
			%>
			<tr>
				<td><%= s.getStudent_id() %></td>
				<td><%= s.getFirst_name() %></td>
				<td><%= s.getLast_name() %></td>
				<td><%= s.getDob() %></td>
				<td><%= s.getNationality() %></td>
				<td><%= s.getDepartment() %></td>
				<td><%= s.getTelephone() %></td>
				<td><%= s.getEmail() %></td>
				<td><%= s.getPassword() %></td>
			</tr>
			<% 
				}
			%>
		</tbody>
	</table>
	
	<br><br>
	<form action="Logout" method="get">
		<input type="submit" value="Logout">
	</form>
</body>
</html>