package edu.cvtc.web.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LoginBean;
import edu.cvtc.web.dao.impl.LoginDaoImpl;


/**
 * Servlet implementation class LoginUserController
 */
@WebServlet("/LoginUser")

public class LoginUserController extends HttpServlet {

	private static final long serialVersionUID = -1556099030036290488L;

	public LoginUserController() {
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final String userName = request.getParameter("userName");
		final String password = request.getParameter("password");
		
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName(userName);
		loginBean.setPassword(password);
		
		LoginDaoImpl loginDaoImpl = new LoginDaoImpl();
		System.out.println("LUC LoginBean");
		
		try {
			String userValidate = loginDaoImpl.authenticateUser(loginBean);
			System.out.println("LUC userValidate");
		
		if (userValidate.equals("SUCCESS")) {
			
			request.setAttribute("userName", userName);
			request.getRequestDispatcher("/home.jsp").forward(request, response);;
			System.out.println("LUC setAttribute");
		
		}  else {  
			
			request.setAttribute("errMessage", userValidate); 
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			System.out.println("Did not work");
		}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
