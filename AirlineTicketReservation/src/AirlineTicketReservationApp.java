
import booking.Booking;
import model.*;
import service.*;

import java.time.LocalDateTime;

public class AirlineTicketReservationApp {

    public static void main(String[] args) {

        // ✅ Correct Flight object creation
        Flight flight = new Flight(
                "F1",
                "Air India",
                "Chennai",
                "Delhi",
                LocalDateTime.now().plusHours(2),
                LocalDateTime.now().plusHours(5),
                5000,
                0,
                50
        );

        Booking booking = new Booking(flight);

        booking.addPassenger("Prabhu");

        // ✅ Updated Seat constructor
        booking.setSeat(new Seat("A1", Seat.SeatType.WINDOW, false, 0));

        booking.setPaymentStatus("SUCCESS");

        booking.display();

        ModificationService ms = new ModificationService();

        // Flight Change
        ms.changeFlight(booking);

        // Seat Change
        ms.changeSeat(booking);

        // Passenger Update
        ms.modifyPassenger(booking);

        booking.display();
    }
}
