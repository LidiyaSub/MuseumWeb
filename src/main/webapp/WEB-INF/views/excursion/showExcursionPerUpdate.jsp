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
				<th><label for="name_Excursion">Excursion name</label></th>
				<th><label for="for_duration">Duration</label></th>
				<th><label for="list_Schedules">Schedule</label></th>
			</tr>
			<tr>
				<td><form:input path="nameExcursion" /></td>
				<td><form:input path="duration" /></td>
				<td><select name="listOfSchedule" multiple="multiple"
					id="list_Schedules">
						<option value="0" label="--Select schedule--" />
						<c:forEach items="${scheduleList}" var="schedule">
							<option value="${schedule.id}"
								label="${schedule.dateTimeSchedule}" />
						</c:forEach>

					</select>
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