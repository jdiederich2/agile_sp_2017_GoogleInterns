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
				<h1>Add a Ride Request</h1>	
			</div>
<%@ include file="includes/navigation.jsp" %>
			<div class="container">
				<p>Fill out the below form to request or advertise a ride share.</p>
			</div>
	        <form method="post" action="AddRide">
	        	<table>
	                <thead>
	                    <tr>
	                	    <th colspan="2">New Ride Information</th>
	                    </tr>
	                </thead>
	                <tbody>
	                    <tr>
	                        <td>User Name</td>
	                        <td><input type="text" name="userName" value="" placeholder="User Name" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Looking For</td>
	                        <td>
	                        	<input type="radio" name="userType" value="Driver" required="required"> Driver
	                        	<input type="radio" name="userType" value="Passenger" required="required"> Passenger
	                        </td>
	                    </tr>
	                    <tr>
	                        <td>Start Location</td>
	                        <td><input type="text" name="startLocation" value="" placeholder="Start location" required /></td>
	                    </tr>
	                    <tr>
	                        <td>End Location</td>
	                        <td><input type="text" name="endLocation" value="" placeholder="End location" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Travel Date</td>
	                        <td><input type="date" name="travelDate" value="" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Travel Time</td>
	                        <td><input type="time" name="travelTime" value="12:00" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Return Date</td>
	                        <td><input type="date" name="returnDate" value="" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Return Time</td>
	                        <td><input type="time" name="returnTime" value="12:00" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Number Of Passengers</td>
	                        <td><input type="number" name="numPassengers" min="1" step="1" max="20" value="1" required/></td>	                        
	                    </tr>
	                    <tr>
	                        <td>Smoking or Non-smoking</td>
	                        <td>
	                        	<input type="radio" name="smokeChoice" value="Smoking" required="required"> Smoking
	                        	<input type="radio" name="smokeChoice" value="Non-Smoking" required="required"> Non-Smoking
	                        </td>
	                    </tr>
	                    <tr>
	                        <td>Gas Cost</td>
	                        <td>$<input type="number" name="gasCost" min="0.01" step="0.01" max="2500" value="25.67" required/></td>	                        
	                    </tr>
	                    <tr>
	                    	<td><input type="submit" value="Add New Ride" /></td>
	                        <td><input type="reset" value="Reset" /></td>
	                	</tr>                	
	            	</tbody>
	        	</table>
	        </form>
			<hr>
<%@ include file="includes/footer.jsp" %>
		</div>
	</body>

</html>