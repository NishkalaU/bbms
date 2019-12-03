<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WE SERVE BLOOD BANK</h1>
	<form action="./details">
	Welcome ${key.userName}!
	<style>
table {
	margin-left: 10%;
	margin-right: 10%;
	align: center;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 15px;
}

th {
	background-color: pink;
	color: white;
	text-align: left;
}

table tr:nth-child(odd) {
	background-color: grey;
}
</style>
	<table>
		<tr>
			<td>Requester Name</td>
			<td>${key.userName}</td>
		</tr>
		<tr>
			<td>RequesterId</td>
			<td>${key.id}</td>
		</tr>
		<tr>
			<td>Blood Group Required</td>
			<td>${key.bloodGroup}</td>
		</tr>
		<tr>
			<td>Contact No.</td>
			<td>${key.contactNo}</td>
		</tr>
		<tr>
			<td>Status</td>
			<td>${key.status}</td>
		</tr>
	</table>
	<input type = "submit" value ="Available Donors">
</body>
</html>