/**
 * 
 */
package Default;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import edu.cvtc.web.model.Rides;

/**
 * @author Cole Kulig
 *
 */
public class AddARideTest {

	@Test
	public void createNewRide() {
		Rides newRide = new Rides("test@test.com", "Driver", "123 abc Lane", "nothing", "Eau Claire", "Wisconsin", "01/01/2017", "12:00 PM", "456 def Ave", "againNothing", "Chippewa Falls", "Wisconsin", "01/01/2017", "12:45 AM", 2, "Smoking", 25);
		assertThat(newRide.toString(), is("test@test.com" + "Driver" + "123 abc Lane" + "nothing" + "Eau Claire" + "Wisconsin" + "01/01/2017" + "12:00 PM" + "456 def Ave" + "againNothing" + "Chippewa Falls" + "Wisconsin" + "01/01/2017" + "12:45 AM" + 2 + "Smoking" + 25));
	}
	
	

}
