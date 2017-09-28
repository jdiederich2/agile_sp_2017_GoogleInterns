package edu.cvtc.web.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.base.Strings;

import edu.cvtc.web.dao.UserDao;
import edu.cvtc.web.dao.impl.UserDaoException;
import edu.cvtc.web.dao.impl.UserDaoImpl;
import edu.cvtc.web.model.User;
import edu.cvtc.web.util.DBConnection;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class loginUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		
		final String myUserName = request.getParameter("userName");
		final String myPassword = request.getParameter("password");
		
		String target = null; 
		
		if (Strings.isNullOrEmpty(myUserName)
				|| Strings.isNullOrEmpty(myPassword)) {
			
			request.setAttribute("message", "You must complete all fields to submit the form.");
			target = "error.jsp";
			
		} else {
			try{
				final UserDao userDao = new UserDaoImpl();
				userDao.findUser(new User(myPassword));
					
					System.out.println("complete");
					
					request.setAttribute("message", "Login Successful.");
					target = "home.jsp";
				
			} catch (UserDaoException e) {
					e.printStackTrace();
				}
			
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
