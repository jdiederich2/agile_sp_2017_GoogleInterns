<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<c:choose>
	<c:when test="${empty rides}">
		<p>Sorry, the list of rides is empty.</p>
	</c:when>
	<c:otherwise>
		<c:forEach var="ride" items="${ride}">
			<div class="span4">
				<h2>Posted By: ${rides.userName}</h2>
				<p>Looking for: ${rides.direverOrPassanger} <br>
				Starting Address Line 1: ${rides.startingAddressLn1} <br>
				Starting Address Line 2: ${rides.startingAddressLn2} <br>
				Starting City: ${rides.startingCity} <br>
				Starting State: ${rides.startingState} <br>
				Starting Date: ${rides.startingDate} <br>
				Starting Time: ${rides.startingTime} <br>
				Ending Address Line 1: ${rides.endingAddressLn1} <br>
				Ending Address Line 2: ${rides.endingAddressLn2} <br>
				Ending City: ${rides.endingCIty} <br>
				Ending State: ${rides.endingState} <br>
				Ending Date: ${rides.returnDate} <br>
				Ending Time: ${rides.returnTime} <br>
				Number of Passengers: ${rides.numberOfPassangers} <br>
				Is smoking allowed or requested: ${rides.allowSmoking} <br>
				Cost of ride: ${rides.gas} <br>
				</p>
			</div>
		</c:forEach>
	</c:otherwise>	
</c:choose>