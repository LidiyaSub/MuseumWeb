<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>

<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Schedule</title>
</head>
<body>
	<div>
		<a href="/">Main menu</a>
	</div>

	<c:if test="${param.message eq true}">
		<div>Schedule is added!</div>
	</c:if>
	<c:if test="${param.delete eq true}">
		<div>Schedule is deleted!</div>
	</c:if>
	<c:if test="${param.edit eq true}">
		<div>Schedule is edited!</div>
	</c:if>

	<h1>Schedule</h1>

	<form action="deleteSchedule">
		<table border="1">
			<tr>
				<th>Date and Time</th>
				<th>Delete</th>
				<th>Edit</th>
			</tr>
			<c:forEach items="${schedules}" var="schedule1">
				<tr>
					<td>${schedule1.dateTimeSchedule}</td>
					<td><input type="checkbox" name="checkbox"
						value="${schedule1.id}"></td>
					<td><a
						href="${pageContext.request.contextPath}/editSchedule/${schedule1.id}">edit</a></td>
				</tr>
			</c:forEach>

		</table>
		<br> <input type="submit" value="delete" id="delete" disabled />
	</form>
	<br>

	<form:form action="saveSchedule" method="POST"
		modelAttribute="schedule">
		<label>Date</label>
		<br>
		<form:input path="dateTimeSchedule" id="datepicker" />
		<input name="commit" type="submit" value="Add new schedule" />
	</form:form>

</body>
</html>