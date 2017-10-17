
package bean;

import edu.cvtc.web.model.User;

/**
 * @author Jennifer Diederich
 *
 */
public class LoginBean extends User{  
	/**
	 * 
	 */
	private static final long serialVersionUID = 3873513382157331082L;
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
	
	public String setUserName(String userName) {
		return LoginBean.userName = userName;
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
