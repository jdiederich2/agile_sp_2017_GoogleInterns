package edu.cvtc.web.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LoginBean;
import edu.cvtc.web.dao.impl.ProfilePageDaoImpl;
import edu.cvtc.web.model.ProfilePage;

/**
 * Servlet implementation class ProfilePageController
 */
@WebServlet("/ProfilePage")

public class ProfilePageController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    public ProfilePageController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		LoginBean login = new LoginBean();
		final String userEmail = LoginBean.getUserName();
		
		ProfilePageDaoImpl profilePageDaoImpl = new ProfilePageDaoImpl();
		System.out.println("PPDI");
		
		try {
			String populateProfile = profilePageDaoImpl.populateProvilePage(login);
			System.out.println("PP populateProfilePage");
			
			request.setAttribute("userEmail", userEmail);
			request.getRequestDispatcher("/profile.jsp").forward(request, response);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
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
