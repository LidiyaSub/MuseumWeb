<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>

<style type="text/css">
<c:import url="https://cdnjs.cloudflare.com/ajax/libs/jquery-timepicker/1.8.8/jquery.timepicker.min.css"/>
</style>

<script type="text/javascript">
<c:import url="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css"/>
</script>

<script type="text/javascript">
<c:import url="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"/>
</script>

<script type="text/javascript">
<c:import url="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"/>
</script>

<script type="text/javascript">
<c:import url="https://cdnjs.cloudflare.com/ajax/libs/jquery-timepicker/1.8.8/jquery.timepicker.min.js"/>
</script>

<script>
  $(document).ready(function() {
    $('#datepicker').datepicker();
    $("#datepicker").keypress(function(event) {event.preventDefault();});
  });
  </script>
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
	<table border="1">
		<tr>
			<th>Date and Time</th>
		</tr>
		<c:forEach items="${schedules}" var="schedule1">
			<tr>
				<td>${schedule1.dateTime}</td>
				<td><a href="${pageContext.request.contextPath}/deleteSchedule/${schedule1.id}">delete</a></td>
				<td><a href="${pageContext.request.contextPath}/editSchedule/${schedule1.id}">edit</a></td>
			</tr>
		</c:forEach>

	</table>
	<br>
	<br>

	<form:form action="saveSchedule" method="POST" modelAttribute="schedule" >
		<label>Date</label><br>
		<form:input path="dateTime" id="datepicker" />
		<input name="commit" type="submit" value="Add new schedule" />
	</form:form>

</body>
</html>