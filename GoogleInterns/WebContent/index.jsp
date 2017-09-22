<!DOCTYPE html>
<html>
	<head>
		<title>Hitchhicker's Guide to Chippewa Valley</title>
		<meta name="description" content="">
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	</head>
	<body>
		<div class="container">
			<div class ="hero-unit"> 
				<h1>Welcome to the Hitchhicker's Guide to Chippewa Valley</h1>	
			</div>
			<div class="container">
				<p>This site can be used to find and provide ride sharing for people located in the Chippewa Valley area.</p>
				<p></p>
			</div>
			<div class="login">
				<form method="post" action="login.jsp">
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
		                        <td><input type="password" name="password" value="" placeholder="Password" required /></td>
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