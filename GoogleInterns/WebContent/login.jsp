<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Hitchhiker's Guide to Chippewa Valley</title>
		<meta name="description" content="A app to find and advertise rides in the Chippwea Valley">
<%@ include file="includes/styles.jsp" %>	
	</head>
<body>
	<div class="container">
		<h1>Login Form</h1>
		<div class ="login">
			<form method="post" action="LoginUser">
	            <table>
	                <thead>
	                    <tr>
	                        <th colspan="2">Login Page</th>
	                    </tr>
	                </thead>
	                <tbody>
	                    
	                    <tr>
	                        <td>E-mail Address</td>
	                        <td class ="input"><input type="text" name="userName" value="" placeholder="User Name" required /></td>
	                    </tr>
	                    <tr>
	                        <td>Password</td>
	                        <td class ="input"><input type="password" name="password" value="" placeholder="Password" required /></td>
	                    </tr>
	                    <tr> 
							<td colspan="4"><span style="color:orange"><%=(request.getAttribute("errMessage") == null) ? ""
							: request.getAttribute("errMessage")%></span></td>
						</tr>			
	                    <tr>
	                        <td><input type="submit" value="Login" /></td>
	                        <td class ="input"><input type="reset" value="Reset" /></td>
	                    </tr>
	                    <tr>
	                        <td>New User <a href="register.jsp">Register Here</a></td>
	                        <td class ="input">Forgot Password <a href="forgotPassword.jsp">Forgot Password</a>
	                    </tr>
	
	                </tbody>
	            </table>
	      	</form>
		</div>
		<%@ include file="includes/footer.jsp" %>
	</div>
</body>
</html>