import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FlightListTest {
    private UserList flights = FlightList.getInstance();
	private ArrayList<RegisteredFlight> flightList = flights.getFlights();
	//airline, flightDepartureDate, flightArrivalDate,departureTime, arrivalTime, gate, steats, seatColumn, seatRow, price
	@Before
	public void setup() {
		flightList.clear();
		flightList.add(new RegisteredFlight("Southwest", "04/11/2022", "04/12/2022", "7:00", "9:00", "B", "A3", "2", "13", "350"));
		flightList.add(new RegisteredFlight("Virgin", "04/13/2022", "04/14/2022", "10:00", "12:00", "B", "A6", "7", "17", "350"));
		DataWriter.saveFlights();
	}
	
	@After
	public void tearDown() {
		FlightList.getInstance().getFlights().clear();;
		DataWriter.saveFlights();
	}
	
	
	@Test
	public void testHaveUserValidFirstItem() {
		boolean hasLuffy = users.haveFlight("pirateKing");
		assertTrue(hasLuffy);
	}
	
	@Test
	public void testHaveUserValidLastItem() {
		boolean hasZoro = users.haveFlight("onigiri");
		assertTrue(hasZoro);
	}
	
	@Test
	public void testHaveUserInValid() {
		boolean hasSanji = users.haveFlight("professionalSimp");
		assertFalse(hasSanji);
	}
	
	@Test
	public void testHaveUserEmpty() {
		boolean hasEmpty = users.haveUser("");
		assertFalse(hasEmpty);
	}
	
	@Test
	public void testHaveUserNull() {
		boolean hasNull = users.haveUser(null);
		assertFalse(hasNull);
	}
}
}
