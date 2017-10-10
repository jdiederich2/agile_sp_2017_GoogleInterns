package edu.cvtc.web.dao;

import java.util.List;

import edu.cvtc.web.dao.impl.RidesDaoException;
import edu.cvtc.web.model.Rides;

public interface RidesDao {
	void insertNewRide(Rides rides) throws RidesDaoException;
	int update(Rides rides) throws RidesDaoException;
	List<Rides> retriveRides() throws Exception;
}
