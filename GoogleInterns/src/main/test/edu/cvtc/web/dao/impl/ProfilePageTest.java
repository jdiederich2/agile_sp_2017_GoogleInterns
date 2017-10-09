package edu.cvtc.web.dao.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProfilePageTest {

	private ProfilePage classUnderTest;
	private String userNameDB = "";
	
	@Before
	public void setUp() throws Exception {
		
		classUnderTest = new ProfilePage("userName");
	}

	@Test
	public void testPopulateUserName() {
		
		String result = "";
			
	}

}
