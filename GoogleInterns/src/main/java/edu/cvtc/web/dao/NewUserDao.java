/**
 * 
 */
package edu.cvtc.web.dao;

import edu.cvtc.web.dao.impl.NewUserException;
import edu.cvtc.web.model.NewUser;

/**
 * @author Jennifer Diederich
 *
 */
public interface NewUserDao {

	void insertNewUser(NewUser newUser) throws NewUserException;
}
