package edu.cvtc.web.dao.impl;

import java.sql.*;

import bean.LoginBean;
import edu.cvtc.web.dao.PopulateProfileDao;
import edu.cvtc.web.model.ProfilePage;
import edu.cvtc.web.util.DBConnection;

public class ProfilePageDaoImpl implements PopulateProfileDao{
	
	private static final String SELECT_USERNAME_FROM_USER = "SELECT firstName, lastName, age, userEmail, password FROM newUser";  
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String userEmail = "";
		
		userEmail = loginBean.setUserName(userEmail); 
		
		String firstNameDB = "";
		String lastNameDB = "";
		int ageDB = 0;
		String emailDB = "";
		String passwordDB = "";
		
		try {
				
			connection = DBConnection.createConnection();
			connection.setAutoCommit(false);
			
			statement = connection.createStatement(); 
			              
			
			
			while(resultSet.next()) {  
				
				firstNameDB = resultSet.getString("firstName");
				lastNameDB = resultSet.getString("lastName");
				ageDB = resultSet.getInt("age");
				emailDB = resultSet.getString("userEmail"); 
				passwordDB = resultSet.getString("password");
				
				if(userEmail.equals(emailDB)) {
					
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

	@Override
	public String populateProfilePage(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String populateProfilePage(String userEmail) {
		// TODO Auto-generated method stub
		return null;
	}
}

