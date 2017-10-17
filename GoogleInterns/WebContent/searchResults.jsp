<!DOCTYPE html>
<html>
	<head>
		<title>Hitchhiker's Guide to Chippewa Valley</title>
		<meta name="description" content="A app to find and advertise rides in the Chippwea Valley">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="includes/styles.jsp" %>
	</head>
	<body>
		<div class="container">
			<div class ="hero-unit"> 
				<h1>Search Results</h1>	
			</div>
<%@ include file="includes/navigation.jsp" %>
			<div class="content">
				<p> Please see below rides that match your search:</p>
			</div>
			<div>
				<jsp:include page="includes/rides.jsp"></jsp:include>
			</div>
			<hr>
<%@ include file="includes/footer.jsp" %>
		</div>
	<%@ include file="includes/scripts.jsp" %>
	</body>
</html>