package edu.cvtc.web.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.LoginBean;
import edu.cvtc.web.dao.PopulateProfileDao;
import edu.cvtc.web.model.User;
import edu.cvtc.web.util.DBConnection;

public class ProfilePageDaoImpl implements PopulateProfileDao {
	
	private static final String SELECT_USERNAME_FROM_USER = "SELECT (firstName, lastName, age, userEmail, password) FROM newUser WHERE userEmail = (?);";  

	public static List<User> populateProfilePage(String string) throws ClassNotFoundException {
		
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet resultSet = null;
		
		try {
			
			connection = DBConnection.createConnection();

			ps = connection.prepareStatement(SELECT_USERNAME_FROM_USER);
			
			ps.setString(1, LoginBean.getUserName());
			
			String userEmailDB = LoginBean.getUserName(); 
		
			
			final List<User> user = new ArrayList<>();

			connection.setAutoCommit(false);
			
			Statement statement = null;
			statement = connection.createStatement(); 
			              
			
			resultSet = statement.executeQuery(SELECT_USERNAME_FROM_USER);
			
			while(resultSet.next()) {  
				
				final String firstName = resultSet.getString("firstName");
				final String lastName = resultSet.getString("lastName");
				final int age = resultSet.getInt("age");
				final String email = resultSet.getString("userEmail"); 
				final String password = resultSet.getString("password");
				
				if(userEmailDB.equals("userEmail")) {
					
					connection.commit();
					
					connection.close();

				} 
			}
			 	  
			} catch(SQLException e) {
				
			} finally {
				
				DBConnection.closeConnections(connection, ps);
			}
		
		return null;

	}


	@Override
	public List<User> populateProfilePage() throws ClassNotFoundException {

		return null;
	}
}

