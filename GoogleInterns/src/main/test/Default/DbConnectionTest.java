/**
 * 
 */
package Default;

import java.sql.SQLException;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import edu.cvtc.web.util.DBConnection;

/**
 * @author benrohland
 *
 */
public class DbConnectionTest {
	
	private Boolean connectSuccess = true;
	@Test
	public void createDbTest () {
		try{
			DBConnection.createConnection();
		}catch (final ClassNotFoundException | SQLException e){
			connectSuccess = false;
		} 
		
		assertThat(connectSuccess, is(true));
	}
}
