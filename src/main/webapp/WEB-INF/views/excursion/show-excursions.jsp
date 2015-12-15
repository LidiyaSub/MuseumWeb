<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show all excursions</title>
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
		<div>Excursion is deleted!</div>
	</c:if>
	<c:if test="${param.msg eq true}">
		<div>Excursion is added!</div>
	</c:if>
	<c:if test="${param.notify eq true}">
		<div>Excursion is updated!</div>
	</c:if>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Duration</th>
			<th>Schedule</th>
			<th>Update/Delete</th>
		</tr>

		<c:forEach items="${allExcursions}" var="excursion">
				<tr>
					<td>${excursion.nameExcursion}</td>
					<td>${excursion.duration}</td>
<%-- 			<c:forEach items="${allSchedules}" var="schedule"> --%>
<%-- 					<td><c:if test="${excursion.id eq schedule.id}">${schedule.dateTimeSchedule}</c:if></td> --%>
<%-- 			</c:forEach> --%>
					<td><a href="updateExcursion-${excursion.id}">Update</a> | <a
						href="deleteExcursion-${excursion.id}">Delete</a></td>
				</tr>
		</c:forEach>

	</table>
	<h2><a href="addNewExcursion">Add new excursion</a></h2>
</body>
</html>