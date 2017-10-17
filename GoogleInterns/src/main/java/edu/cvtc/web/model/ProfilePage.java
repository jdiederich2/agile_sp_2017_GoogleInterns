package edu.cvtc.web.model;


import bean.LoginBean;
import edu.cvtc.web.dao.LoginDao;
import edu.cvtc.web.dao.PopulateProfileDao;

public class ProfilePage extends User implements PopulateProfileDao {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProfilePage() {
	}

	@Override
	public String populateProfilePage(String userEmail) {
		return "";
	}

	public String getUserEmail(String userName) {
		userName = LoginBean.getUserName();
		
		return userName;
	}

	public void setUserName() {	
	}

	public String populateUserName() {
		return null;
	}

	public String getFirstName(String firstName) {
		return firstName;
		
	}

	@Override
	public String populateProfilePage(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

}


