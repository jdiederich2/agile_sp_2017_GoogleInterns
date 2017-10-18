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
				<h1>Find a Ride</h1>	
			</div>
	
			
<%@ include file="includes/navigation.jsp" %>
			<div class="content">
				<p> Search for a ride and passengers by Starting or Ending City.</p>
				
				<form action="Search">
					<label for="startingCity"><strong>Search by Starting City:</strong></label>
					<input name="startingCity">
					<input type="hidden" name="searchType" value="startingCity">
					<input type="submit" value="Search!">
				</form>
				<form action="Search">
					<label for="endingCity"><strong>Search by Ending City:</strong></label>
					<input name="endingCity">
					<input type="hidden" name="searchType" value="endingCity">
					<input type="submit" value="Search!">
				</form>		
			</div>
<%@ include file="includes/footer.jsp" %>
		</div>
	</body>

</html>