/**
 * @author Dominic Campbell
 */
public class FlyEasyApplication {

    private UserList users;
	private airportList cAirportList;
	private FlightList aFlightList;
	private HotelList aHotelList;
	private RegisteredAirport currentAirport;
	private RegisteredFlight currentFlight;
    private RegisteredUser currentUser;
	private RegisteredHotel currentHotel;

    public FlyEasyApplication(){

        users = UserList.getInstance();
		cAirportList = airportList.getInstance();
		aFlightList = FlightList.getInstance();
		aHotelList = HotelList.getInstance();
    }
    /**
	 * @param createAccount creates a new user account
	 */
	public boolean createAccount(String userName, String firstName, String lastName, String email, String cardNum)
	{
		return users.addUser(userName,  firstName,  lastName, email, cardNum);
	}
	/**
	* @param login creates a login
	*/
	public boolean login(String userName) {
		if(!users.haveUser(userName))return false;
		
		currentUser = users.getUser(userName);
		return true;
	}
	/**
	* @param getCurrentUser grabs current user
	*/
	public RegisteredUser getCurrentUser() {
		return currentUser;
	}
	/**
	* @param findAirport finds airport
	*/
	public boolean findAirport(String city, String state){
		if(!cAirportList.haveAirport(city, state)) return false;
		currentAirport = cAirportList.getAirport(city, state);
		return true;
	}
	/**
	* @param findArrivalAirport finds arrival airport
	*/
	public boolean findArrivalAirport(String city, String state){
		if(!cAirportList.haveAirport(city, state)) return false;
		currentAirport = cAirportList.getAirport(city, state);
		return true;
	}
	/**
	* @param findHotel finds hotel
	*/
	public boolean findHotel(String hotelCity, String hotelState){
		if(!aHotelList.haveHotel(hotelCity, hotelState)) return false;
		currentHotel = aHotelList.getHotel(hotelCity, hotelState);
		return true;
	}
	/**
	* @param findFlight finds flight
	*/
	public boolean findFlight(String departureDate){
		if(!aFlightList.haveFlight(departureDate)) return false;
		currentFlight = aFlightList.getFlight(departureDate);
		return true;
	}
	/**
	* @param purchase purchases flights
	*/
	public boolean purchase(RegisteredFlight registeredFlight) {
		aFlightList.getFlights().remove(currentFlight);
		return true;
	}
	/**
	* @param logout save users 
	*/
	public void logout() {
		users.saveUsers();
	}
	/**
	* @param createAirport creates airport with whats given
	*/
	public boolean createAirport(String city, String state, String airportName, String airportCode){
		
		return cAirportList.addAirport(city, state,  airportName, airportCode);
	}
	/**
	* @param createFlight creates flight with whats given
	*/
	public boolean createFlight(String airline, String flightDepartureDate, String flightArrivalDate,
        String departureTime, String arrivalTime, String gate, String seats, String seatColumn, String seatRow, String price){

			return aFlightList.addFlight(airline, flightDepartureDate, flightArrivalDate, departureTime, arrivalTime, gate, seats, seatColumn, seatRow, price);
	}
	/**
	* @param createHotel creates hotel with whats given
	*/
	public boolean createHotel(String hotelName, String hotelCity, String hotelState, String roomType, String openRoom, String checkInDate, String checkOutDate, String price){
		return aHotelList.addHotel(hotelName, hotelCity, hotelState, roomType, openRoom, checkInDate, checkOutDate, price);
	}
	/**
	* @param exit exits program and saves stuff
	*/
	public void exit(){
		cAirportList.saveAirports();
		aFlightList.saveFlights();
		aHotelList.saveHotels();
	}
	/**
	* @param getCurrentAirport gets current airport
	*/
	public RegisteredAirport getCurrentAirport() {
		return currentAirport;
	}
	/**
	* @param getCurrentFlight gets current flight
	*/
	public RegisteredFlight getCurrentFlight(){
		return currentFlight;
	}
	/**
	* @param getCurrentHotel gets current Hotel
	*/
	public RegisteredHotel getCurrentHotel(){
		return currentHotel;
	}
    
}
