<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>
<div class="container">
	

	<form:form action="saveHall" method="POST" class="form-horizontal">
	<div class="form-group">
		<label for="name_Hall" class="col-sm-2 control-label">Hall name</label>
		<div class="col-sm-10">
		<input name="nameHall" id="name_Hall" class="form-control"/>
		</div>
	</div>
	<div class="form-group">	
		<label for="worker_item" class="col-sm-2 control-label">Responsible worker</label>
		<div class="col-sm-5">
		<select name="worker" id="worker_item" class="form-control">
			<option value="0" label="--Select responsible--" />
			<c:forEach items="${workers}" var="workerItem">
				<option value="${workerItem.id}" label="${workerItem.nameWorker}" />
			</c:forEach>
		</select>
		</div>
		<div class="col-sm-5">
		</div>
	</div>	
	
	<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
		<input type="submit" value="Add" class="btn-lg btn-primary pull-right"/>
		</div>
		</div>
	</form:form>
	
</div>
<jsp:include page="../footer.jsp" />
</body>
</html>