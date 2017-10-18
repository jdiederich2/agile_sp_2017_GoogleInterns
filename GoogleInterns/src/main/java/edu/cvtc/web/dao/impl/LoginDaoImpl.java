package edu.cvtc.web.dao.impl;

import java.sql.*;

import bean.LoginBean;
import edu.cvtc.web.model.User;
import edu.cvtc.web.util.DBConnection;

public class LoginDaoImpl {
	
	public String authenticateUser(LoginBean loginBean) throws ClassNotFoundException {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String userName = LoginBean.getUserName(); 
		String password = loginBean.getPassword();
	
		String userNameDB = "";
		String passwordDB = "";
		
		try {
				
			connection = DBConnection.createConnection();
			connection.setAutoCommit(false);
			
			statement = connection.createStatement(); 
			
			resultSet = statement.executeQuery("SELECT userEmail, password FROM newUser");  
			
			while(resultSet.next()) {  
				
				userNameDB = resultSet.getString("userEmail"); 
				passwordDB = resultSet.getString("password");
				
				if(userName.equals(userNameDB) && password.equals(passwordDB)) {
					
					User user = new User();
					
					user.setEmail(userNameDB);
					
					connection.commit();
					
					connection.close();
					
					return "SUCCESS"; 
				} 
			 	  
			}
				
			} catch(SQLException e) {
				
			}
		
			DBConnection.closeConnections(connection, statement);
			DBConnection.closeResultSet(resultSet);	
			
			return "Invalid user credentials";
	}
}

