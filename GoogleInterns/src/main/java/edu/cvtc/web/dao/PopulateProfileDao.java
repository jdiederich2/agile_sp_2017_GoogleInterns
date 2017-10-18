package edu.cvtc.web.dao;

import java.util.List;

import edu.cvtc.web.model.User;

public interface PopulateProfileDao {

	List<User> populateProfilePage() throws ClassNotFoundException;

}
