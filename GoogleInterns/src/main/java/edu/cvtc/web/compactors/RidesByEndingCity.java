/**
 * 
 */
package edu.cvtc.web.compactors;

import java.util.Comparator;

import edu.cvtc.web.model.Rides;

/**
 * @author Emily
 *
 */
public class RidesByEndingCity implements Comparator<Rides> {
	
	@Override
	public int compare(Rides m1, Rides m2) {
		return m1.getEndingCity().compareToIgnoreCase(m2.getEndingCity());
	}
}
