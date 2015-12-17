<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>
	<div class="container">

		<h2>Update ${showpiece.nameShowpiece}</h2>
		<form:form action="${pageContext.request.contextPath}/editShowpiece" method="POST"
			class="form-horizontal" modelAttribute="showpiece">
			<form:hidden path="id" value="${showpiece.id}" />
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Name
					Showpiece</label>
				<div class="col-sm-10">
					<form:input path="nameShowpiece" class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Date Income</label>
				<div class="col-sm-10">
					<form:input path="dateIncome" id="datetimepicker"
						class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Materials</label>
				<div class="col-sm-10">
					<form:input path="materials" class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Technics</label>
				<div class="col-sm-10">
					<form:input path="technics" class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Hall</label>
				<div class="col-sm-5">
					<select name="hallId" size="5"
						id="list_Schedules" class="form-control">
						<option value="0" label="--Select hall--" />
						<c:forEach items="${halls}" var="hall">
							<option value="${hall.id}" label="${hall.nameHall}" />
						</c:forEach>
					</select>
				</div>
			</div>

			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Author</label>
				<div class="col-sm-5">
					<select name="authorId" size="5"
						id="list_Schedules" class="form-control">
						<option value="0" label="--Select hall--" />
						<c:forEach items="${authors}" var="author">
							<option value="${author.id}" label="${author.nameAuthor}" />
						</c:forEach>
					</select>
				</div>
			</div>
			<input type="submit" name="commit" value="Add"
				class="btn-lg btn-primary pull-right" />
		</form:form>

	</div>
<jsp:include page="../footer.jsp" />
</body>
</html>