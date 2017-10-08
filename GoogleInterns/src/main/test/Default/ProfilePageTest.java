package Default;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import bean.LoginBean;
import edu.cvtc.web.dao.UserDao;
import edu.cvtc.web.model.User;

public abstract class ProfilePageTest extends Assert  {

	
	@Test
	public void testPopulateProfilePage(String setUserName) {
		LoginBean loggedInUser = new LoginBean();
		
		ResultSet resultSet = null;
		
		String userName = loggedInUser.getUserName(); 
		String password = loggedInUser.getPassword();
		
		String userNameDB = "";
		String passwordDB = "";
		
		try {
			userNameDB = resultSet.getString("userEmail");
			passwordDB = resultSet.getString("password");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}

}
