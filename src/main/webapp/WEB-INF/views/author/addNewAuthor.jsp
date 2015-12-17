<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/resources/taglib.jsp"%>
<!DOCTYPE html>
<html>
<jsp:include page="../header.jsp" />

<body>
	<div class="container">

		<form:form action="saveAuthor" method="POST" modelAttribute="author"
			class="form-horizontal">
			<div class="form-group">
				<label for="name" class="col-sm-2 control-label">Name</label>
				<div class="col-sm-10">
					<form:input path="nameAuthor" id="name" class="form-control" />
					<input name="commit" type="submit" value="Add"
						class="btn-lg btn-primary pull-right" />
				</div>
			</div>
		</form:form>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>