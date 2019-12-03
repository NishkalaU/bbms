<%@page import="com.bloodbankapplication.model.BloodBankDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>WE SERVE BLOOD BANK</h2>
	Here you can accept/reject the request!<br><br>
	<table border="1">

		<th>Donor ID</th>
		<th>Donor Name</th>
		<th>Blood Group</th>
		<th>Contact Number</th>
		<th>Role</th>
		<th>Click here to accept</th>
		<th>Click here to reject</th>

		<%
			List<BloodBankDetails> list = (List<BloodBankDetails>) request.getAttribute("details");
			for (BloodBankDetails detail : list) {
		%>


		<tr>
			<td><%=detail.getId()%></td>
			<td><%=detail.getUserName()%></td>
			<td><%=detail.getBloodGroup()%></td>
			<td><%=detail.getContactNo()%></td>
			<td><%=detail.getRole()%></td>
			<!-- <td><a href=./accept>Accept</a></td>
			<td><a href=./reject>Reject</a></td> -->
			<td>
	 <% if(detail.getStatus().equalsIgnoreCase("Submitted")) {%>
	<a href="./accept?id=<%=detail.getId()%>"><button>Accept</button></a></td>
	<td><a href="./reject?id=<%=detail.getId()%>"><button>Reject</button></a>
	<%} %>
	
	<% }%></td> 
			
			

		</tr>

	</table>
	
</body>
</html> 