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
        <div>
        	<p> Please fill out below to register for our site.</p>
     	</div>	
        <form method="post" action=" ">
        	<table>
                <thead>
                    <tr>
                	    <th colspan="2">User Information</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="firstName" value="" placeholder="First Name" required /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lastName" value="" placeholder="Last Name" required /></td>
                    </tr>
                    <tr>
                        <td>Age</td>
                        <td><input type="text" name="age" value="" placeholder="Age in years" required /></td>
                    </tr>
                    <tr>
                        <td>E-mail Address</td>
                        <td><input type="email" name="userEmail" value="" placeholder="E-mail Address" required /></td>
                    
                    	<td colspan="4"><span style="color:orange"><%=(request.getAttribute("errMessage") == null) ? ""
						: request.getAttribute("errMessage")%></span></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" value="" placeholder="Password" required /></td>
                    </tr>
                    <tr>
                    	<td><input type="submit" value="" /></td>
                        <td><input type="reset" value="" /></td>
                	</tr>                	
            	</tbody>
        	</table>
        </form>
      </div>
      <hr>
<%@ include file="includes/footer.jsp" %>
	</body>
</html>