<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>

	<div class="container">
		<form:form action="${pageContext.request.contextPath}/editSchedule"
			method="POST" modelAttribute="schedule" class="form-horizontal">
			<form:input path="id" type="hidden" value="${schedule.id}" />
			<div class="form-group">
				<label for="datepicker" class="col-sm-2 control-label">Date</label>
				<br>
				<div class="col-sm-10">
					<form:input path="id" id="datetimepicker" class="form-control"
						value="${schedule.dateTimeSchedule}" />
					<input name="commit" type="submit" value="Update"
						class="btn-lg btn-primary pull-right" />
				</div>
			</div>
		</form:form>
	</div>

</body>
</html>