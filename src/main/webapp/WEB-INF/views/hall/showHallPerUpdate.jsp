<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>
	<div class="container">
	<h2>Update hall ${hallInfo.nameHall}</h2>

		<form:form action="saveUpdateHall" method="POST"
			modelAttribute="hallInfo" class="form-horizontal">
			<form:input path="id" type="hidden" value="${hallInfo.id}" />

			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Name</label>
				<div class="col-sm-10">
					<form:input path="nameHall" id="name" class="form-control" />
				</div>
			</div>

			<div class="form-group">
				<label for="worker_item" class="col-sm-2 control-label">Responsible
					worker</label>
				<div class="col-sm-5">
					<select name="worker" id="worker_item" class="form-control">
						<option value="0" label="--Select responsible--" />
						<c:forEach items="${workerList}" var="workerItem">
							<option value="${workerItem.id}" label="${workerItem.nameWorker}" />
						</c:forEach>
					</select>
				</div>
				<div class="col-sm-5"></div>
			</div>


			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<input type="submit" value="Update"
						class="btn-lg btn-primary pull-right" />
				</div>
			</div>

		</form:form>

	</div>
<jsp:include page="../footer.jsp" />
</body>
</html>