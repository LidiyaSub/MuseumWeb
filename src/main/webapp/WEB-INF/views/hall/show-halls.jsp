<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show all halls</title>
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
		<div>Hall is added!</div>
	</c:if>
	<c:if test="${param.msg eq true}">
		<div>Hall is updated!</div>
	</c:if>
	<c:if test="${param.notify eq true}">
		<div>Hall is deleted!</div>
	</c:if>

	<form action="deleteHall">
		<table border="1">
			<tr>
				<th>Hall name</th>
				<th>Responsible for the hall</th>
				<th>Showpieces</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>

			<c:forEach items="${allHalls}" var="hall">
				<tr>
					<td>${hall.nameHall}</td>
					<td>${hall.worker.nameWorker}</td>
					<td><c:forEach items="${allShowpieces}" var="showpiece">
							<c:if test="${showpiece.hall.id eq hall.id}">
								<li>${showpiece.nameShowpiece}</li>
							</c:if>
						</c:forEach></td>
					<td><input type="checkbox" name="checkbox" value="${hall.id}"></td>
					<td><a href="updateHall-${hall.id}">Update</a></td>
				</tr>
			</c:forEach>

		</table>
		<br> <input type="submit" value="delete" id="delete" disabled />
	</form>
	<h2>
		<a href="addHall">Add new HALL</a>
	</h2>
</body>
</html>