/**
 * 
 */
package edu.cvtc.web.view;

import java.util.List;

import edu.cvtc.web.model.Rides;

/**
 * @author Emily
 *
 */
public class RidesView {
	
	public static String buildHTML(final List<Rides> ride){
		final StringBuilder out = new StringBuilder();
		
		out.append("<!doctype html>\n<html>\n\t<head>\n\t\t<title>Rides Listed By Name</title>\n\t</head>\n\t<body> ");
		out.append("\n\t\t<h1>Rides List</h1>");
		
		if (ride.isEmpty()){
			
			out.append("Sorry, we are unable to list any rides");
		} else {
			
			for (final Rides rides : ride) {
				
				out.append("\n\t\t<div>\n\t\t\t<h2>" + rides.getUserName() + "</h2>");
				out.append("\n\t\t\t</p>Looking For :  " + rides.getDriverOrPassanger() + "</p>");
				out.append("\n\t\t\t</p>Starting Address Line 1: " + rides.getStartingAddressLn1() + "</p>");
				out.append("\n\t\t\t</p>Starting Address Line 2: " + rides.getStartingAddressLn2() + "</p>");
				out.append("\n\t\t\t</p>Starting City: " + rides.getStartingCity() + "</p>");
				out.append("\n\t\t\t</p>Starting State: " + rides.getStartingState() + "</p>");
				out.append("\n\t\t\t</p>Starting Date: " + rides.getStartingDate() + "</p>");
				out.append("\n\t\t\t</p>Starting Time: " + rides.getStartingTime()+ "</p>");
				out.append("\n\t\t\t</p>Ending Address Line 1: " + rides.getEndingAddressLn1() + "</p>");
				out.append("\n\t\t\t</p>Ending Address Line 2: " + rides.getEndingAddressLn2() + "</p>");
				out.append("\n\t\t\t</p>Ending City: " + rides.getEndingCity() + "</p>");
				out.append("\n\t\t\t</p>Ending State: " + rides.getEndingState() + "</p>");
				out.append("\n\t\t\t</p>Return Date: " + rides.getReturnDate()  + "</p>");
				out.append("\n\t\t\t</p>Return Time: " + rides.getReturnTime() + "</p>");
				out.append("\n\t\t\t</p>Number Of Passangers: " + rides.getNumberOfPassangers() + "</p>");
				out.append("\n\t\t\t</p>Smoking Allowed/Requested: " + rides.getAllowSmoking() + "</p>");
				out.append("\n\t\t\t</p>Ride Cost: " + rides.getGas() +". </p>\n\t\t</div>");
			}
		}
		
		out.append("\n\t\t<p>&copy; Copyright 2016 Google Interns</p>\n\t</body>\n</hmtl> ");
		
		return out.toString();
		
	}
}
