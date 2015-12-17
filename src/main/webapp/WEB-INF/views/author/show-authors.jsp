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
			<strong>Author added successfully!</strong>
		</div>
		</c:if>
		<c:if test="${param.msg eq true}">
			<div class="alert alert-success alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert" 
                                aria-label="Close">
				<span aria-hidden="true">×</span>
			</button>
			<strong>Author updated successfully!</strong>
		</div>
		</c:if>
		<c:if test="${param.notify eq true}">
			<div class="alert alert-success alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert" 
                                aria-label="Close">
				<span aria-hidden="true">×</span>
			</button>
			<strong>Author deleted successfully!</strong>
		</div>
		</c:if>
		<h2>
		<a href="createAuthor" class="btn btn-info">Add Author</a>
		</h2>
		<form action="deleteAuthor">
			<table class="table table-hover">

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
						<td><a class="btn btn-primary"
							href="updateAuthor-${author.id}">Update</a></td>
					</tr>
				</c:forEach>
			</table>
			<div class="form-group">
				
			 <input class="btn btn-danger" type="submit" value="delete"
				id="delete" disabled />
				
				</div>
		</form>

	</div>
<jsp:include page="../footer.jsp" />
</body>
</html>