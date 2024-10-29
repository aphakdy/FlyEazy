import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlightDataLoaderTest {

    private Flights flights = Flights.getInstance();
	private ArrayList<User> flightList = Flight.getFlight();
	
	@BeforeEach
	public void setup() {
		FlightList.clear();
		FlightList.add(new Flight("asmith", "Amy", "Smith", 19, "803-454-3344"));
		DataWriter.saveFlights();
	}
	
	@AfterEach
	public void tearDown() {
		Flights.getInstance().getFlights().clear();
		DataWriter.saveFlights();
	}
	
	
	@Test
	void testGetFlightsSize() {
		flightList = FlightDataLoader.getFlights();
		assertEquals(2, flights.size());
	}

	@Test
	void testGetFlightsSizeZero() {
		Flights.getInstance().getFlights().clear();
		DataWriter.saveFlights();
		assertEquals(0, flightList.size());
	}
	
	@Test
	void testGetUserFlight() {
		userList = DataLoader.getFlights();
		assertEquals("", flightList.get(0).getFlight());
	}
}