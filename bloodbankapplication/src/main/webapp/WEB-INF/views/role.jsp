<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WE SERVE BLOOD BANK</title>
</head>
<body>
	<form action="./roleSubmit" >
		<h1>WE SERVE BLOOD BANK</h1>
		<h3>Please select your role to continue!!!</h3>
		<br>
		<table>
			<tr>
				<td>Select role</td>

				<td><select name="role">

						<option value="donor">Donor</option>

						<option value="requestor">Requestor</option>
						
						<option value="admin">Admin</option>


				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>

				<td></td>
				<td></td>
				<td><input type="reset" value="reset"></td>
			</tr>
		</table>
</body>
</html>