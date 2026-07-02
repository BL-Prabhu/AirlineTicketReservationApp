package menu;

import booking.Booking;
import model.Flight;
import payment.*;
import service.BookingService;
import service.FlightService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BookingWithPaymentMenu {

    public static void start() {

        Scanner sc = new Scanner(System.in);

        FlightService flightService = new FlightService();
        BookingService bookingService = new BookingService();

        // ✈️ Search Flights
        List<Flight> flights =
                flightService.search("Chennai", "Delhi", LocalDate.now());

        if (flights.isEmpty()) {
            System.out.println("No flights available");
            return;
        }

        Flight selectedFlight = flights.get(0);

        // 📌 Create Booking
        Booking booking = bookingService.createBooking(selectedFlight);
        System.out.println("PNR: " + booking.getPnr());

        // 👤 Passenger
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        bookingService.addPassenger(booking, name);

        // 💳 Payment Options
        System.out.println("\n1. UPI");
        System.out.println("2. Card");
        System.out.println("3. EMI");

        int choice = sc.nextInt();
        sc.nextLine();

        Payment payment = null;

        switch (choice) {
            case 1:
                System.out.print("Enter UPI ID: ");
                payment = new UPIPayment(sc.nextLine());
                break;

            case 2:
                System.out.print("Enter Card Number: ");
                String card = sc.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = sc.nextLine();
                payment = new CardPayment(card, cvv);
                break;

            case 3:
                System.out.print("Enter Card Number: ");
                String emiCard = sc.nextLine();
                System.out.print("Months: ");
                int months = sc.nextInt();
                payment = new EMIPayment(emiCard, months);
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        // 💰 Payment + Booking Update
        bookingService.makePayment(booking, payment, selectedFlight.getPrice());

        // 📄 Show Booking
        booking.display();
    }
}
