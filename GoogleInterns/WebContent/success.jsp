<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Movies: Success</title>
		<meta name= "description" content="JSP Success Page">
		<%@ include file="includes/styles.jsp" %>		
	</head>
	<body>
		<div class="container">
			<div>
				<h1>Success!</h1>
			</div>
			<%@ include file="includes/navigation.jsp" %>
			<div>
				<p>The new user was successfully added!</p>
			</div>
			<%@ include file="includes/footer.jsp" %>
		</div>
		<%@ include file="includes/scripts.jsp" %>
	</body>
</html>