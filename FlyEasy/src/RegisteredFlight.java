import java.util.UUID;
public class RegisteredFlight {
    private UUID flightid;
    private String airline;
    private String flightDepartureDate;
        // Arrival Date is return date if we want a one way method we can add one that just 
    private String flightArrivalDate;
    private String departureTime;
    private String arrivalTime;
    private String gate;
    private String seats;
    private String seatColumn;
    private String seatRow;
    private String price;

    public RegisteredFlight(String airline, String flightDepartureDate, String flightArrivalDate,
        String departureTime, String arrivalTime, String gate, String seats, String seatColumn, String seatRow, String price){

            this.flightid = UUID.randomUUID();
            this.airline = airline;
            this.flightDepartureDate = flightDepartureDate;
            this.flightArrivalDate = flightArrivalDate;
            this.departureTime = departureTime;
            this.arrivalTime = arrivalTime;
            this.gate = gate;
            this.seats = seats;
            this.seatColumn = seatColumn;
            this.seatRow = seatRow;
            this.price = price;
    }
    public RegisteredFlight(UUID flightid, String airline, String flightDepartureDate, String flightArrivalDate,
        String departureTime, String arrivalTime, String gate, String seats, String seatColumn, String seatRow, String price){

            this.flightid = flightid;
            this.airline = airline;
            this.flightDepartureDate = flightDepartureDate;
            this.flightArrivalDate = flightArrivalDate;
            this.departureTime = departureTime;
            this.arrivalTime = arrivalTime;
            this.gate = gate;
            this.seats = seats;
            this.seatColumn = seatColumn;    
            this.seatRow = seatRow;
            this.price = price;       
     }
    public UUID getFlightId(){
            return flightid;
            }
    public String getAirline(){
        return airline;
    }
    public String getFlightDepartureDate(){
        return flightDepartureDate;
    }
    public String getFlightArrivalDate(){
        return flightArrivalDate;
    }
    public String getDepartureTime(){
        return departureTime;
    } 
    public String getArrivalTime(){
        return arrivalTime;
    }
    public String getGate(){
        return gate;
    }
    public String getSeats(){
        return seats;
    }
    public String getSeatColumn(){
        return seatColumn;
    }
    public String getSeatRow(){
        return seatRow;
    }
    public String getPrice(){
        return price;
    }
    public void setAirline(String airline){
        this.airline = airline;
    }
    public void setFlightDepartureDate(String flightDepartureDate){
        this.flightDepartureDate = flightDepartureDate;
    }
    public void setFlightArrivalDate(String flightArrivalDate){
        this.flightArrivalDate = flightArrivalDate;
    }
    public void setDepartureTime(String departureTime){
        this.departureTime = departureTime;
    } 
    public void setArrivalTime(String arrivalTime){
        this.arrivalTime = arrivalTime;
    }
    public void setGate(String gate){
        this.gate = gate;
    }
    public void setSeats(String seats){
        this.seats = seats;
    }
    public void setSeatColumn(String seatColumn){
        this.seatColumn = seatColumn;
    }
    public void setSeatRow(String seatRow){
        this.seatRow = seatRow;
    }
    public void setPrice(String price){
        this.price = price;
    }
}
