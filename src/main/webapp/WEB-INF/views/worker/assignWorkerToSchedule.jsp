<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>

	<div class="container">

		<form:form action="assignWorkerToSchedule" method="POST"
			class="form-horizontal">
			<div class="form-group">
				<select name="workerName" class="form-control">
					<c:forEach items="${workers}" var="worker">
						<option value="${worker.id}" label="${worker.nameWorker}" />
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
				<select name="scheduleName" multiple="multiple" size="3" class="form-control">
					<c:forEach items="${schedules}" var="schedule">
						<option value="${schedule.id}"
							label="${schedule.dateTimeSchedule}" />
					</c:forEach>
				</select>
			</div>
			<input type="submit" value="Assign"
				class="btn-lg btn-primary pull-right">
		</form:form>
	</div>
</body>
</html>