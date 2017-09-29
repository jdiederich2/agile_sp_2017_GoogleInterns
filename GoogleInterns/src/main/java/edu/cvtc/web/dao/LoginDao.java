package edu.cvtc.web.dao;

import bean.LoginBean;

public interface LoginDao {

	String authenticateUser(LoginBean loginBean) throws ClassNotFoundException;

}
