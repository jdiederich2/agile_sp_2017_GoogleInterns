/**
 * 
 */
package edu.cvtc.web.search;

import java.util.List;


import edu.cvtc.web.exceptions.RideSearchException;
import edu.cvtc.web.model.Rides;

/**
 * @author Emily
 *
 */
public interface RideSearch {
	List<Rides> retrieveRides(String sortType) throws RideSearchException;
	
	List<Rides> findRidesByEndingCity(String endingCity) throws RideSearchException;
	
	List<Rides> findRidesByStartingCity(String startingCity) throws RideSearchException;
	
}
