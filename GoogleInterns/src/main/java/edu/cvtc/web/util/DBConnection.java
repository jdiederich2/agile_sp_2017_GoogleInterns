/**
 * 
 */
package edu.cvtc.web.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Jennifer Diederich
 *
 */
public class DBConnection {
	
	public static final int TIMEOUT = 30;

	// JDBC driver name and database URL
	static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	
	static final String CONNECTION = "jdbc:mysql://localhost/RideShare";
	
	// Database credentials
	static final String USER = "agileAdmin";
	static final String PASS = "admin";
	
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		
		// Register Driver
		Class.forName(DRIVER_NAME);
		
		// Create DB Connection
		return DriverManager.getConnection(CONNECTION);
	}
	
	public static void closeConnections(final Connection connection, final Statement statement) {
		
		try {
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

}
