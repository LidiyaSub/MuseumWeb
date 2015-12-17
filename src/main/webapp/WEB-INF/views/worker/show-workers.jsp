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
				<strong>Worker is added!</strong>
			</div>
		</c:if>
		<c:if test="${param.delete eq true}">
			<div class="alert alert-success alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
				<strong>Worker is deleted!</strong>
			</div>
		</c:if>
		<c:if test="${param.edit eq true}">
			<div class="alert alert-success alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
				<strong>Worker is edited!</strong>
			</div>
		</c:if>
		<h2>
			<a href="createWorker" class="btn btn-info">Add Worker</a>
		</h2>
		<form action="deleteWorker">
			<table class="table table-hover">
				<tr>
					<th>Name</th>
					<th>Position</th>
					<th>Salary</th>
				</tr>
				<c:forEach items="${workers}" var="worker">
					<tr>
						<td>${worker.nameWorker}</td>
						<td>${worker.position}</td>
						<td>${worker.salary}</td>
						<td><input type="checkbox" name="checkbox"
							value="${worker.id}"></td>
						<td><a class="btn btn-primary"
							href="${pageContext.request.contextPath}/editWorker/${worker.id}">Update</a></td>
					</tr>
				</c:forEach>
			</table>
			<br> <input class="btn btn-danger" type="submit" value="delete" id="delete" disabled />
		</form>

	</div>
</body>
</html>