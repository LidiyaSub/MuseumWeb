<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
		
	</tr>
	<tr>
		<td>
		<input name="nameHall" id="name_Hall" />
		</td>
		<td>
		<select name="worker" id="worker_item">
			<option value="0" label="--Select responsible--" />
			<c:forEach items="${workers}" var="workerItem">
				<option value="${workerItem.id}" label="${workerItem.nameWorker}" />
			</c:forEach>
		</select>
		</td>
		
	</tr>
	<tr>
		<td colspan="3">
		<input type="submit" value="Add" />
		</td>
	</tr>
	<table border="1">
		<form:form action="saveHall" method="POST">
			<tr>
				<th><label for="name_Hall">Hall name</label></th>
				<th><label for="worker_item">Responsible worker</label></th>
				<th><label for="showpiece_list">Showpieces</label></th>
			</tr>
			<tr>
				<td><input name="nameHall" id="name_Hall" /></td>
				<td><select name="worker" id="worker_item">
						<option value="0" label="--Select responsible--" />
						<c:forEach items="${workers}" var="worker">
							<option value="${worker.id}" label="${worker.nameWorker}" />
						</c:forEach>
				</select></td>
				<td><select name="showpieces" id="showpiece_list"
					multiple="multiple" size="3">
						<option value="0" label="--Select showpieces--" />
						<c:forEach items="${showpieces}" var="showpiece">
							<option value="${showpiece.id}"
								label="${showpiece.nameShowpiece}" />
						</c:forEach>
				</select></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Add" /></td>
			</tr>
		</form:form>
	</table>
</body>
</html>