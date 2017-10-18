package edu.cvtc.web.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import edu.cvtc.web.exceptions.RideSearchException;
import edu.cvtc.web.model.Rides;
import edu.cvtc.web.search.RideSearch;
import edu.cvtc.web.search.SearchBy;
import edu.cvtc.web.search.impl.RideSearchImpl;

/**
 * Servlet implementation class SearchController
 */
@WebServlet("/Search")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = null;
		
		try {
			final String searchType = request.getParameter("searchType");
			final RideSearch rideSearch = new RideSearchImpl();
			List<Rides> rides = new ArrayList<>();
						
			switch(searchType){
			case SearchBy.STARTING_CITY:
				final String startingCity = request.getParameter("startingCity");
				rides = rideSearch.findRidesByStartingCity(startingCity);
				break;
			case SearchBy.ENDING_CITY:
				final String endingCity = request.getParameter("endingCity");
				rides = rideSearch.findRidesByEndingCity(endingCity);
				break;
			default:
				break;
			}
			
			request.setAttribute("rides", rides);
			target = "searchResults.jsp";
			
		} catch (final RideSearchException e) {
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
