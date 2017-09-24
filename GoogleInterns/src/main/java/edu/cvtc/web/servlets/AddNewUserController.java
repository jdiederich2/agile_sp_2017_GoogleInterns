package edu.cvtc.web.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.base.Strings;

import edu.cvtc.web.dao.NewUserDao;
import edu.cvtc.web.dao.impl.NewUserDaoImpl;
import edu.cvtc.web.dao.impl.NewUserException;
import edu.cvtc.web.model.NewUser;

/**
 * Servlet implementation class AddNewUserController
 */
@WebServlet("/AddNewUser")
public class AddNewUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String firstName = request.getParameter("firstName");
		final String lastName = request.getParameter("lastName");
		final String ageString = request.getParameter("age");
		final String email = request.getParameter("email");
		final String userName = request.getParameter("userName");
		final String password = request.getParameter("password");
		
		// Set response content type
	    response.setContentType("text/html");
	    
		request.getParameter("smoker");

		String target = null;
		
		if (Strings.isNullOrEmpty(firstName) 
				|| Strings.isNullOrEmpty(lastName)
				|| Strings.isNullOrEmpty(ageString)
				|| Strings.isNullOrEmpty(email)
				|| Strings.isNullOrEmpty(userName)
				|| Strings.isNullOrEmpty(password)) {
			
			request.setAttribute("message", "You must complete all fields to submit the form.");
			target = "error.jsp";
			
		} else {
			try {
				final int age = Integer.parseInt(ageString);
				
				final NewUserDao newUserDao = new NewUserDaoImpl();
				newUserDao.insertNewUser(new NewUser(firstName, lastName, age, email, userName, password));
				
				request.setAttribute("message", "New user added successfully.");
				target = "success.jsp";
			} catch (NewUserException e) {
				e.printStackTrace();
				request.setAttribute("message", e.getMessage());;
				target = "error.jsp";
			}
		}
	}
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
}
