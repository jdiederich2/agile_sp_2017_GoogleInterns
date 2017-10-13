
package bean;

/**
 * @author Jennifer Diederich
 *
 */
public class LoginBean  {  
	private  String userName;
	private String password;
	  
	public String userName() {  
	    return userName;  
	}  
	  
	public void userName(String userName) {  
	    this.userName = userName;  
	}  
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
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
