//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

public class HotelListTest {
	private HotelList hotels = HotelList.getInstance();
	private ArrayList<RegisteredHotel> hotelList = hotels.getHotels();
	
	@BeforeEach
	public void setup() {
		hotelList.clear();
		hotelList.add(new RegisteredHotel("Marriott", "Charlotte", "North Carolina", "open", "March 18", "March 22", "$150", null));
		hotelList.add(new RegisteredHotel("Ritz Carlton", "Los Angeles", "California", "open", "June 15", "June 20", "$800", null));
		//DataWriter.saveHotels();
	}
	
	@AfterEach
	public void tearDown() {
		hotels.getInstance().getHotels().clear();
		//DataWriter.saveHotels();
	}
	
	
	@Test
	public void testHaveHotelsValidFirstItem() {
		boolean hasMariott = hotels.haveHotel("Charlotte", "North Carolina");
		assertTrue(hasMariott);
	}
	
	@Test
	public void testHaveHotelsValidLastItem() {
		boolean hasRitzCarlton = hotels.haveHotel("Los Angeles", "California");
		assertTrue(hasRitzCarlton);
	}
	
	@Test
	public void testHaveHotelEmpty() {
		boolean hasEmpty = hotels.haveHotel("", "");
		assertFalse(hasEmpty);
	}

	@Test
	public void testHaveHotelNull() {
		boolean hasNull = hotels.haveHotel(null, null);
		assertFalse(hasNull);
	}

	
}