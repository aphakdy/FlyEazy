import java.util.UUID;
public class RegisteredHotel {

    private UUID hotelid;
    private String hotelName;
    private String hotelCity;
    private String hotelState;
    private String roomType;
    private String openRoom;
    private String checkInDate;
    private String checkOutDate;
    private String price;

    public RegisteredHotel(String hotelName, String hotelCity, String hotelState, String roomType, String openRoom, String checkInDate, String checkOutDate, String price){
        this.hotelid = UUID.randomUUID();
        this.hotelName = hotelName;
        this.hotelCity = hotelCity;
        this.hotelState = hotelState;
        this.roomType = roomType;
        this.openRoom = openRoom;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.price = price;
    }
    public RegisteredHotel(UUID hotelid, String hotelName, String hotelCity, String hotelState, String roomType, String openRoom, String checkInDate, String checkOutDate, String price){
        this.hotelid = hotelid;
        this.hotelName = hotelName;
        this.hotelCity = hotelCity;
        this.hotelState = hotelState;
        this.roomType = roomType;
        this.openRoom = openRoom;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.price = price;
    }
    
    public UUID getHotelId(){
        return hotelid;
    }
    public String getHotelName(){
        return hotelName;
    }
    public String getHotelCity(){
        return hotelCity;
    }
    public String getHotelState(){
        return hotelState;
    }
    public String getRoomType(){
        return roomType;
    }
    public String getOpenRoom(){
        return openRoom;
    }
    public String getCheckInDate(){
        return checkInDate;
    }
    public String getCheckOutDate(){
        return checkOutDate;
    }
    public String getHotelPrice(){
        return price;
    }
    public void setHotelName(String hotelName){
        this.hotelName = hotelName;
    }
    public void setHotelCity(String hotelCity){
        this.hotelCity = hotelCity;
    }
    public void setHotelState(String hotelState){
        this.hotelState = hotelState;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    public void setOpenRoom(String openRoom){
        this.openRoom = openRoom;
    }
    public void setCheckInDate(String checkInDate){
        this.checkInDate = checkInDate;
    }
    public void setCheckOutDate(String checkOutDate){
        this.checkOutDate = checkOutDate;
    }
    public void setHotelPrice(String price){
        this.price = price;
    }

}
