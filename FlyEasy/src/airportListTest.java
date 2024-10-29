import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class airportListTest{
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
    public void testHaveAirportBoth(){
        boolean hasAirport = airport.haveAirport("Chapin", "South Carolina");
		assertTrue(hasAirport);
    }
    @Test
	public void testHaveAirportEmpty() {
		boolean hasEmpty = airport.haveAirport("","");
		assertFalse(hasEmpty);
	}
    @Test
	public void testHaveAirportNull() {
		boolean hasNull = airport.haveAirport(null,null);
		assertFalse(hasNull);
	}
    
    
}

