<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All authors</title>
<style type="text/css">
div {
	background-color: lightgreen;
}
</style>
</head>
<body>
	<c:if test="${param.message eq true}">
		<div>Author is added!</div>
	</c:if>
	<c:if test="${param.msg eq true}">
		<div>Author is updated!</div>
	</c:if>
	<c:if test="${param.notify eq true}">
		<div>Author is deleted!</div>
	</c:if>
	<table border="1">

		<tr>
			<th>Name and Surname</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${allAuthors}" var="author">
			<tr>
				<td>${author.nameAuthor}</td>
				<td><a href="updateAuthor-${author.id}">Update</a> | <a href="deleteAuthor-${author.id}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>
	<a href="createAuthor">Add Author</a>
</body>
</html>