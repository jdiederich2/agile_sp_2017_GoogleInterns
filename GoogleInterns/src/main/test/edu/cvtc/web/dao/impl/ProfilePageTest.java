package edu.cvtc.web.dao.impl;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.hamcrest.Matcher;
import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

import org.junit.Before;

import bean.LoginBean;
import edu.cvtc.web.dao.LoginDao;
import edu.cvtc.web.model.User;

public class ProfilePageTest<Answer> {

	private String userName = "";
	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testPopulateUserName() {
		User profile = new User("TestFName", "TestLName", 20, "test@test.com", "password");
		assertThat(profile.getUserEmail(), equalTo("test@test.com"));	
	}
	
	@Test
	public void testLoginScreenUserName() {
		final String userName = "test@test.com";
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName(userName);
		
	}
	
	@Test
	public void testProfilePageUserEmail() {
		LoginBean loginBean = new LoginBean();
		loginBean.setUserName("test@test.com");
		assertThat(loginBean.getUserEmail(userName), equalTo("test@test.com"));
		
	}
	
	@Test
	public void testProfilePagefirstName() {
		LoginBean loginBean = new LoginBean();
		try {
			ProfilePageDaoImpl.populateProfilePage("test@test.com");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void testLoginUserNameField () {
		
	}

}
