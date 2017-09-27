<!DOCTYPE html>
<html>
	<head>
		<title>Hitchhicker's Guide to Chippewa Valley</title>
		<meta name="description" content="A app to find and advertise rides in the Chippwea Valley">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<<<<<<< HEAD
<%@include file="includes/styles.jsp" %>
=======
		<%@ include file="includes/styles.jsp" %>	
>>>>>>> loginScreen
	</head>
	
	<body>
		<div>
			<div> 
				<h1>The Hitchhicker's Guide to Chippewa Valley</h1>	
			</div>
<<<<<<< HEAD
<%@ include file="includes/navigation.jsp" %>
=======
			
>>>>>>> loginScreen
			<div class="container">
				<h2>Need a ride? Need money for gas? Try Chippewa Valley rideshare, it's easier then sticking out your thumb!!</h2>
				<p>This app will allow you to advertise rides to events and locations along with finding out if people are going where you are.
				With this rideshare app you can feel better about what kind of carbon footprint you leave.</p>
			</div>

			<div class="login">
				<form method="post" action="login">
		            <table>
		                <thead>
		                    <tr>
		                        <th colspan="2">Login Page</th>
		                    </tr>
		                </thead>
		                <tbody>
		                    <tr>
		                        <td>User Name</td>
		                        <td><input type="text" name="userName" value="" placeholder="User Name" required /></td>
		                    </tr>
		                    <tr>
		                        <td>Password</td>
		                        <td><input type="text" name="password" value="" placeholder="Password" required /></td>
		                    </tr>
		                    <tr>
		                        <td><input type="submit" value="Login" /></td>
		                        <td><input type="reset" value="Reset" /></td>
		                    </tr>
		                    <tr>
		                        <td colspan="2">New User <a href="register.jsp">Register Here</a></td>
		                        <td colspan="2">Forgot Password <a href="forgotPassword.jsp">Forgot Password</a>
		                    </tr>
		                </tbody>
		            </table>
        		</form>
			</div>

			<hr>
<%@ include file="includes/footer.jsp" %>
		</div>
	</body>

</html>
