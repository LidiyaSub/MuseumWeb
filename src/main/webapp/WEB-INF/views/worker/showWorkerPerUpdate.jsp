<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>

	<div class="container">
		<h2>Update ${worker.nameWorker}</h2>
		<form:form
			action="${pageContext.request.contextPath}/editWorker/${worker.id}"
			method="POST" modelAttribute="worker" class="form-horizontal">
			<div class="form-group">
				<label>Name</label> <br>
				<form:input path="nameWorker" id="name" />
				<br> <label>Position</label> <br>
				<form:input path="position" id="position" />
				<br> <label>Salary</label> <br>
				<form:input path="salary" id="salary" />
				<br> <input name="commit" type="submit" value="Confirm" />
			</div>
		</form:form>
	</div>

<jsp:include page="../footer.jsp" />

</body>
</html>