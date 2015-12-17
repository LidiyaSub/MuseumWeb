<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>
	<div class="container">


		<form:form action="saveUpdatedExcursion" method="POST"
			modelAttribute="excursion" class="form-horizontal">
			<form:hidden path="id" value="${excursion.id}" />

			<div class="form-group">
				<label for="name_Excursion" class="col-sm-2 control-label">Excursion
					name</label>
				<div class="col-sm-10">
					<form:input path="nameExcursion" class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label for="for_duration" class="col-sm-2 control-label">Duration</label>
				<div class="col-sm-10">
					<form:input path="duration" class="form-control" />
				</div>
			</div>

			<div class="form-group">
				<label for="list_Schedules" class="col-sm-2 control-label">Schedule</label>
				<div class="col-sm-5">
					<select name="listOfSchedule" multiple="multiple"
						id="list_Schedules" class="form-control" size="5">
						<option value="0" label="--Select schedule--" />
						<c:forEach items="${scheduleList}" var="schedule">
							<option value="${schedule.id}"
								label="${schedule.dateTimeSchedule}" />
						</c:forEach>

					</select>
				</div>
				<div class="col-sm-5"></div>
			</div>


			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" value="Update"
						class="btn-lg btn-primary pull-right" />
				</div>
			</div>
		</form:form>

	</div>
</body>
</html>