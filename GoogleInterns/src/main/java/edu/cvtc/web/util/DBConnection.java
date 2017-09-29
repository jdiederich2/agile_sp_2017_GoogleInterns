/**
 * 
 */
package edu.cvtc.web.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Jennifer Diederich
 *
 */
public class DBConnection {
	
	public static final int TIMEOUT = 30;

	// Create driver - Like updating a driver on your computer
	private static final String DRIVER_NAME = "org.sqlite.JDBC";
	// Map to DB we want to use
	private static final String CONNECTION = "jdbc:sqlite:/Users/jenniferdiederich/agile_sp_2017_GoogleInterns/GoogleInterns/WebContent/Database/database_RideShare.db";
	
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


	public static void closeResultSet(ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

}
