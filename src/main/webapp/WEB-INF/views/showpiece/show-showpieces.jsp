<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Showpieces</title>
</head>
<body>
	<div>
		<a href="/">Main menu</a>
	</div>
	<c:if test="${param.message eq true}">
		<div>Showpieces is added!</div>
	</c:if>
	<c:if test="${param.msg eq true}">
		<div>Showpieces is updated!</div>
	</c:if>
	<c:if test="${param.notify eq true}">
		<div>Showpieces is deleted!</div>
	</c:if>
	<table border="1">

		<tr>
			<th>Name of Showpiece</th>
			<th>Date Income</th>
			<th>Materials</th>
			<th>Techincs</th>
			<th>Hall</th>
			<th>Author</th>
		</tr>
			<c:forEach items="${showpieces}" var="showpiece">
				<c:forEach items="${authors}" var="author1">
					<c:forEach items="${halls}" var="hall1">
						<c:if test="${showpiece.author.id eq author1.id}">
							<c:if test="${showpiece.hall.id eq hall1.id}">
							<tr>
								<td>${showpiece.nameShowpiece}</td>
								<td>${showpiece.dateIncome}</td>
								<td>${showpiece.materials}</td>
								<td>${showpiece.technics}</td>
								<td>${hall1.nameHall}</td>
								<td>${author1.nameAuthor}</td>
							</tr>
						</c:if>
						</c:if>
					</c:forEach>
				</c:forEach>
			</c:forEach>

	</table>
	<a href="createAuthor">Add Author</a>

</body>
</html>