<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>

<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>
	<div class="container">

		<form:form action="saveSchedule" method="POST"
			modelAttribute="schedule">
			<label>Date</label>
			<br>
			<form:input path="dateTimeSchedule" id="datepicker" />
			<input name="commit" type="submit" value="Add new schedule" />
		</form:form>
		
	</div>
<jsp:include page="../footer.jsp" />
</body>
</html>