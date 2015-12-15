<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new author</title>
</head>
<body>
	<div>
		<a href="/">Main menu</a>
	</div>
	<sf:form action="saveAuthor" method="POST" modelAttribute="author">
		<label for="name">Name</label>
		<sf:input path="nameAuthor" id="name" />
		<input name="commit" type="submit" value="Add"/>
	</sf:form>
</body>
</html>