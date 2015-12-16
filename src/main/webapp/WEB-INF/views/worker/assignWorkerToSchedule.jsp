<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<a href="/">Main menu</a>
	</div>

	<h1>Schedule</h1>
	<form:form action="assignWorkerToSchedule" method="POST">
		<select name="workerName">
			<c:forEach items="${workers}" var="worker">
				<option value="${worker.id}" label="${worker.nameWorker}" />
			</c:forEach>
		</select>
		<select name="scheduleName" multiple="multiple" size="3">
			<c:forEach items="${schedules}" var="schedule">
				<option value="${schedule.id}" label="${schedule.dateTimeSchedule}" />
			</c:forEach>
		</select>
		<br>
		<input type="submit" value="Submit">
	</form:form>
</body>
</html>