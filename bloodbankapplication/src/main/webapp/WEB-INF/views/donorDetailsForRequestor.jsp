<%@page import="java.util.List"%>
<%@page import="com.bloodbankapplication.model.BloodBankDetails"%>
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
Here we give you the details of our donors!<br>
<body>
<table border="1">

		<th>Donor ID</th>
		<th>Donor Name</th>
		 <th>Blood Group</th>
		 <th>Contact Number</th>
		  
<% List<BloodBankDetails> details = (List<BloodBankDetails>)request.getAttribute("donorDetails");
for(BloodBankDetails detail:details)
{
    %>	
		
		
			<tr>
				<td><%=detail.getId() %></td>
				<td><%=detail.getUserName()%></td>
				<td><%=detail.getBloodGroup()%></td>
				<td><%=detail.getContactNo()%></td>
<%} %>				

			</tr>
	
	</table>
</body>
</html>