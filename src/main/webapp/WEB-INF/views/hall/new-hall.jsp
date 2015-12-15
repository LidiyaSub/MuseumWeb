<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new Hall</title>
</head>
<body>

	<div>
		<a href="/">Main menu</a>
	</div>
<table border="1">
	<form:form action="saveHall" method="POST" >
	<tr>
		<th><label for="name_Hall">Hall name</label></th>
		<th><label for="worker_item">Responsible worker</label></th>
		<th><label for="showpiece_list">Showpieces</label></th>
	</tr>
	<tr>
		<td>
		<input name="nameHall" id="name_Hall" />
		</td>
		<td>
		<select name="worker" id="worker_item">
			<option value="0" label="--Select responsible--" />
			<c:forEach items="${workers}" var="worker">
				<option value="${worker.id}" label="${worker.nameWorker}" />
			</c:forEach>
		</select>
		</td>
		<td>
		<select name="showpieces" id="showpiece_list" multiple="multiple" size="3">
			<option value="0" label="--Select showpieces--" />
			<c:forEach items="${showpieces}" var="showpiece">
				<option value="${showpiece.id}" label="${showpiece.nameShowpiece}" />
			</c:forEach>
		</select>
		</td>
	</tr>
	<tr>
		<td colspan="3">
		<input type="submit" value="Add" />
		</td>
	</tr>
		</form:form>
</table>
</body>
</html>