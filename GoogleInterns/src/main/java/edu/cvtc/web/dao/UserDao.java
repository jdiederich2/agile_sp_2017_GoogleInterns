/**
 * 
 */
package edu.cvtc.web.dao;

import edu.cvtc.web.dao.impl.UserDaoException;
import edu.cvtc.web.model.User;

/**
 * @author Jennifer Diederich
 *
 */
public interface UserDao {

	void insertNewUser(User user) throws UserDaoException;
	
	void findUser(User user) throws UserDaoException;
	
}
