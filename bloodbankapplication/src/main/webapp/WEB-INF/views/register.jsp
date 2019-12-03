<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WE SERVE BLOOD BANK</title>
</head>
<body>
	<h1>WE SERVE BLOOD BANK</h1>
	<form action="./registrationsubmit" method="post">

		<table>



			<tr>
				<td>Enter User name</td>

				<td><input type="text" name=userName></td>
			</tr>

			<tr>
				<td>Enter password</td>

				<td><input type="password" name="password"></td>

			</tr>

			<tr>
				<td>Select role</td>

				<td><select name="role">

						<option value="donor">Donor</option>

						<option value="requestor">Requestor</option>


				</select></td>
			</tr>

			<tr>
				<td>Enter blood group</td>

				<td><input type="text" name="bloodGroup"></td>

			</tr>

			<tr>
				<td>Contact number</td>

				<td><input type="text" name=contactNo></td>
			</tr>

			<tr>
				<td>Select Status</td>

				<td><select name="status">

						<option value="Submitted">Submitted</option>

				</select></td>
			</tr>

			<tr>
				<td><input type="submit" value="submit"></td>

				<td></td>
				<td></td>
				<td><input type="reset" value="reset"></td>
			</tr>

		</table>

	</form>
</body>
</html>