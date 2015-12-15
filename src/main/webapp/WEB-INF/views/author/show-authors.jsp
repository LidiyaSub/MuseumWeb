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

<script type="text/javascript">
	<c:import url="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"/>
</script>

<script type="text/javascript">
	$(document).ready(
			function() {
				var submit = $("#delete"), cbs = $('input[name="checkbox"]')
						.click(function() {
							submit.removeAttr('disabled', cbs.is(":checked")).attr('disabled', !cbs.is(":checked"));
						});
			});
</script>
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