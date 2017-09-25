<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>New User Registration</title>
		<meta name= "description" content="JSP to add new users to a database">
<%@ include file="includes/styles.jsp" %>	
</head>
<body>
	<div>
		<form method="post" action="AddNewUser">
            <table>
                <thead>
                    <tr>
                        <th colspan="2">New User Information</th>
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
                        <td><input type="text" name="email" value="" placeholder="E-mail Address" required /></td>
                    </tr>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="userName" value="" placeholder="User Name" required /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password" value="" placeholder="Password" required /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Add New User" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>

                </tbody>
            </table>
      		</form>
	</div>

</body>
</html>