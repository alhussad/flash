<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Account</title>
<style type="text/css">
	form {
		border: 3px solid brown;
		margin-top: 100px;
		margin-left: 300px;
		margin-right: 750px;
		background-color: grey;
		padding: 10px;
	}
	table {
		border: 2px solid red;
		background-color: lightblue;
		padding: 5px;
	}
	input {
		border: 1px solid black;
	}
	caption {
		color: blue;
		margin: 2px;
	}
	header{
		border: 5px solid black;
		text-align: center;
		float: center;
		color: red;
		background-color: darkgreen;
	}
</style>
</head>
<body bgcolor="cyan">
	<% response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); %>
	<header>Create Student Account Records</header><br>
	${error}
	<form action="CreateAccount" method="get">
		<table>
			<caption>Create Account Page</caption>
			<tr><td>Student Id:</td><td><input type="text" name="student_id"></td></tr>
			<tr><td>First Name:</td><td><input type="text" name="fn"></td></tr>
			<tr><td>Last Name:</td><td><input type="text" name="ln"></td></tr>
			<tr><td>Date of Birth:</td><td><input type="text" name="dob"></td></tr>
			<tr><td>Nationality:</td><td><input type="text" name="nation"></td></tr>
			<tr><td>Department:</td><td><input type="text" name="dep"></td></tr>
			<tr><td>Telephone:</td><td><input type="text" name="tel"></td></tr>
			<tr><td>Email:</td><td><input type="email" name="email"></td></tr>
			<tr><td>Password:</td><td><input type="password" name="pass1"></td></tr>
			<tr><td>Re-enter Password:</td><td><input type="password" name="pass2"></td></tr>
			<tr><td><input type="submit" value="Submit"></td><td><input type="reset" value="Reset"></td></tr>
		</table>
		
	</form>
</body>
</html>