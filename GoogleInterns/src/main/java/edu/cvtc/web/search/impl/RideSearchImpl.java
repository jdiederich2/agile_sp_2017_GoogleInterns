/**
 * 
 */
package edu.cvtc.web.search.impl;

import java.util.Collections;
import java.util.List;

import edu.cvtc.web.compactors.RidesByEndingCity;
import edu.cvtc.web.compactors.RidesByStartingCity;
import edu.cvtc.web.compactors.SortBy;
import edu.cvtc.web.dao.RidesDao;
import edu.cvtc.web.dao.impl.RidesDaoImpl;
import edu.cvtc.web.exceptions.RideSearchException;
import edu.cvtc.web.model.Rides;
import edu.cvtc.web.search.RideSearch;

/**
 * @author Emily
 *
 */
public class RideSearchImpl implements RideSearch {
	private static final String EXCPTION_Message = "List Of Rides could not be retrived from database.";

	@Override
	public List<Rides> retrieveRides(final String sortType) throws RideSearchException {
		// TODO Auto-generated method stub
		try {
			final RidesDao ridesDao = new RidesDaoImpl();
			final List<Rides> rides = ridesDao.retriveRides();
			
			if(null!= sortType){
				sortRides(rides, sortType);
			}
			
			return rides; 
		} catch (Exception e) {
			e.printStackTrace();
			throw new RideSearchException(EXCPTION_Message);
		}
	}
	
	private void sortRides(final List<Rides> rides, final String sortType) {
		// TODO Auto-generated method stub
		switch(sortType){
		case SortBy.ENDING_CITY:
			Collections.sort(rides, new RidesByEndingCity());
			break;
		case SortBy.STARTING_CITY:
			Collections.sort(rides, new RidesByStartingCity());
			break;

		default:
			break;
		}
	}
}
