<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>

<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>
	<div class="container">
		<c:if test="${param.message eq true}">
			<div class="alert alert-success alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
				<strong>Schedule is added!</strong>
			</div>
		</c:if>
		<c:if test="${param.delete eq true}">
			<div class="alert alert-success alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
				<strong>Schedule is deleted!</strong>
			</div>
		</c:if>
		<c:if test="${param.edit eq true}">
			<div class="alert alert-success alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
				<strong>Schedule is edited!</strong>
			</div>
		</c:if>

		<h2>
			<a href="createSchedule" class="btn btn-info">Add Schedule</a>
		</h2>

		<form action="deleteSchedule">
			<table class="table table-hover">
				<tr>
					<th>Date and Time</th>
					<th>Delete</th>
					<th>Edit</th>
				</tr>
				<c:forEach items="${schedules}" var="schedule1">
					<tr>
						<td>${schedule1.dateTimeSchedule}</td>
						<td><input type="checkbox" name="checkbox"
							value="${schedule1.id}"></td>
						<td><a class="btn btn-primary"
							href="${pageContext.request.contextPath}/editSchedule/${schedule1.id}">Update</a></td>
					</tr>
				</c:forEach>

			</table>
			<br> <input class="btn btn-danger" type="submit" value="delete"
				id="delete" disabled />
		</form>
		<br>
	</div>
</body>
</html>