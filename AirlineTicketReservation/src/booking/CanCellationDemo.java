package booking;

import model.*;
import payment.*;
import service.*;

import java.time.LocalDateTime;
import java.util.Arrays;

 class CancellationDemo {

    public static void main(String[] args) {

        Flight flight = new Flight(
                "F1",
                "Air India",
                "Chennai",
                "Delhi",
                LocalDateTime.now().plusHours(5),
                LocalDateTime.now().plusHours(8),
                6000,
                0,
                50
        );

        Booking booking = new Booking(flight);
        booking.addPassenger("Prabhu");
        booking.addPassenger("Kumar");

        booking.setSeat(new Seat("A1", Seat.SeatType.WINDOW, false, 0));

        Payment payment = new UPIPayment("test@upi");

        CancellationService cs = new CancellationService();

        // 🔹 Full Cancel
        cs.cancelFullBooking(booking, payment);

        // 🔹 Partial Cancel
        cs.cancelPartialBooking(booking, Arrays.asList("Kumar"), payment);
    }
}
