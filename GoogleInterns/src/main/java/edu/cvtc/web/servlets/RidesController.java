/**
 * 
 */
package edu.cvtc.web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.base.Strings;

import edu.cvtc.web.dao.RidesDao;
import edu.cvtc.web.dao.impl.RidesDaoException;
import edu.cvtc.web.dao.impl.RidesDaoImpl;
import edu.cvtc.web.model.Rides;


/**
 * @author Emily
 *
 */

@WebServlet("/AddRide")
public class RidesController  extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target = null;
		
		final String userName = request.getParameter("userName");
		final String driverOrPassanger = request.getParameter("driverOrPassanger");
		final String startingAddressLn1 = request.getParameter("startingAddressLn1");
		final String startingAddressLn2 = request.getParameter("startingAddressLn2");
		final String startingCity = request.getParameter("startingCity");
		final String startingState = request.getParameter("startingState");
		final String startingDate = request.getParameter("startingDate");
		final String startingTime = request.getParameter("startingTime");
		final String endingAddressLn1 = request.getParameter("endingAddressLn1");
		final String endingAddressLn2 = request.getParameter("endingAddressLn2");
		final String endingCity = request.getParameter("endingCity");
		final String endingState = request.getParameter("endingState");
		final String returnDate = request.getParameter("returnDate");
		final String returnTime = request.getParameter("returnTime");
		final String numberOfPassangersString = request.getParameter("numberOfPassangers");
		final String allowSmoking = request.getParameter("allowSmoking");
		final String gasString = request.getParameter("gas");
		
		if (Strings.isNullOrEmpty(userName)
				|| Strings.isNullOrEmpty(driverOrPassanger)
				|| Strings.isNullOrEmpty(startingAddressLn1)
				|| Strings.isNullOrEmpty(startingAddressLn2)
				|| Strings.isNullOrEmpty(startingCity)
				|| Strings.isNullOrEmpty(startingState)
				|| Strings.isNullOrEmpty(startingDate)) {
			
			request.setAttribute("message", "You must complete all fields to submit the form.");
			target = "error.jsp";
			
			
		} else {
			try {
				final int numberOfPassangers = Integer.parseInt(numberOfPassangersString);
				final int gas = Integer.parseInt(gasString);
				
				final RidesDao ridesDao = new RidesDaoImpl();
				ridesDao.insertNewRide(new Rides(userName, driverOrPassanger, startingAddressLn1, startingAddressLn2, startingCity, startingState, 
						startingDate, startingTime, endingAddressLn1, endingAddressLn2, endingCity, endingState, returnDate, returnTime, numberOfPassangers, allowSmoking, gas));
				
				System.out.print("Ride added");
				request.setAttribute("message", "New ride added successfully.");
				target = "home.jsp";
				
				
			} catch (RidesDaoException e) {
				e.printStackTrace();
				request.setAttribute("message", e.getMessage());;
				target = "error.jsp";
			}
			
			request.getRequestDispatcher(target).forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
