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
	<form:form action="saveUpdateHall" method="POST"
		modelAttribute="hallInfo">
		<form:input path="id" type="hidden" value="${hallInfo.id}" />
		<label for="name">Name</label>
		<form:input path="nameHall" id="name" />
		<input name="commit" type="submit" value="Update" />
	</form:form>
</body>
</html>