<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<link href="/resources/css/bootstrap.min.css" rel="stylesheet" />
<link href="/resources/css/jquery-ui.css" rel="stylesheet" />

<script type="text/javascript">
	<c:import url="/resources/js/jquery.min.js"/>
</script>

<script type="text/javascript">
	<c:import url="/resources/js/bootstrap.min.js"/>
</script>

<script type="text/javascript">
	<c:import url="/resources/js/jquery-ui.min.js"/>
</script>


<script type="text/javascript">
	<c:import url="/resources/js/jquery.timepicker.min.js"/>
</script>

<script type="text/javascript">
	$(document).ready(
			function() {
				var submit = $("#delete"), cbs = $('input[name="checkbox"]')
						.click(
								function() {
									submit.removeAttr('disabled',cbs.is(":checked")).attr('disabled', !cbs.is(":checked"));
								});
			});
</script>
</head>