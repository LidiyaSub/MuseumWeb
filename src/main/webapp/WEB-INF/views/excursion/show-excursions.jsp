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
			<strong>Excursion deleted successfully!</strong>
		</div>
	</c:if>
	<c:if test="${param.msg eq true}">
		<div class="alert alert-success alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert" 
                                aria-label="Close">
				<span aria-hidden="true">×</span>
			</button>
			<strong>Excursion added successfully!</strong>
		</div>
	</c:if>
	<c:if test="${param.notify eq true}">
		<div class="alert alert-success alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert" 
                                aria-label="Close">
				<span aria-hidden="true">×</span>
			</button>
			<strong>Excursion updated successfully!</strong>
		</div>
	</c:if>
<h2>
		<a href="addNewExcursion" class="btn btn-info">Add new excursion</a>
	</h2>
	<form action="deleteExcursion">
		<table class="table table-hover">
			<tr>
				<th>Name</th>
				<th>Duration</th>
				<th>Schedule</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>

			<c:forEach items="${allExcursions}" var="excursion">
				<tr>
					<td>${excursion.nameExcursion}</td>
					<td>${excursion.duration}</td>
					<%-- 			<c:forEach items="${allSchedules}" var="schedule"> --%>
					<%-- 					<td><c:if test="${excursion.id eq schedule.id}">${schedule.dateTimeSchedule}</c:if></td> --%>
					<%-- 			</c:forEach> --%>
					<td>
					<c:forEach items="${excursion.listOfSchedule}" var="schedule">
						
							<li>${schedule.dateTimeSchedule}</li>
						
					</c:forEach>
					</td>
					<td><input type="checkbox" name="checkbox"
						value="${excursion.id}"></td>
					<td><a href="updateExcursion-${excursion.id}" class="btn btn-primary">Update</a></td>
				</tr>
			</c:forEach>

		</table>
		<br> <input type="submit" class="btn btn-danger" value="delete" id="delete" disabled />
	</form>
	
	</div>
</body>
</html>