<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update ${excursion.nameExcursion}</title>
</head>
<body>

	<div>
		<a href="/">Main menu</a>
	</div>
<table border="1">
		<form:form action="saveUpdatedExcursion" method="POST"
			modelAttribute="excursion">
			<form:hidden path="id" value="${excursion.id}"/>
			<tr>
				<th><form:label path="nameExcursion">Excursion name</form:label>
				</th>
				<th><form:label path="duration">Duration</form:label></th>
				<th><form:label path="listOfSchedule">Schedule</form:label></th>
			</tr>
			<tr>
				<td><form:input path="nameExcursion" /></td>
				<td><form:input path="duration" /></td>
				<td><form:select path="listOfSchedule" multiply="true">
						<form:option value="0" label="--Select schedule--"></form:option>
						<form:options items="${scheduleList}" itemValue="id"
							itemLabel="day" />
					</form:select>
				</td>

			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Update" align="right" />
				</td>
			</tr>
		</form:form>
		</table>
</body>
</html>