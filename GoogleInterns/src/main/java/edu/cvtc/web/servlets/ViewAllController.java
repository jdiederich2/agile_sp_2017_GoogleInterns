package edu.cvtc.web.servlets;

import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.exceptions.RideSearchException;
import edu.cvtc.web.model.Rides;
import edu.cvtc.web.search.RideSearch;
import edu.cvtc.web.search.impl.RideSearchImpl;

/**
 * Servlet implementation class ViewAllController
 */
@WebServlet("/ViewAll")
public class ViewAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = null;
		
		try {
			final RideSearch rideSearch = new RideSearchImpl();
			final String sortType = request.getParameter("sortType");
			final List<Rides> ride = rideSearch.retrieveRides(sortType);
			
			request.setAttribute("ride", ride);
			target = "viewRides.jsp";
			
		} catch (RideSearchException e) {
			e.printStackTrace();
			request.setAttribute("error", "sorry there was a problem accessing the database.");
			target ="error.jsp";
		}
		
		request.getRequestDispatcher(target).forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
