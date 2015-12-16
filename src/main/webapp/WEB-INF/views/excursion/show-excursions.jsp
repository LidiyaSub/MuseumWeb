<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

	<form action="deleteExcursion">
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Duration</th>
				<th>Schedule</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>

			<c:forEach items="${allExcursions}" var="excursion">
				<tr>
					<td>${excursion.nameExcursion}</td>
					<td>${excursion.duration}</td>
					<%-- 			<c:forEach items="${allSchedules}" var="schedule"> --%>
					<%-- 					<td><c:if test="${excursion.id eq schedule.id}">${schedule.dateTimeSchedule}</c:if></td> --%>
					<%-- 			</c:forEach> --%>
					<td></td>
					<td><input type="checkbox" name="checkbox"
						value="${excursion.id}"></td>
					<td><a href="updateExcursion-${excursion.id}">Update</a></td>
				</tr>
			</c:forEach>

		</table>
		<br> <input type="submit" value="delete" id="delete" disabled />
	</form>
	<h2>
		<a href="addNewExcursion">Add new excursion</a>
	</h2>
</body>
</html>