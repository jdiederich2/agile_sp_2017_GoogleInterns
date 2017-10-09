package edu.cvtc.web.dao.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.cvtc.web.dao.LoginDao;

public class ProfilePageTest {

	private ProfilePage profilePage;
	private String userNameDB = "";
	
	@Before
	public void setUp() throws Exception {
		
		profilePage = new ProfilePage();
	}

	@Test
	public void testPopulateUserName() {
		
		userName = LoginBean.getUserName();
		assertThat(profilePage.getUserName(), is(test@test.com)));
			
	}

}
