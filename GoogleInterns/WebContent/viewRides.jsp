<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Hitchhiker's Guide to Chippewa Valley</title>
		<meta name="description" content="A app to find and advertise rides in the Chippwea Valley">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="includes/styles.jsp" %>	
	</head>
	<body>
		<div class="container">
			<div>
				<a href="logout.jsp">Logout</a>  
				<a href="profile.jsp">Profile</a>  
			</div>
			<div>
				<div> 
					<h1>View Rides</h1>	
				</div>
				<%@ include file="includes/navigation.jsp" %>
	
				<div class="container">
					<jsp:include page="includes/rides.jsp"></jsp:include>
				</div>
				<%@ include file="includes/footer.jsp" %>
			</div>

		</div>
	</body>

</html>