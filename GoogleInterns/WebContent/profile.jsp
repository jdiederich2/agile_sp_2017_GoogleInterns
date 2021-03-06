<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>User Profile Page</title>
		<meta name= "description" content="A app to find and advertise rides in the Chippwea Valley">
<%@ include file="includes/styles.jsp" %>	
	</head>
    <body>
      <div class="container">			
      	<div> 
        	<h1>User Profile Page</h1>
        </div>
<%@ include file="includes/navigation.jsp" %>
        <div class= "loggedInUser">	
        	<c:choose>
				<c:when test= "${empty loggedInUser}">
				 	<p>Sorry, user not found.</p>
			 	</c:when>
			 	<c:otherwise>
			 		<c:forEach var="loggedInUser" items="${loggedInUser}">
			 			<div>
				 			<div>
				 				<h2>${user.firstName} &nbsp;${user.lastName} </h2> 
				 				<p>${user.age} </p>
				 				<p>${user.email}</p>
				 				<p>${user.password}</p> 
				 			</div>
			 			</div>
			 		</c:forEach>
			 	</c:otherwise>					 
			</c:choose>
      </div>
      <hr>
<%@ include file="includes/footer.jsp" %>
	</body>
</html>