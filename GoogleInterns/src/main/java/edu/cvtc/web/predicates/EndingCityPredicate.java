package edu.cvtc.web.predicates;

import com.google.common.base.Predicate;

import edu.cvtc.web.model.Rides;

public class EndingCityPredicate  implements Predicate<Rides> {
	private String endingCity;
	
	public EndingCityPredicate(final String endingCity){
		this.endingCity = endingCity;
	}
	@Override
	public boolean apply(Rides ride) {
		return ride.getEndingCity().equalsIgnoreCase(endingCity);
	}
}
