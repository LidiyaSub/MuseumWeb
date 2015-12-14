<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit worker</title>
</head>
<body>

	<form:form
		action="${pageContext.request.contextPath}/editWorker/${worker.id}"
		method="POST" modelAttribute="worker">
		<label for="name">Name</label><br>
		<form:input path="nameWorker" id="name" value="" /><br>
		<label for="name">Position</label><br>
		<form:input path="position" id="position" /><br>
		<label for="name">Salary</label><br>
		<form:input path="salary" id="salary" /><br>
		<input name="commit" type="submit" value="Confirm" />
	</form:form>

</body>
</html>