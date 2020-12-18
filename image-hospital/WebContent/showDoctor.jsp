<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style='text-align:center'>${heading}</h1>
<h3 style='text-align:center'>Doctor Details</h3>

<table>
	<thead>
		<tr>
			<th>Doctor ID</th>
			<th>Doctor Name</th>
			<th>Mobile Number</th>
			<th>Specialization</th>
			<th>Date of Birth</th>
			</tr>
			</thead>
			<tbody>
				<tr>
					<td>${doctorDetails.getDoctorId()}</td>
					<td>${doctorDetails.getDoctorName()}</td>
					<td>${doctorDetails.getMobileNumber()}</td>
					<td>${doctorDetails.getSpecialization()}</td>
					<td>${doctorDetails.getDateOfBirth()}</td>
				</tr>
			</tbody>
		
	
</table>

</body>
</html>