<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:if test="${param.message eq true}">
		<div>Schedule is added!</div>
	</c:if>
	<c:if test="${param.delete eq true}">
		<div>Schedule is deleted!</div>
	</c:if>
	<c:if test="${param.edit eq true}">
		<div>Schedule is edited!</div>
	</c:if>

	<h1>Worker</h1>
	<table border="1">
		<tr>
			<th>Day</th>
			<th>Time</th>
		</tr>
		<c:forEach items="${workers}" var="worker">
			<tr>
				<td>${schedule.day}</td>
				<td>${schedule.time}</td>
				<td><a
					href="${pageContext.request.contextPath}/deleteSchedule/${schedule.id}">delete</a></td>
				<td><a
					href="${pageContext.request.contextPath}/editSchedule/${schedule.id}">edit</a></td>
			</tr>
		</c:forEach>

	</table>
	<br>
	<br>

	<form:form action="saveWorker" method="POST" modelAttribute="worker">
		<label for="name">Name</label>
		<br>
		<form:input path="nameWorker" id="name" />
		<br>
		<label for="name">Position</label>
		<br>
		<form:input path="position" id="position" />
		<br>
		<label for="name">Salary</label>
		<br>
		<form:input path="salary" id="salary" />
		<br>
		<input name="commit" type="submit" value="Add worker" />
	</form:form>

</body>
</html>