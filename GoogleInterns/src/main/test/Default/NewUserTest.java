/**
 * 
 */
package Default;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import edu.cvtc.web.model.User;

/**
 * @author Jennifer Diederich
 *
 */
public class NewUserTest {

	@Test
	public void createNewUser() {
		User newUser = new User("Jen", "Diederich", 41, "jdiederich2@student.cvtc.edu", "Apples");
		assertThat(newUser.toString(), is("Jen Diederich is 41. Email is jdiederich2@student.cvtc.edu. User name is JDiederich2. "
				+ "Password is Apples"));
	}

}
