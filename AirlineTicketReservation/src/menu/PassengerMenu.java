package menu;

import model.Flight;
import service.FlightService;
import service.SeatService;
import util.ScannerHelper;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class PassengerMenu {

    private static final Scanner scanner = new Scanner(System.in);

    public static void showMenu() {

        FlightService flightService = new FlightService();
        SeatService seatService = new SeatService();

        boolean logout = false;

        while (!logout) {

            System.out.println("\n--------- PASSENGER MENU ---------");
            System.out.println("1. Search Flights");
            System.out.println("2. Select Seat");
            System.out.println("3. Logout");

            int choice = ScannerHelper.readInt("Enter your choice : ");

            switch (choice) {

                // ✈️ UC2 - Flight Search
                case 1:
                    System.out.print("Enter Source: ");
                    String source = scanner.nextLine();

                    System.out.print("Enter Destination: ");
                    String destination = scanner.nextLine();

                    List<Flight> flights =
                            flightService.search(source, destination, LocalDate.now());

                    if (flights.isEmpty()) {
                        System.out.println("No flights found.");
                    } else {
                        System.out.println("\nAvailable Flights:");
                        flights.forEach(System.out::println);
                    }
                    break;

                // 🪑 UC3 - Seat Selection
                case 2:
                    seatService.displaySeats();

                    System.out.print("Enter seat number: ");
                    String seatNo = scanner.nextLine();

                    boolean success = seatService.selectSeat(seatNo);

                    if (!success) {
                        System.out.println("Please try again.");
                    }
                    break;

                // 🚪 Logout
                case 3:
                    System.out.println("Logging out from Passenger...");
                    logout = true;
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
