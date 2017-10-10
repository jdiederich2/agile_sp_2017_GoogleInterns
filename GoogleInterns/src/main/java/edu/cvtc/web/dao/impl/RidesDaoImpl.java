package edu.cvtc.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.cvtc.web.dao.RidesDao;
import edu.cvtc.web.model.Rides;
import edu.cvtc.web.util.DBConnection;

public class RidesDaoImpl implements RidesDao{

	private static final String SELECT_ALL_FROM_RIDES = "select * from rides";
	
	public void insertNewRide(final Rides rides) throws RidesDaoException {
		
		Connection connection = null;
		PreparedStatement ps = null;
		
		final String sqlStatement = "insert into rides (userName, driverOrPassanger, startingAddressLn1, startingAddressLn2, startingCity, startingState, "
				+ "startingDate, startingTime, endingAddressLn1, endingAddressLn2, endingCity, endingState, returnDate, returnTime, numberOfPassangers, "
				+ "allowSmoking, gas)"
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		
		try {
			
			connection = DBConnection.createConnection();
	
			ps = connection.prepareStatement(sqlStatement);
			
			ps.setString(1, rides.getUserName());
			ps.setString(2, rides.getDriverOrPassanger());
			ps.setString(3, rides.getStartingAddressLn1());
			ps.setString(4, rides.getStartingAddressLn2());
			ps.setString(5, rides.getStartingCity());
			ps.setString(6, rides.getStartingState());
			ps.setString(7, rides.getStartingDate());
			ps.setString(8, rides.getStartingTime());
			ps.setString(9, rides.getEndingAddressLn1());
			ps.setString(10, rides.getEndingAddressLn2());
			ps.setString(11, rides.getEndingCity());
			ps.setString(12, rides.getEndingState());
			ps.setString(13, rides.getReturnDate());
			ps.setString(14, rides.getReturnTime());
			ps.setInt(15, rides.getNumberOfPassangers());
			ps.setString(16, rides.getAllowSmoking());
			ps.setInt(17, rides.getGas());
			
					
			System.out.println(rides);
			
			ps.setQueryTimeout(DBConnection.TIMEOUT);
			
			ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			throw new RidesDaoException("Error: Unable to add ride to the database.");  
		
		} finally {
			DBConnection.closeConnections(connection, ps);
		}
	}
	

	@SuppressWarnings("finally")
	public int update(Rides rides) throws RidesDaoException {
		
		Connection connection = null;
		PreparedStatement ps = null;

		String query = "UPDATE Rides SET " 
				+ "userName = ?, "
				+ "driverOrPassanger = ?, "
				+ "startingAddressLn1 = ?, "
				+ "startingAddressLn2 = ?, "
				+ "startingCity = ?"
				+ "startingState = ?";
		
		try {
			
			connection = DBConnection.createConnection();
			
			ps = connection.prepareStatement(query);
			ps.setString(1, rides.getUserName());
			ps.setString(2, rides.getDriverOrPassanger());
			ps.setString(3, rides.getStartingAddressLn1());
			ps.setString(4, rides.getStartingAddressLn2());
			ps.setString(5, rides.getStartingCity());
			ps.setString(6, rides.getStartingState());
			ps.setString(7, rides.getStartingDate());
			ps.setString(8, rides.getStartingTime());
			ps.setString(9, rides.getEndingAddressLn1());
			ps.setString(10, rides.getEndingAddressLn2());
			ps.setString(11, rides.getEndingCity());
			ps.setString(12, rides.getEndingState());
			ps.setString(13, rides.getReturnDate());
			ps.setString(14, rides.getReturnTime());
			ps.setInt(15, rides.getNumberOfPassangers());
			ps.setString(16, rides.getAllowSmoking());
			ps.setInt(17, rides.getGas());
			
			ps.setQueryTimeout(DBConnection.TIMEOUT);
			
			return ps.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new UserDaoException("Error: Unable to add this ride to the database.");

		} finally {
				
			DBConnection.closeConnections(connection, ps);
			return 0;
		}
	}
	@Override
	public List<Rides> retriveRides() throws Exception {

		final List<Rides> ride = new ArrayList<>();
		
		//Notes: Read from the database
		final Connection connection = DBConnection.createConnection();
		final Statement statement =  connection.createStatement();
		
		try{
			
			statement.setQueryTimeout(DBConnection.TIMEOUT);
			
			final ResultSet resultSet  = statement.executeQuery(SELECT_ALL_FROM_RIDES);
			
			while(resultSet.next()) {
				final String userName = resultSet.getString("userName");
				final String driverOrPassanger = resultSet.getString("driverOrPassanger");
				final String startingAddressLn1 = resultSet.getString("startingAddressLn1");
				final String startingAddressLn2 = resultSet.getString("startingAddressLn2");
				final String startingCity = resultSet.getString("startingCity");
				final String startingState = resultSet.getString("startingState");
				final String startingDate = resultSet.getString("startingDate");
				final String startingTime = resultSet.getString("startingTime");
				final String endingAddressLn1 = resultSet.getString("endingAddressLn1");
				final String endingAddressLn2 = resultSet.getString("endingAddressLn2");
				final String endingCity = resultSet.getString("endingCity");
				final String endingState = resultSet.getString("endingState");
				final String returnDate = resultSet.getString("returnDate");
				final String returnTime = resultSet.getString("returnTime");
				final int numberOfPassangers = resultSet.getInt("numberOfPassangers");
				final String allowSmoking = resultSet.getString("allowSmoking");
				final int gas = resultSet.getInt("gas");
				
				final Rides rides = new Rides(userName, driverOrPassanger, startingAddressLn1, startingAddressLn2, startingCity, startingState, 
						startingDate, startingTime, endingAddressLn1, endingAddressLn2, endingCity, endingState, returnDate, returnTime, numberOfPassangers,
						allowSmoking, gas);
				ride.add(rides);
			}
			
			resultSet.close();
			
		} finally {
			DBConnection.closeConnections(connection, statement);
		}
		return ride;
	}

}