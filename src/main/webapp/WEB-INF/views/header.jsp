<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<head>
<title>Museum manager</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<spring:url value="/" var="urlHome" />
<spring:url value="/showAllExcursions" var="urlShowExcursions" />
<nav class="navbar navbar-inverse ">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${urlHome}">Museum</a>
		</div>
		<div id="navbar">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="${urlShowExcursions}">Show excursions and schedule</a></li>
			</ul>
		</div>
	</div>
</nav>