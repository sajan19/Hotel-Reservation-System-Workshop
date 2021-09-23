import java.util.ArrayList;
import java.util.List;

public class HotelRegistrationServices {
    //Declare an Array List
    public static List<Hotel> hotelList = new ArrayList<>();
    // Method to add Hotel Name and Hotel Rate
    public static void addHotels() {
        Hotel c1 = new Hotel("Lakewood", 110);
        Hotel c2 = new Hotel("Bridgewood", 160);
        Hotel c3 = new Hotel("Ridgewood", 220);
        hotelList.add(c1);
        hotelList.add(c2);
        hotelList.add(c3);
        for (Hotel c: hotelList) {
            System.out.println(c);
        }
    }
    //Main Driver Class
    public static void main(String[] args) {
        //Calling of method
        addHotels();
    }
}
