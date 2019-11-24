<html>
<head>
<title>Student Records</title>
<style type="text/css">
	body {
		background-color: green;
	}
	header {
		border: 2px solid black;
		margin-bottom: 50px;
		background-color: cyan;
		text-align: center;
		padding: 10px;
		font-size: 30px;
		color: red;
		float: center;
	}
	footer {
		border: 2px solid black;
		margin-top: 285px;
		background-color: lightblue;
		text-align: center;
		padding: 10px;
		font-size: 10px;
		color: green;
		float: center;
	}
	div{
		border: 3px solid brown;
		margin-left: 300px;
		margin-right: 500px;
		background-color: cyan;
		padding: 10px;
	}
</style>
</head>
<body>
	<header >Comprehensive Student Records</header>
	<div>
		<form action="Login" method="get">
			<p>Account Login</p>
			<table>
				<tr><td>Email: </td><td><input type="text" name="email"></td></tr>
				<tr><td>Password: </td><td><input type="password" name="pass"></td></tr>
				<tr><td><input type="submit" value="Login"></td><td><a href="createAccount.jsp">Create Profile</a></td></tr>
			</table>
		</form>
	</div>
	<footer>Trademark@ alhussad</footer>	
</body>
</html>
