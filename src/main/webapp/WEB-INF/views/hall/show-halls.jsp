<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show all halls</title>
<style type="text/css">
div {
	background-color: lightgreen;
}
</style>
</head>
<body>

	<div>
		<a href="/">Main menu</a>
	</div>
<c:if test="${param.message eq true}">
		<div>Hall is added!</div>
	</c:if>
	<c:if test="${param.msg eq true}">
		<div>Hall is updated!</div>
	</c:if>
	<c:if test="${param.notify eq true}">
		<div>Hall is deleted!</div>
	</c:if>
	<table border="1">
		<tr>
			<th>Hall name</th>
			<th>Responsible for the hall</th>
			<th>Showpieces</th>
			<th>Update/Delete</th>
		</tr>
		
		<c:forEach items="${allHalls}" var="hall">
			<tr>
			<td>${hall.nameHall}</td> 
			<td>${hall.worker.nameWorker}</td>
			<td>
				<c:forEach items="${allShowpieces}" var="showpiece">
					<c:if test="${showpiece.hall.id eq hall.id}"><li>${showpiece.nameShowpiece}</li></c:if>
				</c:forEach>
			</td>
			<td><a href="updateHall-${hall.id}">Update</a> | <a href="deleteHall-${hall.id}">Delete</a></td>
			</tr>
		</c:forEach>
		
	</table>
	<h2><a href="addHall">Add new HALL</a></h2>
</body>
</html>