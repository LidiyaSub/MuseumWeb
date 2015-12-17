<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />
<body>
<div class="container">
	
	<h2>Update ${authorInfo.nameAuthor}</h2>
	<form:form action="saveUpdate" method="POST" modelAttribute="authorInfo" class="form-horizontal">
		
		<form:input path="id" type="hidden" value="${authorInfo.id}" />
		<div class="form-group">
		<label for="name" class="col-sm-2 control-label" >Name</label>
		<div class="col-sm-10">
		<form:input path="nameAuthor" id="name" class="form-control" />
		</div>
		</div>
		
		<input name="commit" type="submit" value="Update" class="btn-lg btn-primary pull-right" />
	
	</form:form>
	</div>
<jsp:include page="../footer.jsp" />
</body>
</html>