package edu.cvtc.web.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.google.common.base.Strings;

import edu.cvtc.web.dao.UserDao;
import edu.cvtc.web.dao.impl.UserDaoImpl;
import edu.cvtc.web.dao.impl.UserDaoException;
import edu.cvtc.web.model.User;

/**
 * Servlet implementation class AddNewUserController
 */
@WebServlet("/AddUser")
public class AddUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String target = null;
		
		final String firstName = request.getParameter("firstName");
		final String lastName = request.getParameter("lastName");
		final String ageString = request.getParameter("age");
		final String email = request.getParameter("email");
		final String userName = request.getParameter("userName");
		final String password = request.getParameter("password");
			
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
				
				final UserDao userDao = new UserDaoImpl();
				userDao.insertNewUser(new User(firstName, lastName, age, email, userName, password));
				
				request.setAttribute("message", "New user added successfully.");
				target = "home.jsp";
				
			} catch (UserDaoException e) {
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
