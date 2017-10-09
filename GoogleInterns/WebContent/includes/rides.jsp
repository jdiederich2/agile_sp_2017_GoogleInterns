<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<c:choose>
	<c:when test="${empty ride}">
		<p>Sorry, the list of rides is empty.</p>
	</c:when>
	<c:otherwise>
		<c:forEach var="ride" items="${ride}">
			<div class="span4">
				<h2>Posted By: ${ride.userName}</h2>
				<p>Looking for: ${ride.driverOrPassanger} <br>
				Starting Address Line 1: ${ride.startingAddressLn1} <br>
				Starting Address Line 2: ${ride.startingAddressLn2} <br>
				Starting City: ${ride.startingCity} <br>
				Starting State: ${ride.startingState} <br>
				Starting Date: ${ride.startingDate} <br>
				Starting Time: ${ride.startingTime} <br>
				Ending Address Line 1: ${ride.endingAddressLn1} <br>
				Ending Address Line 2: ${ride.endingAddressLn2} <br>
				Ending City: ${ride.endingCity} <br>
				Ending State: ${ride.endingState} <br>
				Ending Date: ${ride.returnDate} <br>
				Ending Time: ${ride.returnTime} <br>
				Number of Passengers: ${ride.numberOfPassangers} <br>
				Is smoking allowed or requested: ${ride.allowSmoking} <br>
				Cost of ride: ${ride.gas} <br>
				</p>
			</div>
		</c:forEach>
	</c:otherwise>	
</c:choose>