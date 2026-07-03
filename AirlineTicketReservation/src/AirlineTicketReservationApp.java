
import booking.Booking;
import model.*;
import payment.*;
import service.*;

import java.time.LocalDateTime;
import java.util.Arrays;

public class AirlineTicketReservationApp {

    public static void main(String[] args) {

        // 🔹 STEP 1: CREATE FLIGHT (UC1)
        Flight flight = new Flight(
                "F1",
                "Air India",
                "Chennai",
                "Delhi",
                LocalDateTime.now().plusHours(3),
                LocalDateTime.now().plusHours(6),
                5000,
                0,
                50
        );

        // 🔹 STEP 2: CREATE BOOKING (UC2)
        Booking booking = new Booking(flight);
        booking.addPassenger("Prabhu");

        // 🔹 STEP 3: SEAT SELECTION (UC3)
        Seat seat = new Seat("A1", Seat.SeatType.WINDOW, false, 0);
        booking.setSeat(seat);

        // 🔹 STEP 4: PAYMENT (UC4)
        Payment payment = new UPIPayment("prabhu@upi");

        if (payment.validate()) {
            payment.pay(flight.getPrice());
            booking.setPaymentStatus("SUCCESS");
        }

        booking.display();

        // 🔹 STEP 5: MODIFICATION (UC6)
        ModificationService ms = new ModificationService();

        ms.changeFlight(booking);
        ms.changeSeat(booking);
        ms.modifyPassenger(booking);

        booking.display();

        // 🔹 STEP 6: CANCELLATION (UC7)

        // ⚠️ NOTE: Do cancellation BEFORE admin operations to keep logic clean
        CancellationService cs = new CancellationService();

        // Partial Cancellation
        cs.cancelPartialBooking(
                booking,
                Arrays.asList("Prabhu"),
                new CardPayment("1234567812345678", "123")
        );

        // Full Cancellation (will run only if still valid)
        cs.cancelFullBooking(
                booking,
                new UPIPayment("refund@upi")
        );

        booking.display();

        // 🔹 STEP 7: FLIGHT MANAGEMENT (UC8 - ADMIN)

        FlightManagementService admin = new FlightManagementService();

        // Create Flights
        admin.createFlight("AI101", "Air India", "Chennai", "Delhi",
                LocalDateTime.now().plusHours(4),
                LocalDateTime.now().plusHours(7),
                5000, 50);

        admin.createFlight("6E202", "IndiGo", "Chennai", "Delhi",
                LocalDateTime.now().plusHours(5),
                LocalDateTime.now().plusHours(8),
                4500, 40);

        // Update Status
        admin.updateStatus("AI101", "DELAYED");

        // Update Fare
        admin.updateFare("6E202", 4800);

        // Search & Filter
        admin.searchByAirline("IndiGo");
        admin.searchByRoute("Chennai", "Delhi");
        admin.filterByStatus("DELAYED");

        // Report
        admin.occupancyReport();

        System.out.println("\n✅ SYSTEM EXECUTION COMPLETED");
    }
}