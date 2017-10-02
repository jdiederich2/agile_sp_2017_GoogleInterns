package edu.cvtc.web.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import edu.cvtc.web.dao.RidesDao;
import edu.cvtc.web.model.Rides;
import edu.cvtc.web.util.DBConnection;

public class RidesDaoImpl implements RidesDao{

	public void insertNewRide(final Rides rides) throws UserDaoException {
		
		Connection connection = null;
		PreparedStatement ps = null;
		
		final String sqlStatement = "insert into rides (userName, driverOrPassanger, startingAddressLn1, startingAddressLn2, startingCity, startingState,"
				+ "startingDate, startingTime, endingAddressLn1, endingAddressLn2, endingCity, endingState, returnDate, returnTime, numberOfPassangers, allowSmoking, gas) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
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
			throw new UserDaoException("Error: Unable to add ride to the database.");  
		
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
	public void insertNewRides(Rides rides) throws RidesDaoException {
		// TODO Auto-generated method stub
		
	}

}