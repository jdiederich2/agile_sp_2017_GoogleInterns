package edu.cvtc.web.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.LoginBean;
import edu.cvtc.web.dao.PopulateProfileDao;
import edu.cvtc.web.model.User;
import edu.cvtc.web.util.DBConnection;

public class ProfilePageDaoImpl implements PopulateProfileDao {
	
	public List<User> populateProfilePage() throws ClassNotFoundException {
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		String userEmail = LoginBean.setEmail();
		
		System.out.println(userEmail);
		
		
		final List<User> loggedInUser = new ArrayList<>();
		
		try {
				
			connection = DBConnection.createConnection();
			connection.setAutoCommit(false);
			
			statement = connection.createStatement(); 
			
			resultSet = statement.executeQuery("SELECT firstName, lastName, age, userEmail, password FROM newUser");  
		
			while(resultSet.next()) {  
				
				final String firstNameDB = resultSet.getString("firstName");
				final String lastNameDB = resultSet.getString("lastName");
				final int ageDB = resultSet.getInt("age");
				final String userEmailDB = resultSet.getString("userEmail"); 
				final String passwordDB = resultSet.getString("password");

				System.out.println(userEmailDB);
				
				if(userEmail.equals(userEmailDB)) {
					
					loggedInUser.add(new User(firstNameDB, lastNameDB, ageDB, userEmailDB, passwordDB));
					
					connection.commit();
					
					connection.close();
					
				} 
			 	  
			} 
				
			} catch(SQLException e) {
				
			} finally {
		
			DBConnection.closeConnections(connection, statement);
			DBConnection.closeResultSet(resultSet);
			
			}
		
			return loggedInUser;	

	}
}
	