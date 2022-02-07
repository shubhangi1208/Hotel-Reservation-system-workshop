import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class HotelReservationSystem {
    public static void main(String args[]) {
        System.out.println("Welcome to Hotel Reservation System"); //Welcome message
        addHotel();
        showhotel();
    }
    static ArrayList<Hotel>  list= new ArrayList<Hotel>();
    public static void addHotel(){
        Hotel hotel =new Hotel();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name :");
        hotel.setHotelName(sc.next());
        System.out.println("Enter the weekdays Rates :");
        hotel.setWeekdaysRates(sc.nextInt());
        System.out.println("Enter the weekends Rates :");
        hotel.setWeekendsRates(sc.nextInt());
        System.out.println("Enter the weekdays for rewards customer Rates :");
       hotel.setWeekdaysRatesforRewards();
        System.out.println("Enter the weekends for rewards customer Rates :");
        hotel.setWeekendsRatesforRewards();
        System.out.println("Enter the Start Date :");
        hotel.setStartDate();
        System.out.println("Enter the Ending Date :");
        hotel.setEndDate();
    }
    public static void showhotel(){
        for (Hotel hotel : list){
            System.out.println("hotel Details -");
            System.out.println("Hotel Name "+ hotel.hotelName);
            System.out.println("Weekdays Rates :"+ hotel.weekdaysRates);
            System.out.println("Weekends Rates :"+hotel.weekdaysRates);
            System.out.println("Weekdays for rewards customer Rates : "+ hotel.weekdaysRatesforRewards);
            System.out.println("weekends for rewards customer Rates :" + hotel.weekendsRatesforRewards);
            System.out.println("Start Date :"+ hotel.startDate);
            System.out.println("Ending Date"+ hotel.endDate);

        }
    }
}
