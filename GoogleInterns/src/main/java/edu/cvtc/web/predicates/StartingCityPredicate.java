/**
 * 
 */
package edu.cvtc.web.predicates;

import com.google.common.base.Predicate;

import edu.cvtc.web.model.Rides;

/**
 * @author Emily
 *
 */
public class StartingCityPredicate implements Predicate<Rides> {
	private String startingCity;
	
	public StartingCityPredicate(final String startingCity){
		this.startingCity = startingCity;
	}
	@Override
	public boolean apply(Rides ride) {
		return ride.getStartingCity().equalsIgnoreCase(startingCity);
	}

}
