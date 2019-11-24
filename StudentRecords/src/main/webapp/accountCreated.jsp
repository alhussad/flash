<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account created</title>
</head>
<body bgcolor="cyan">
	<% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); %>
	Account Created Successfully!
	${mess}
	<br><br>
	<a href="index.jsp">Click here to login</a>
</body>
</html>