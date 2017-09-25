<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>New User Registration: Error</title>
		<meta name= "description" content="This is a JSP that displays an Error response for adding a new user.">
<%@ include file="includes/styles.jsp" %>		
	</head>
	<body>
		<div>
			<div>
				<h1>Error</h1>
			</div>
<%@ include file="includes/navigation.jsp" %>
			<div>
				<p>I'm sorry, but we seem to have a problem.</p>
				<c:choose>
					<c:when test="${message != null}">
						<p>${message}</p>
					</c:when>
					<c:otherwise>
						<p>To continue, click the back button.</p>
						<p><strong>Error Details</strong></p>
						<p>Type: ${pageContext.exception["class"]}</p>
						<p>Message: ${pageContext.exception.message}</p>
					</c:otherwise>
				</c:choose>				
			</div>
<%@ include file="includes/footer.jsp" %>
		</div>
<%@ include file="includes/scripts.jsp" %>
	</body>
</html>
