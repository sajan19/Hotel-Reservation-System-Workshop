import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.Assert.*;

public class HotelRegistrationServicesTest {
    //Test Case
    @Test
    public void givenHotelNameShouldReturnTrueIfPresentInHotelList() {
        HotelReservationServices hotelReservationService = new HotelReservationServices();
        Hotel hotel = new Hotel("Lakewood",110);
        hotelReservationService.addHotel(hotel);
        List hotelList = hotelReservationService.getHotels();
        Assertions.assertTrue(hotelList.contains(hotel));
    }
}