<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, tr, td, th {
	border: 1px solid;
}
</style>
</head>
<body>
<table>
	<tr><th>Customer ID</th><th>Name</th><th>Email</th><th>Mobile Number</th><th>City</th><th>Pincode</th><th>State</th></tr>
	
	<c:forEach items="${ listOfCustomers }" var="customer">
		<tr>
			<td>${ customer.id }</td>
			<td>${ customer.name }</td>
			<td>${ customer.email }</td>
			<td>${ customer.mobileNumber }</td>
			<%-- <c:if test="${ customer.address != null }"> --%>
				<td>${ customer.address.city }</td>
				<td>${ customer.address.pincode }</td>
				<td>${ customer.address.state }</td>
			<%-- </c:if> --%>
		</tr>
	</c:forEach>
</table>
</body>
</html>