<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add new author</title>
</head>
<body>
	<div>
		<a href="/">Main menu</a>
	</div>
	<form:form action="saveAuthor" method="POST" modelAttribute="author">
		<label for="name">Name</label>
		<form:input path="nameAuthor" id="name" />
		<input name="commit" type="submit" value="Add"/>
	</form:form>
</body>
</html>