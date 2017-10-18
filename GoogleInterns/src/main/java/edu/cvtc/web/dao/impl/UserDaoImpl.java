/**
 * 
 */
package edu.cvtc.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.cvtc.web.dao.UserDao;
import edu.cvtc.web.model.User;
import edu.cvtc.web.util.DBConnection;

/**
 * @author Jennifer Diederich
 *
 */
public class UserDaoImpl implements UserDao {

	public void insertNewUser(final User user) throws UserDaoException {
		
		Connection connection = null;
		PreparedStatement ps = null;
		
		final String sqlStatement = "insert into newUser (firstName, lastName, age, userEmail, password) values (?,?,?,?,?);";
		
		try {
			
			connection = DBConnection.createConnection();
	
			ps = connection.prepareStatement(sqlStatement);
			
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setInt(3, user.getAge());
			ps.setString(4, user.getUserEmail());
			ps.setString(5, user.getPassword());
			
			System.out.println(user);
			
			ps.setQueryTimeout(DBConnection.TIMEOUT);
			
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new UserDaoException("Error: Unable to add this person to the database.");  
		
		} finally {
			DBConnection.closeConnections(connection, ps);
		}
	}
	

	@SuppressWarnings("finally")
	public int update(User user) throws UserDaoException {
		
		Connection connection = null;
		PreparedStatement ps = null;

		String query = "UPDATE User SET " 
				+ "firstName = ?, "
				+ "lastName = ?, "
				+ "age = ?, "
				+ "userEmail = ?, "
				+ "password = ?"
				+ "WHERE userEmail = ?";
		
		try {
			
			connection = DBConnection.createConnection();
			
			ps = connection.prepareStatement(query);
			ps.setString(1, user.getFirstName());
			ps.setString(2, user.getLastName());
			ps.setInt(3, user.getAge());
			ps.setString(4, user.getUserEmail());
			ps.setString(5, user.getPassword());
			
			ps.setQueryTimeout(DBConnection.TIMEOUT);
			
			return ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new UserDaoException("Error: Unable to add this person to the database.");

		} finally {
				
			DBConnection.closeConnections(connection, ps);
			return 0;
		}
	}
	
	public static User selectUser(String email) throws UserDaoException {
		
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		String query = "SELECT * FROM newUser WHERE userEmail = ?";
		
		try {
			
			connection = DBConnection.createConnection();
			ps = connection.prepareStatement(query);
			
			ps.setString(1, email);
			rs = ps.executeQuery();
			User user = null;
			
			if (rs.next()) {
				user = new User();
				user.setFirstName(rs.getString("firstName"));
				user.setLastName(rs.getString("lastName"));
				user.setAge(rs.getInt("age"));
				user.setEmail(rs.getString("userEmail"));
				user.setPassword(rs.getString("password"));
			}

			ps.setQueryTimeout(DBConnection.TIMEOUT);
			return user;
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			return null;

		} finally {
			DBConnection.closeResultSet(rs);	
			DBConnection.closeConnections(connection, ps);
		}
	} 
	
}