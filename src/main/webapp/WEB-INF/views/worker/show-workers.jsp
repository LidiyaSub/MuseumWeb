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
			<a href="createAuthor" class="btn btn-info">Add Worker</a>
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
			<div class="form-group">
			 <input class="btn btn-danger" type="submit" value="delete" id="delete" disabled />
		</div>
		</form>

		<form:form action="saveWorker" method="POST" modelAttribute="worker">
			<div class="form-group">
				<label for="name">Name</label> <br>
				<form:input path="nameWorker" id="name" />
				<br>
			</div>
			<div class="form-group">
				<label for="name">Position</label> <br>
				<form:input path="position" id="position" />
				<br>
			</div>
			<div class="form-group">
				<label for="name">Salary</label> <br>
				<form:input path="salary" id="salary" />
				<br>
			</div>
			<div class="form-group">
				
			<input type="submit" name="commit" value="Add worker" class="btn btn-primary" />
			
			</div>
		</form:form>
	</div>
<jsp:include page="../footer.jsp" />
</body>
</html>