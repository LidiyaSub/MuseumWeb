<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
</body>
</html>