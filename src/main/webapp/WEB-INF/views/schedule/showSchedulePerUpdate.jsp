<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit schedule</title>
</head>
<body>
	<div>
		<a href="/">Main menu</a>
	</div>

	<form:form
		action="${pageContext.request.contextPath}/editSchedule/${schedule.id}"
		method="POST" modelAttribute="schedule">
		<label>Date</label>
		<br>
		<form:input path="day" id="datepicker" />
		<label>Time</label>
		<form:input path="time" id="timepicker" />
		<input name="commit" type="submit" value="Confirm" />
	</form:form>
<jsp:include page="../footer.jsp" />
</body>
</html>