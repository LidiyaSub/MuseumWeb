<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update hall info</title>
</head>
<body>
<h2>Update hall ${hallInfo.nameHall}</h2>
	<sf:form action="saveUpdateHall" method="POST" modelAttribute="hallInfo">
		<sf:input path="id" type="hidden" value="${hallInfo.id}" />
		<label for="name">Name</label>
		<sf:input path="nameHall" id="name" />
<!-- some code -->
		<input name="commit" type="submit" value="Update" />
	</sf:form>
</body>
</html>