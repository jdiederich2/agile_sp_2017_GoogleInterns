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
			<nav>
				<a href="logout.jsp">Logout</a>  
				<a href="ProfilePage">Profile</a>  
			</nav>
			<div>
				<div> 
					<h1>The Hitchhicker's Guide to Chippewa Valley</h1>	
					<br>

				</div>
<%@ include file="includes/navigation.jsp" %>
				<div class="content">
					<div id = "home">
						<h2>Need a ride? Need money for gas? Try Chippewa Valley rideshare, it's easier then sticking out your thumb!!</h2>
						<p>This app will allow you to advertise rides to events and locations along with finding out if people are going where you are.
						With this rideshare application you can feel better about what kind of carbon footprint you leave.</p>
					</div>
					<div class="infoBoxes">
						<div class="tile"></div>
						<div class="tile"></div>
						<div class="tile"></div>
						<div class="tile"></div>
					</div>
				</div>
<%@ include file="includes/footer.jsp" %>
			</div>
		</div>
	</body>

</html>
