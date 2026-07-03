package service;

import booking.Booking;
import model.*;
import payment.*;

import java.util.*;

public class ModificationService {

    private PaymentService paymentService = new PaymentService();
    private FlightService flightService = new FlightService();
    private SeatService seatService = new SeatService();

    // 🔹 Flight Change
    public void changeFlight(Booking booking) {

        System.out.println("\nAvailable Flights:");
        List<Flight> flights = flightService.search("Chennai", "Delhi", java.time.LocalDate.now());
        flights.forEach(System.out::println);

        Flight newFlight = flights.get(1);

        double diff = newFlight.getPrice() - booking.getFlight().getPrice();

        System.out.println("Fare Difference: ₹" + diff);

        // ✅ FIXED: constructor + method name
        if (diff > 0) {
            paymentService.processPayment(new UPIPayment("user@upi"), diff);
        }

        booking.setFlight(newFlight);
        booking.setSeat(seatService.getSeats().get(0));

        System.out.println("Flight Updated ✅");
    }

    // 🔹 Passenger Modification
    public void modifyPassenger(Booking booking) {
        System.out.println("Passenger details updated ✅");
    }

    // 🔹 Seat Change
    public void changeSeat(Booking booking) {

        System.out.println("Current Seat: " + booking.getSeat());

        List<Seat> seats = seatService.getSeats();
        seats.forEach(System.out::println);

        Seat newSeat = seats.get(1);

        System.out.println("Seat upgrade charge ₹200");

        // ✅ FIXED: constructor + method name
        paymentService.processPayment(new CardPayment("1234567812345678", "123"), 200);

        booking.setSeat(newSeat);

        System.out.println("Seat Updated ✅");
    }
}
