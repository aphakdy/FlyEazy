import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class airportDataLoaderTest {
    private airportList airport = airportList.getInstance();
    private ArrayList<RegisteredAirport> airportsList = airport.getAirports();

    @Before
    public void setup() {
        airportsList.clear();
        airportsList.add(new RegisteredAirport("South Carolina", "Chapin", "Columbia Metropolitan Airport", "CAE"));
        //airportsList.add(new RegisteredAirport(state, city, airportName, airportCode));
        AirportDataWriter.saveAirports();
    }

    @After
    public void tearDown() {
        airportList.getInstance().getAirports().clear();
        AirportDataWriter.saveAirports();
    }
	@Test
	public void testGetAirportName() {
		airportsList = airportDataLoader.getAirports();
		assertEquals("Columbia Metropolitan Airport", airportsList.get(2).getAirportName());
	}
    @Test
	public void testGetAirportCode() {
		airportsList = airportDataLoader.getAirports();
		assertEquals("CAE", airportsList.get(3).getAirportCode());
	}
    @Test
    public void testGetAirportNameNull(){
        airportsList = airportDataLoader.getAirports();
		assertEquals(null, airportsList.get(0).getAirportName());
    }
    @Test
    public void testGetAirportCodeNull(){
        airportsList = airportDataLoader.getAirports();
		assertEquals(null, airportsList.get(0).getAirportCode());
    }
}
