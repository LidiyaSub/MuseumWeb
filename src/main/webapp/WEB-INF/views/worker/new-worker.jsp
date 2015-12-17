<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>

<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>

	<div class="container">
		<h2>Create new worker</h2>
		<form:form action="saveWorker" method="POST" modelAttribute="worker"
			class="form-horizontal">
			<div class="form-group">
				<label class="col-sm-2 control-label">Name</label>
				<div class="col-sm-10">
					<form:input path="nameWorker" id="name" class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Position</label>
				<div class="col-sm-10">
					<form:input path="position" id="position" class="form-control" />
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">Salary</label>
				<div class="col-sm-10">
					<form:input path="salary" id="salary" class="form-control" />
				</div>
			</div>
			<input type="submit" name="commit" value="Add"
				class="btn-lg btn-primary pull-right" />
		</form:form>

	</div>
</body>
</html>