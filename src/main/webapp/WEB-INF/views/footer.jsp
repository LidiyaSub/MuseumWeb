<%@ include file="/resources/taglib.jsp"%>
<spring:url value="/showAllExcursions" var="urlAllExcursions" />
<spring:url value="/showAllAuthors" var="urlShowAuthors" />
<spring:url value="/showAllHalls" var="urlShowAllHalls" />
<spring:url value="/showAllSchedules" var="urlShowAllSchedules" />
<spring:url value="/showAllShowpieces" var="urlShowAllShowpieces" />
<spring:url value="/showAllWorkers" var="urlShowAllWorkers" />
<spring:url value="/assignWorkerToSchedule" var="urlAssignWorkerToSchedule" />
<nav class="navbar navbar-inverse ">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlShowAuthors}">Authors</a>
			<a class="navbar-brand" href="${urlAllExcursions}">Excursions</a>
			<a class="navbar-brand" href="${urlShowAllHalls}">Halls</a>
			<a class="navbar-brand" href="${urlShowAllSchedules}">Schedules</a>
			<a class="navbar-brand" href="${urlShowAllShowpieces}">Showpieces</a>
			<a class="navbar-brand" href="${urlShowAllWorkers}">Workers</a>
			<a class="navbar-brand" href="${urlAssignWorkerToSchedule}">Assign Worker To Schedule</a>
		</div>
		
	</div>
</nav>
<div class="container">
	<hr>
	<footer>
		<p>&copy; Artem and Lidiya 2015</p>
	</footer>
</div>