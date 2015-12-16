<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<jsp:include page="header.jsp" />
<body>
<div class="container">
<h1>Museum manager</h1>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>Showpiece name</th>
				<th>Technics</th>
				<th>Materials</th>
				<th>Date of Income</th>
				<th>Name of author</th>
				<th>Name of hall</th>
				<th>Responsible worker</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${showpieces}" var="showpiece">
				<tr>
					<td>${showpiece.nameShowpiece}</td>
					<td>${showpiece.technics}</td>
					<td>${showpiece.materials}</td>
					<td>${showpiece.dateIncome}</td>
					<c:forEach items="${authors}" var="author">
						<c:if test="${showpiece.author.id eq author.id}">
							<td>${author.nameAuthor}</td>
						</c:if>
					</c:forEach>
					<c:forEach items="${halls}" var="hall">
						<c:if test="${showpiece.hall.id eq hall.id}">
							<td>${hall.nameHall}</td>
							<c:forEach items="${workers}" var="worker">
								<c:if test="${showpiece.hall.worker.id eq worker.id}">
									<td>${worker.nameWorker}</td>
								</c:if>
							</c:forEach>
						</c:if>
					</c:forEach>
				</tr>
			</c:forEach>
		</tbody>

	</table>


	
	<h2>
		<a href="showAllAuthors">Show all authors</a>
	</h2>
	<h2>
		<a href="showAllExcursions">Show all excursion</a>
	</h2>
	<h2>
		<a href="showAllHalls">Show all halls</a>
	</h2>
	<h2>
		<a href="showAllSchedules">Show all schedules</a>
	</h2>
	<h2>
		<a href="showAllShowpieces">Show all showpieces</a>
	</h2>
	<h2>
		<a href="showAllWorkers">Show all workers</a>
	</h2>
	<h2>
		<a href="assignWorkerToSchedule">Assign worker to schedule</a>
	</h2>
	</div>
</body>
</html>