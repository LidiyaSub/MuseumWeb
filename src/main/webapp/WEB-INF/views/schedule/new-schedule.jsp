<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>

<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>

	<div class="container">
		<h2>Create new schedule</h2>
		<form:form action="saveSchedule" method="POST"
			modelAttribute="schedule" class="form-horizontal">
			<div class="form-group">
				<label for="datepicker" class="col-sm-2 control-label">Date</label>
				<div class="col-sm-10">
					<form:input path="dateTimeSchedule" id="datetimepicker"
						class="form-control" />
				</div>
				<input name="commit" type="submit" value="Add new schedule"
					class="btn-lg btn-primary pull-right" />
			</div>
		</form:form>

	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>