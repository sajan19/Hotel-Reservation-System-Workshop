public class Hotel {
    //Variables
    String hotelName;
    int dailyRate;
    //Setter
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }
    //Getter
    public String getHotelName() {
        return hotelName;
    }
    public int getDailyRate() {
        return dailyRate;
    }
    //Parametrised Constructor
    public Hotel(String hotelName, int dailyRate) {
        setHotelName(hotelName);
        setDailyRate(dailyRate);
    }
    public String toString() {
        return "Hotel Name : " + this.hotelName + ", "+
                "Hotel Rate : " + this.dailyRate;
    }
}
