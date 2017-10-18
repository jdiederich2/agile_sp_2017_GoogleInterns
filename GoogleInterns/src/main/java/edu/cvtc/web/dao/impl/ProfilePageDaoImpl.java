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
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		
		final List<User> loggedInUser = new ArrayList<>();
		
		String userEmail = LoginBean.getUserName();
		
		System.out.println("Email is: " + userEmail);
		
		String query = "SELECT firstName, lastName, age, userEmail, password FROM newUser WHERE userEmail = ?";

		try {
				
			connection = DBConnection.createConnection();
			connection.setAutoCommit(false);
			
			ps = connection.prepareStatement(query); 
			ps.setQueryTimeout(DBConnection.TIMEOUT);
			
			ps.setString(1, userEmail);
			resultSet = ps.executeQuery();  

			if(resultSet.next()) {  
				
				final String firstName = resultSet.getString("firstName");
				final String lastName = resultSet.getString("lastName");
				final int age = resultSet.getInt("age");
				userEmail = resultSet.getString("userEmail");
				final String password = resultSet.getString("password");

				System.out.println("rs" + userEmail);
				
				{
					
				loggedInUser.add(new User(firstName, lastName, age, userEmail, password));
				
				System.out.println(loggedInUser);
				connection.commit();
				
				connection.close();
					
				} 
			 	  
			} 
				
			} catch(SQLException e) {
				
			} finally {
		
			DBConnection.closeConnections(connection, ps);
			DBConnection.closeResultSet(resultSet);
			
			}
		
			return loggedInUser;	

	}
}
	