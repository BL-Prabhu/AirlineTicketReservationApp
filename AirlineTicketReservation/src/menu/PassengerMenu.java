package menu;

import booking.Booking;
import model.Flight;
import model.Seat;
import service.BookingService;
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
        BookingService bookingService = new BookingService();

        boolean logout = false;

        while (!logout) {

            System.out.println("\n--------- PASSENGER MENU ---------");
            System.out.println("1. Search Flights");
            System.out.println("2. Select Seat");
            System.out.println("3. Book Ticket");
            System.out.println("4. Logout");

            int choice = ScannerHelper.readInt("Enter your choice : ");

            switch (choice) {

                // ✈️ UC2 - Flight Search
                case 1:
                    System.out.print("Enter Source: ");
                    String source = scanner.nextLine();

                    System.out.print("Enter Destination: ");
                    String destination = scanner.nextLine();

                    List<Flight> searchResults =
                            flightService.search(source, destination, LocalDate.now());

                    if (searchResults.isEmpty()) {
                        System.out.println("No flights found.");
                    } else {
                        System.out.println("\nAvailable Flights:");
                        searchResults.forEach(System.out::println);
                    }
                    break;

                // 🪑 UC3 - Seat Selection
                case 2:
                    seatService.displaySeats();

                    System.out.print("Enter seat number: ");
                    String seatNumber = scanner.nextLine();

                    boolean success = seatService.selectSeat(seatNumber);

                    if (!success) {
                        System.out.println("Please try again.");
                    }
                    break;

                // 🎟️ UC4 - Booking
                case 3:

                    List<Flight> availableFlights =
                            flightService.search("Chennai", "Delhi", LocalDate.now());

                    if (availableFlights.isEmpty()) {
                        System.out.println("No flights available.");
                        break;
                    }

                    Flight selectedFlight = availableFlights.get(0);

                    Booking booking = bookingService.createBooking(selectedFlight);

                    System.out.println("Booking Created. PNR: " + booking.getPnr());

                    // 👤 Add Passenger
                    System.out.print("Enter Passenger Name: ");
                    String name = scanner.nextLine();
                    bookingService.addPassenger(booking, name);

                    // 🪑 Seat Selection
                    seatService.displaySeats();

                    System.out.print("Select Seat: ");
                    String selectedSeatNo = scanner.nextLine();

                    Seat seat = seatService.autoAssign(); // simplified logic
                    bookingService.selectSeat(booking, seat);

                    // 💳 Payment
                    bookingService.payment(booking, selectedFlight.getPrice());

                    booking.display();
                    break;

                // 🚪 Logout
                case 4:
                    System.out.println("Logging out from Passenger...");
                    logout = true;
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}
