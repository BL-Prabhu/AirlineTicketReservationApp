
import booking.Booking;
import model.*;
import payment.*;
import service.*;

import java.time.LocalDateTime;
import java.util.Arrays;

public class AirlineTicketReservationApp {

    public static void main(String[] args) {

        // 🔹 STEP 1: Create Flight
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

        // 🔹 STEP 2: Create Booking
        Booking booking = new Booking(flight);
        booking.addPassenger("Prabhu");

        // 🔹 STEP 3: Seat Selection
        Seat seat = new Seat("A1", Seat.SeatType.WINDOW, false, 0);
        booking.setSeat(seat);

        // 🔹 STEP 4: Payment
        Payment payment = new UPIPayment("prabhu@upi");

        if (payment.validate()) {
            payment.pay(flight.getPrice());
            booking.setPaymentStatus("SUCCESS");
        }

        booking.display();

        // 🔹 STEP 5: MODIFICATION (UC6)
        ModificationService ms = new ModificationService();

        // Flight Change
        ms.changeFlight(booking);

        // Seat Change
        ms.changeSeat(booking);

        // Passenger Update
        ms.modifyPassenger(booking);

        booking.display();

        // 🔹 STEP 6: CANCELLATION (UC7)
        CancellationService cs = new CancellationService();

        // ✅ Partial Cancellation (example)
        cs.cancelPartialBooking(
                booking,
                Arrays.asList("Prabhu"),
                new CardPayment("1234567812345678", "123")
        );

        // ✅ Full Cancellation (if still exists)
        cs.cancelFullBooking(
                booking,
                new UPIPayment("refund@upi")
        );

        // 🔹 FINAL STATE
        booking.display();
    }
}
