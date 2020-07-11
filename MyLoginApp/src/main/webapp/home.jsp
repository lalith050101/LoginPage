<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
</head>
<body>
	
	<form action="/login" method="post">
		<table style="background-color:orange; padding:5px">
		<tr>
		<td><h3>Login Page</h3></td>
		<td></td>
		</tr>
		<tr>
		<td>UserName:</td><td><input type="text" name="uname"></td>
		</tr>
		<tr>
		<td>Password:</td><td><input type="password" name="pass"></td>
		</tr>
		<tr>
		<td></td><td><input type="submit" value="Login" name="submit"></td>
		</tr>
		
		</table>
	</form>
</body>
</html>