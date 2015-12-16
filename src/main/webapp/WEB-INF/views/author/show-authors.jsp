<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All authors</title>
<style type="text/css">
div {
	background-color: lightgreen;
}
</style>
</head>
<body>

	<div>
		<a href="/">Main menu</a>
	</div>
	<c:if test="${param.message eq true}">
		<div>Author is added!</div>
	</c:if>
	<c:if test="${param.msg eq true}">
		<div>Author is updated!</div>
	</c:if>
	<c:if test="${param.notify eq true}">
		<div>Author is deleted!</div>
	</c:if>
	
	<form action="deleteAuthor">
	<table border="1">

		<tr>
			<th>Name and Surname</th>
			<th>Delete</th>
			<th>Edit</th>
		</tr>
		<c:forEach items="${allAuthors}" var="author">
			<tr>
				<td>${author.nameAuthor}</td>
				<td><input type="checkbox" name="checkbox"
						value="${author.id}"></td>
				<td><a href="updateAuthor-${author.id}">Update</a></td>
			</tr>
		</c:forEach>
	</table>
	<br> <input type="submit" value="delete" id="delete" disabled />
	</form>
	<a href="createAuthor">Add Author</a>
</body>
</html>