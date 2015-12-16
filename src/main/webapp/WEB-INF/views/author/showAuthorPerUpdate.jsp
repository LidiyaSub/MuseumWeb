<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update ${authorInfo.nameAuthor}</title>
</head>
<body>

	<div>
		<a href="/">Main menu</a>
	</div>
	<h2>Update ${authorInfo.nameAuthor}</h2>
	<form:form action="saveUpdate" method="POST" modelAttribute="authorInfo">
		<form:input path="id" type="hidden" value="${authorInfo.id}" />
		<label for="name">Name</label>
		<form:input path="nameAuthor" id="name" />

		<input name="commit" type="submit" value="Update" />
	</form:form>
</body>
</html>