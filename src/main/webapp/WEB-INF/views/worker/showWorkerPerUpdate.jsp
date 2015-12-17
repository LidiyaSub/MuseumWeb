<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit worker</title>
</head>
<body>

	<div>
		<a href="/">Main menu</a>
	</div>

	<form:form
		action="${pageContext.request.contextPath}/editWorker/${worker.id}"
		method="POST" modelAttribute="worker">
		<label>Name</label>
		<br>
		<form:input path="nameWorker" id="name" />
		<br>
		<label>Position</label>
		<br>
		<form:input path="position" id="position" />
		<br>
		<label>Salary</label>
		<br>
		<form:input path="salary" id="salary" />
		<br>
		<input name="commit" type="submit" value="Confirm" />
	</form:form>
<jsp:include page="../footer.jsp" />
</body>
</html>