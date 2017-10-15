package edu.cvtc.web.dao.impl;


import bean.LoginBean;
import edu.cvtc.web.dao.LoginDao;
import edu.cvtc.web.dao.PopulateProfile;
import edu.cvtc.web.model.User;

public class ProfilePage extends User implements PopulateProfile {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProfilePage() {
	}

	@Override
	public String populateProfilePage() {
		return "";
	}

	public String getUserEmail(String userName) {
		userName = LoginBean.getUserName();
		
		return userName;
	}

	public void setUserName() {	
	}

	public Object populateUserName() {
		return null;
	}

	public Object getFirstName(String firstName) {
		return firstName;
		
	}

}


