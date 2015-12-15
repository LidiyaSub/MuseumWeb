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
	<div>
		<a href="/">Main menu</a>
	</div>

	<h1>Schedule</h1>
	<form:form action="assignWorkerToSchedule" method="POST" modelAttribute="workerSchedule">
		<form:select multiple="false" path="worker">
			<form:options items="${workers}" itemValue="nameWorker"	itemLabel="nameWorker" />
		</form:select>
		<form:select multiple="false" path="schedule">
			<form:options items="${schedules}" itemValue="day" itemLabel="day" />
		</form:select>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>