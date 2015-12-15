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
	<form:form action="saveHall" method="POST" modelAttribute="hallInfo">
	<tr>
		<th><form:label path="nameHall">Hall name</form:label></th>
		<th><form:label path="worker">Responsible worker</form:label></th>
		<th><form:label path="showpiece">Showpieces</form:label></th>
	</tr>
	<tr>
		<td>
		<form:input path="nameHall" />
		</td>
		<td>
		<form:select path="worker">
			<form:option value="0" label="Select responsible" />
			<form:options items="${workerList}" itemValue="id"
				itemLabel="nameWorker" />
		</form:select>
		</td>
		<td>
		<form:select path="showpiece" multiply="true">
			<form:option value="0" label="Select showpieces" />
			<form:options items="${showpieceList}" itemValue="id"
				itemLabel="nameShowpiece" />
		</form:select>
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