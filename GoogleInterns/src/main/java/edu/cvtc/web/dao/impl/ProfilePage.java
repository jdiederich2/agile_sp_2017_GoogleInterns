package edu.cvtc.web.dao.impl;


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

	public Object getUserName() {
		return null;
	}

	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		
	}

}


