package edu.cvtc.web.dao.impl;

import java.sql.*;

import bean.LoginBean;
import edu.cvtc.web.util.DBConnection;

public class LoginDaoImpl {
	
	public String authenticateUser(LoginBean loginBean) throws ClassNotFoundException {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String userName = loginBean.getUserName(); 
		String password = loginBean.getPassword();
	
		String userNameDB = "";
		String passwordDB = "";
		
		try {
				
			connection = DBConnection.createConnection();
			
			statement = connection.createStatement(); 
			              
			resultSet = statement.executeQuery("SELECT email, password FROM newUser");  
			
			while(resultSet.next()) {  
				
				userNameDB = resultSet.getString("email"); 
				passwordDB = resultSet.getString("password");
				
				if(userName.equals(userNameDB) && password.equals(passwordDB)) {
					
					return "SUCCESS"; 
				} 
			 	  
			}
				
			} catch(SQLException e) {
				
			}
		
			DBConnection.closeResultSet(resultSet);	
			DBConnection.closeConnections(connection, statement);
			return "Invalid user credentials"; // Just returning appropriate message otherwise
	}
}

