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
			<strong>Hall added successfully!</strong>
		</div>
	</c:if>
	<c:if test="${param.msg eq true}">
	
		<div class="alert alert-success alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert" 
                                aria-label="Close">
				<span aria-hidden="true">×</span>
			</button>
			<strong>Hall updated successfully!</strong>
		</div>
	</c:if>
	<c:if test="${param.notify eq true}">
		<div class="alert alert-success alert-dismissible" role="alert">
			<button type="button" class="close" data-dismiss="alert" 
                                aria-label="Close">
				<span aria-hidden="true">×</span>
			</button>
			<strong>Hall deleted successfully!</strong>
		</div>
	</c:if>
<h2>
		<a href="addHall" class="btn btn-info">Add new HALL</a>
	</h2>
	<form action="deleteHall">
		<table class="table table-hover">
			<tr>
				<th>Hall name</th>
				<th>Responsible for the hall</th>
				<th>Delete</th>
				<th>Update</th>
			</tr>

			<c:forEach items="${allHalls}" var="hall">
				<tr>
					<td>${hall.nameHall}</td>
					<td>${hall.worker.nameWorker}</td>

					<td><input type="checkbox" name="checkbox" value="${hall.id}"></td>
					<td><a href="updateHall-${hall.id}" class="btn btn-primary">Update</a></td>
				</tr>
			</c:forEach>

		</table>
		<div class="form-group">
		 <input type="submit" class="btn btn-danger" value="delete" id="delete" disabled />
	</div>
	</form>
	
	</div>
<jsp:include page="../footer.jsp" />
</body>
</html>