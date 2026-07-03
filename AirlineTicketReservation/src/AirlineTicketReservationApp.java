
import booking.Booking;
import model.*;
import payment.*;
import service.*;

import java.time.LocalDateTime;
import java.util.Arrays;

public class AirlineTicketReservationApp {

    public static void main(String[] args) {

        // =========================
        // 🔹 UC9: AIRPORT MANAGEMENT
        // =========================
        AirportManagementService airportService = new AirportManagementService();

        airportService.addAirport("MAA", "Chennai International Airport", "Chennai", "India");
        airportService.addAirport("DEL", "Indira Gandhi International Airport", "Delhi", "India");
        airportService.addAirport("BLR", "Kempegowda International Airport", "Bangalore", "India");

        airportService.searchByCode("MAA");
        airportService.searchByCity("Chennai");
        airportService.searchByName("International");
        airportService.listByCountry("India");
        airportService.autoSuggest("Ch");
        airportService.displayAll();


        // =========================
        // 🔹 UC8: FLIGHT MANAGEMENT
        // =========================
        FlightManagementService admin = new FlightManagementService();

        admin.createFlight("AI101", "Air India", "Chennai", "Delhi",
                LocalDateTime.now().plusHours(4),
                LocalDateTime.now().plusHours(7),
                5000, 50);

        admin.createFlight("6E202", "IndiGo", "Chennai", "Delhi",
                LocalDateTime.now().plusHours(5),
                LocalDateTime.now().plusHours(8),
                4500, 40);

        admin.updateStatus("AI101", "DELAYED");
        admin.updateFare("6E202", 4800);

        admin.searchByAirline("IndiGo");
        admin.searchByRoute("Chennai", "Delhi");
        admin.filterByStatus("DELAYED");
        admin.occupancyReport();


        // =========================
        // 🔹 UC1–UC5: BOOKING
        // =========================
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

        Booking booking = new Booking(flight);
        booking.addPassenger("Prabhu");

        Seat seat = new Seat("A1", Seat.SeatType.WINDOW, false, 0);
        booking.setSeat(seat);

        Payment payment = new UPIPayment("prabhu@upi");

        if (payment.validate()) {
            payment.pay(flight.getPrice());
            booking.setPaymentStatus("SUCCESS");
        }

        booking.display();


        // =========================
        // 🔹 UC6: MODIFICATION
        // =========================
        ModificationService ms = new ModificationService();

        ms.changeFlight(booking);
        ms.changeSeat(booking);
        ms.modifyPassenger(booking);

        booking.display();


        // =========================
        // 🔹 UC7: CANCELLATION
        // =========================
        CancellationService cs = new CancellationService();

        cs.cancelPartialBooking(
                booking,
                Arrays.asList("Prabhu"),
                new CardPayment("1234567812345678", "123")
        );

        cs.cancelFullBooking(
                booking,
                new UPIPayment("refund@upi")
        );

        booking.display();


        // =========================
        // 🔹 UC10: PRIORITY BOOKING
        // =========================
        PriorityBookingService pqService = new PriorityBookingService();

        Booking b1 = new Booking(flight);
        b1.addPassenger("User1");
        b1.setSeat(new Seat("B1", Seat.SeatType.WINDOW, false, 0));
        b1.setPaymentStatus("SUCCESS");

        Booking b2 = new Booking(flight);
        b2.addPassenger("User2");
        b2.setSeat(new Seat("B2", Seat.SeatType.AISLE, false, 0));
        b2.setPaymentStatus("SUCCESS");

        Booking b3 = new Booking(flight);
        b3.addPassenger("User3");
        b3.setSeat(new Seat("B3", Seat.SeatType.MIDDLE, false, 0));
        b3.setPaymentStatus("SUCCESS");

        pqService.addBooking(new PriorityBooking(b1, PriorityBooking.PriorityLevel.REGULAR));
        pqService.addBooking(new PriorityBooking(b2, PriorityBooking.PriorityLevel.EXPRESS));
        pqService.addBooking(new PriorityBooking(b3, PriorityBooking.PriorityLevel.REGULAR));

        pqService.status();
        pqService.processAll();


        // =========================
        // ✅ FINAL OUTPUT
        // =========================
        System.out.println("\n✅ ALL USE CASES (UC1 → UC10) EXECUTED SUCCESSFULLY");
    }
}
