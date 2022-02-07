import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class HotelReservationSystem {
    public static void main(String args[]) {
        System.out.println("Welcome to Hotel Reservation System"); //Welcome message
        addHotel();
    }
ArrayList<Hotel> list= new ArrayList<Hotel>();
    public static void addHotel(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hotel Name :");
        String hotelName = sc.next();
        System.out.println("Enter the weekdays Rates :");
        int weekdaysRates = sc.nextInt();
        System.out.println("Enter the weekends Rates :");
        String weekendsRates = sc.next();
        System.out.println("Enter the weekends for rewards customer Rates :");
        String weekdaysRatesforRewards = sc.next();
        System.out.println("Enter the weekends Rates :");
        String weekendsRatesforRewards = sc.next();
        System.out.println("Enter the Start Date :");
        String startDate = sc.next();
        System.out.println("Enter the Ending Date :");
        String endDate = sc.next();

    }
}
