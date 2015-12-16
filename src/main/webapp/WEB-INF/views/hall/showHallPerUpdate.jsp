<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update hall info</title>
</head>
<body>

	<div>
		<a href="/">Main menu</a>
	</div>
	<h2>Update hall ${hallInfo.nameHall}</h2>
	<table border="1">
		<form:form action="saveUpdateHall" method="POST"
			modelAttribute="hallInfo">
			<form:input path="id" type="hidden" value="${hallInfo.id}" />
			<tr>
				<th><label for="name">Name</label></th>
				<th><label for="worker_item">Responsible worker</label></th>
				
			</tr>
			<tr>
				<td><form:input path="nameHall" id="name" /></td>
				<td><select name="worker" id="worker_item">
						<option value="0" label="--Select responsible--" />
						<c:forEach items="${workerList}" var="workerItem">
							<option value="${workerItem.id}" label="${workerItem.nameWorker}" />
						</c:forEach>
				</select></td>
				
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Update" /></td>
			</tr>
			
		</form:form>
	</table>
	<form:form action="saveUpdateHall" method="POST"
		modelAttribute="hallInfo">
		<form:input path="id" type="hidden" value="${hallInfo.id}" />
		<label for="name">Name</label>
		<form:input path="nameHall" id="name" />
		<input name="commit" type="submit" value="Update" />
	</form:form>
</body>
</html>