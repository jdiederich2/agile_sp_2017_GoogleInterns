package edu.cvtc.web.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cvtc.web.dao.PopulateProfileDao;
import edu.cvtc.web.dao.impl.ProfilePageDaoImpl;
import edu.cvtc.web.model.User;

/**
 * Servlet implementation class ProfilePageController
 */
@WebServlet("/ProfilePage")

public class ProfilePageController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String target = null;
		
		try {
			
			final PopulateProfileDao populateProfileDao = new ProfilePageDaoImpl();
			
			final List<User> loggedInUser = populateProfileDao.populateProfilePage();

			request.setAttribute("loggedInUser", loggedInUser);
			
			target = "profile.jsp";
			
			System.out.println("PPC");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			request.setAttribute("message", "Unable to person.");
			target = "error.jsp";
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
