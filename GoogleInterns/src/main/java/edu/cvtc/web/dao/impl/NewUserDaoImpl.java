/**
 * 
 */
package edu.cvtc.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.cvtc.web.dao.NewUserDao;
import edu.cvtc.web.model.NewUser;
import edu.cvtc.web.util.DBConnection;

/**
 * @author Jennifer Diederich
 *
 */
public class NewUserDaoImpl implements NewUserDao {

	/* (non-Javadoc)
	 * @see edu.cvtc.web.dao.NewUserDao#populate(java.lang.String)
	 */
	public void insertNewUser(final NewUser newUser) throws NewUserException {
		
		Connection connection = null;
		
		// Will skip anything that is java related from import file.. () {} etc
		PreparedStatement insertStatement = null;
		
		try {
			
			connection = DBConnection.createConnection();
			
			final String sqlStatement = "insert into newUser (firstName, lastName, age, email, userName, password) values (?,?,?,?,?,?);";
			
			insertStatement = connection.prepareStatement(sqlStatement);
			
			// replace ??? with values that should be used
			insertStatement.setString(1, newUser.getFirstName());
			insertStatement.setString(2, newUser.getLastName());
			insertStatement.setInt(3, newUser.getAge());
			insertStatement.setString(4, newUser.getEmail());
			insertStatement.setString(4, newUser.getUserName());
			insertStatement.setString(4, newUser.getPassword());
			
			insertStatement.setQueryTimeout(DBConnection.TIMEOUT);
			
			insertStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new NewUserException("Error: Unable to add this person to the database.");  // Could add Person: + person to show person 
		} finally {
			DBConnection.closeConnections(connection, insertStatement);
		}
	}
}


