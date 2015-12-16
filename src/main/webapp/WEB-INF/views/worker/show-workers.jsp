<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Workers</title>


<style type="text/css">
div {
	background-color: lightgreen;
}
</style>

</head>
<body>

	<div>
		<a href="/">Main menu</a>
	</div>

	<c:if test="${param.message eq true}">
		<div>Worker is added!</div>
	</c:if>
	<c:if test="${param.delete eq true}">
		<div>Worker is deleted!</div>
	</c:if>
	<c:if test="${param.edit eq true}">
		<div>Worker is edited!</div>
	</c:if>

	<h1>Worker</h1>
	<form action="deleteWorker">
		<table border="1">
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
					<td><a
						href="${pageContext.request.contextPath}/editWorker/${worker.id}">edit</a></td>
				</tr>
			</c:forEach>
		</table>
		<br> <input type="submit" value="delete" id="delete" disabled />
	</form>
	<br>
	<br>

	<form:form action="saveWorker" method="POST" modelAttribute="worker">
		<label for="name">Name</label>
		<br>
		<form:input path="nameWorker" id="name" />
		<br>
		<label for="name">Position</label>
		<br>
		<form:input path="position" id="position" />
		<br>
		<label for="name">Salary</label>
		<br>
		<form:input path="salary" id="salary" />
		<br>
		<input type="submit" name="commit" value="Add worker" />
	</form:form>

</body>
</html>