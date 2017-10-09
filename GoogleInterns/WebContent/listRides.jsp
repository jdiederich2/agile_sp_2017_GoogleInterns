<!DOCTYPE html>
<html>
	<head>
		<title>Hitchhicker's Guide to Chippewa Valley</title>
		<meta name="description" content="A app to find and advertise rides in the Chippwea Valley">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="includes/styles.jsp" %>
	</head>
	<body>
		<div class="container">
			<div class ="hero-unit"> 
				<h1>All Rides</h1>	
			</div>
<%@ include file="includes/navigation.jsp" %>
			<div class="container">
				<p> Please see below all current listed requested or advertised rides.</p>
			</div>
			<div>
				<jsp:include page="includes/rides.jsp"></jsp:include>
			</div>
			<hr>
<%@ include file="includes/footer.jsp" %>
		</div>
	</body>

</html>