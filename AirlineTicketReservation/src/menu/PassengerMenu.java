package menu;

import service.FlightService;
import model.Flight;
import util.ScannerHelper;

import java.time.LocalDate;
import java.util.List;

public class PassengerMenu {

    public static void showMenu() {

        FlightService service = new FlightService();
        boolean logout = false;

        while (!logout) {

            System.out.println("\n--------- PASSENGER MENU ---------");
            System.out.println("1. Search Flights");
            System.out.println("2. Logout");

            int choice = ScannerHelper.readInt("Enter your choice : ");

            switch (choice) {

                case 1:
                    System.out.print("Enter Source: ");
                    String source = new java.util.Scanner(System.in).nextLine();

                    System.out.print("Enter Destination: ");
                    String dest = new java.util.Scanner(System.in).nextLine();

                    List<Flight> flights =
                            service.search(source, dest, LocalDate.now());

                    if (flights.isEmpty()) {
                        System.out.println("No flights found.");
                    } else {
                        flights.forEach(System.out::println);
                    }
                    break;

                case 2:
                    logout = true;
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}