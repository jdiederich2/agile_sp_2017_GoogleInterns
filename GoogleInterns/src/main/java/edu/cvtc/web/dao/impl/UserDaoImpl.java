/**
 * 
 */
package edu.cvtc.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		PreparedStatement insertStatement = null;
		
		try {
			
			connection = DBConnection.createConnection();
			
			final String sqlStatement = "insert into newUser (firstName, lastName, age, email, userName, password) values (?,?,?,?,?,?);";
					
			insertStatement = connection.prepareStatement(sqlStatement);
			
			// replace ??? with values that should be used
			insertStatement.setString(1, user.getFirstName());
			insertStatement.setString(2, user.getLastName());
			insertStatement.setInt(3, user.getAge());
			insertStatement.setString(4, user.getEmail());
			insertStatement.setString(5, user.getUserName());
			insertStatement.setString(6, user.getPassword());
			
			System.out.println(user);
			
			insertStatement.setQueryTimeout(DBConnection.TIMEOUT);
			
			insertStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new UserDaoException("Error: Unable to add this person to the database.");  // Could add Person: + person to show person 
		} finally {
			DBConnection.closeConnections(connection, insertStatement);
		}
	}
	
	@Override
	public void findUser(User user) throws UserDaoException {
		
		Connection connection = null;
		Statement statement = null;
		

				try {
					connection = DBConnection.createConnection();
					
					statement = connection.createStatement();
					
					statement.setQueryTimeout(DBConnection.TIMEOUT);
					
					final ResultSet resultSet = statement.executeQuery("select (userName, password) from newUser values (?,?);");
					
					statement.executeQuery(user.getUserName());
					statement.executeQuery(user.getPassword());
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				


	}

}

