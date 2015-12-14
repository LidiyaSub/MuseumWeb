<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update ${authorInfo.nameAuthor}</title>
</head>
<body>
	<h2>Update ${authorInfo.nameAuthor}</h2>
	<sf:form action="saveUpdate" method="POST" modelAttribute="authorInfo">
		<sf:input path="id" type="hidden" value="${authorInfo.id}" />
		<label for="name">Name</label>
		<sf:input path="nameAuthor" id="name" />

		<input name="commit" type="submit" value="Update" />
	</sf:form>
</body>
</html>