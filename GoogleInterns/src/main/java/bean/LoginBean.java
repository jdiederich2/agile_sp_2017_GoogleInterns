
package bean;

/**
 * @author Jennifer Diederich
 *
 */
public class LoginBean  {  
	private static  String userName;
	private String password;
	  
	public String userName() {  
	    return userName;  
	}  
	  
	public void userName(String userName) {  
	    LoginBean.userName = userName;  
	}  
	
	public static String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		LoginBean.userName = userName;
	} 
	  
	public String getPassword() {  
	    return password;  
	}  
	  
	public void setPassword(String password) {  
	    this.password = password;  
	}

	public String authenticateUser(LoginBean loginBean) throws ClassNotFoundException {
		return null;
	}

	
  
}  
