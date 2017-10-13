package edu.cvtc.web.dao.impl;

import java.sql.*;

import bean.LoginBean;
import edu.cvtc.web.util.DBConnection;

public class ProfilePageDaoImpl {
	
	public String authenticateUser(LoginBean loginBean) throws ClassNotFoundException {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String firstName = loginBean.getUserName(); 
		
		String firstNameDB = "";
		String lastNameDB = "";
		int ageDB = 0;
		String emailDB = "";
		String passwordDB = "";
		
		try {
				
			connection = DBConnection.createConnection();
			connection.setAutoCommit(false);
			
			statement = connection.createStatement(); 
			              
			resultSet = statement.executeQuery("SELECT firstName, lastName, age, userEmail, password FROM newUser");  
			
			while(resultSet.next()) {  
				
				firstNameDB = resultSet.getString("firstName");
				lastNameDB = resultSet.getString("lastName");
				ageDB = resultSet.getInt("age");
				emailDB = resultSet.getString("userEmail"); 
				passwordDB = resultSet.getString("password");
				
				if(userName.equals(userNameDB) && password.equals(passwordDB)) {
					
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

