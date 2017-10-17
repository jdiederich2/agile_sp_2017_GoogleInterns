<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>New User Registration</title>
		<meta name= "description" content="A app to find and advertise rides in the Chippwea Valley">
<%@ include file="includes/styles.jsp" %>	
	</head>
    <body>
      <div class="container">			
      	<div class ="hero-unit"> 
        	<h1>New User Registration</h1>
        </div>
<%@ include file="includes/navigation.jsp" %>
        <div class="content">
        	<p> Please fill out below to register for our site.</p>
     	</div>	
        <form method="post" action="AddUser">
        	<table>
                <thead>
                    <tr>
                	    <th colspan="2">New User Information</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input class ="inputPerson" type="text" name="firstName" value="" placeholder="First Name" required /></td>
                    </tr>
                    <tr>
                        <td><input class ="inputPerson" type="text" name="lastName" value="" placeholder="Last Name" required /></td>
                    </tr>
                    <tr>
                        <td><input class ="inputPerson" type="text" name="age" value="" placeholder="Age in years" required /></td>
                    </tr>
                    <tr>
                        <td><input class ="inputPerson" type="email" name="userEmail" value="" placeholder="E-mail Address" required /></td>
                    
                    	<td colspan="4"><span style="color:orange"><%=(request.getAttribute("errMessage") == null) ? ""
						: request.getAttribute("errMessage")%></span></td>
                    </tr>
                    <tr>
                        <td><input class ="inputPerson" type="password" name="password" value="" placeholder="Password" required /></td>
                    </tr>
                    <tr>
                    	<td><input class ="inputPersonSubmit" type="submit" value="Add New User" /></td>
                        <td id = "personResetButton"><input class ="inputPersonSubmit" type="reset" value="Reset" /></td>
                	</tr>                	
            	</tbody>
        	</table>
        </form>
<%@ include file="includes/footer.jsp" %>
		</div>
	</body>
</html>