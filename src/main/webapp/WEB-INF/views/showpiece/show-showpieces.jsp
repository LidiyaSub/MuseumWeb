<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>

<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>
	<div class="container">
		<c:if test="${param.message eq true}">
			<div class="alert alert-success alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
				<strong>Showpieces is added!</strong>
			</div>
		</c:if>
		<c:if test="${param.msg eq true}">
			<div class="alert alert-success alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
				<strong>Showpieces is updated!</strong>
			</div>
		</c:if>
		<c:if test="${param.notify eq true}">
			<div class="alert alert-success alert-dismissible" role="alert">
				<button type="button" class="close" data-dismiss="alert"
					aria-label="Close">
					<span aria-hidden="true">×</span>
				</button>
				<strong>Showpieces is deleted!</strong>
			</div>
		</c:if>

		<h2>
			<a href="createShowpiece" class="btn btn-info">Add Showpiece</a>
		</h2>

		<form action="deleteShowpiece">
			<table class="table table-hover">

				<tr>
					<th>Name of Showpiece</th>
					<th>Date Income</th>
					<th>Materials</th>
					<th>Technics</th>
					<th>Hall</th>
					<th>Author</th>
					<th>Delete</th>
					<th>Edit</th>
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
										<td><input type="checkbox" name="checkbox"
											value="${showpiece.id}"></td>
										<td><a
											href="${pageContext.request.contextPath}/editShowpiece/${showpiece.id}"
											class="btn btn-primary">Update</a></td>
									</tr>
								</c:if>
							</c:if>
						</c:forEach>
					</c:forEach>
				</c:forEach>

			</table>
			<br> <input class="btn btn-danger" type="submit" value="delete"
				id="delete" disabled />
		</form>
		<br>
	</div>
</body>
</html>