package service;

import booking.Booking;
import model.Flight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ModificationService {

    public void changeFlight(Booking booking) {

        System.out.println("\nAvailable Flights:");

        // ✅ FIX: Add flights before accessing
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight(
                "AI101", "Air India", "Chennai", "Delhi",
                LocalDateTime.now().plusHours(4),
                LocalDateTime.now().plusHours(7),
                5000, 0, 50
        ));

        flights.add(new Flight(
                "6E202", "IndiGo", "Chennai", "Delhi",
                LocalDateTime.now().plusHours(5),
                LocalDateTime.now().plusHours(8),
                4500, 0, 40
        ));

        // Display flights
        for (Flight f : flights) {
            System.out.println(f);
        }

        // ✅ SAFE ACCESS
        if (flights.size() < 2) {
            System.out.println("❌ Not enough flights to change");
            return;
        }

        Flight newFlight = flights.get(1);

        double oldPrice = booking.getFlight().getPrice();
        double newPrice = newFlight.getPrice();

        double diff = newPrice - oldPrice;

        System.out.println("Fare Difference: ₹" + diff);

        booking.setFlight(newFlight);

        System.out.println("Flight Updated ✅");
    }

    public void changeSeat(Booking booking) {
        System.out.println("Seat Updated ✅");
    }

    public void modifyPassenger(Booking booking) {
        System.out.println("Passenger details updated ✅");
    }
}
