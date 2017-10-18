/**
 * 
 */
package edu.cvtc.web.model;

import java.io.Serializable;

import bean.LoginBean;

/**
 * @author Jennifer Diederich
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = -2220777883091033066L;
	
	private String firstName;
	private String lastName;
	private int age;
	public static String userEmail;
	private String password;
	
	public User() {
		/* no-arg for JavaBean implementation */
	}

	public User(String firstName, String lastName, int age, String userEmail, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.userEmail = userEmail;
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static String getUserEmail() {
		return userEmail;
	}

	public static String setEmail(String userEmail) {
		return userEmail;
		
	}
	
	public String getUserEmail(String userEmail) {
		userEmail = LoginBean.getUserName();
		
		return userEmail;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

	@Override
	public String toString() {
		return firstName + " " + lastName + " is " + age + ". Email is " + userEmail + ". Password is " + password;
	}

}
