<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LPDetails</title>
</head>
<body>
<table border="1">
		<tr>
			<th>LPId</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>DateOfBirth</th>
			<th>Phone Number</th>
			<th>Email</th>
			<th>Designation</th>
			<th>City</th>
			<th>State</th>
			<th>Country</th>
		</tr>
		<c:forEach items="${lpdetailsModelList}" var="lpDetailsModel">
			<tr>
				<td><c:out value="${lpDetailsModel.lpId}" /></td>
				<td><c:out value="${lpDetailsModel.firstName}" /></td>
				<td><c:out value="${lpDetailsModel.lastName}" /></td>
				<td><c:out value="${lpDetailsModel.dob}" /></td>
				<td><c:out value="${lpDetailsModel.phoneNumber}" /></td>
				<td><c:out value="${lpDetailsModel.email}" /></td>
				<td><c:out value="${lpDetailsModel.designation}" /></td>
				<td><c:out value="${lpDetailsModel.city}" /></td>
				<td><c:out value="${lpDetailsModel.state}" /></td>
				<td><c:out value="${lpDetailsModel.country}" /></td>

			</tr>
		</c:forEach>
</body>
</html>