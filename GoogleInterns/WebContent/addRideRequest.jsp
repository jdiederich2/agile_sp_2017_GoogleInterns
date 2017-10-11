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
	                        <td><input type="email" name="userName" value="" placeholder="User Name" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Looking For</td>
	                        <td>
	                        	<input type="radio" name="driverOrPassanger" value="Driver" required="required"> Driver
	                        	<input type="radio" name="driverOrPassanger" value="Passenger" required="required"> Passenger
	                        </td>
	                    </tr>
	                    <tr>
	                        <td>Start Address Line 1</td>
	                        <td><input type="text" name="startingAddressLn1" value="" placeholder="Start Address Line 1" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Start Address Line 2</td>
	                        <td><input type="text" name="startingAddressLn2" value="" placeholder="Start Address Line 2"/></td>
	                    </tr>
	                    <tr>
	                        <td>Start City</td>
	                        <td><input type="text" name="startingCity" value="" placeholder="Start City" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Start State</td>
	                        <td><input type="text" name="startingState" value="" placeholder="Starting State" required /></td>
	                    </tr>
	                    <tr>
	                    	<td>Starting Travel Date</td>
	                        <td><input type="date" name="startingDate" value="" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Starting Travel Time</td>
	                        <td><input type="time" name="startingTime" value="12:00" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Ending Address Line 1</td>
	                        <td><input type="text" name="endingAddressLn1" value="" placeholder="Ending Address Line 1"/></td>
	                    </tr>
	                    <tr>
	                        <td>Ending Address Line 2</td>
	                        <td><input type="text" name="endingAddressLn2" value="" placeholder="Ending Address Line 2"/></td>
	                    </tr>
	                     <tr>
	                        <td>Ending City</td>
	                        <td><input type="text" name="endingCity" value="" placeholder="Ending City"/></td>
	                    </tr>
	                    <tr>
	                        <td>Ending State</td>
	                        <td><input type="text" name="endingState" value="" placeholder="Ending State"/></td>
	                    </tr>
	                    <tr>
	                        <td>Return Travel Date</td>
	                        <td><input type="date" name="returnDate" value="" /></td>
	                    </tr>
	                    <tr>
	                        <td>Return Travel Time</td>
	                        <td><input type="time" name="returnTime" value="12:00" /></td>
	                    </tr>
	                    <tr>
	                        <td>Number Of Passengers</td>
	                        <td><input type="text" name="numberOfPassangers" value="" placeholder = "# of Passangers" required/></td>	                        
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
	                        <td>$<input type="text" name="gas" value="" min="1" placeholder= "Passanger Cost" required/></td>	                        
	                    </tr>
	                    <tr>
	                    	<td><input type="submit" value="Add New Ride" /></td>
	                    	<td colspan="4"><span style="color:orange"><%=(request.getAttribute("message") == null) ? ""
						: request.getAttribute("message")%></span></td>
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