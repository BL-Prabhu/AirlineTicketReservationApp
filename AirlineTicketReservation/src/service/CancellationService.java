package service;

import booking.Booking;
import model.Flight;
import model.Seat;
import payment.Payment;

import java.time.LocalDateTime;
import java.util.List;

public class CancellationService {

    // 🔹 FULL CANCELLATION
    public void cancelFullBooking(Booking booking, Payment payment) {

        System.out.println("\n--- FULL CANCELLATION ---");

        if (!isEligible(booking)) {
            System.out.println("❌ Cancellation not allowed (Too late)");
            return;
        }

        int passengerCount = booking.getPassengers().size();
        double totalAmount = booking.getFlight().getPrice() * passengerCount;
        double refund = calculateRefund(totalAmount);

        // Update state
        booking.setStatus("CANCELLED");

        // Release seat
        Seat seat = booking.getSeat();
        System.out.println("Releasing seat: " + seat);

        // ✅ FIX: decrease booked seats instead of setting available seats
        Flight flight = booking.getFlight();
        flight.decreaseBookedSeats(passengerCount);

        // Refund
        payment.refund(refund);

        System.out.println("Refund Amount: ₹" + refund);
        System.out.println("Booking Status: CANCELLED ✅");
    }

    // 🔹 PARTIAL CANCELLATION
    public void cancelPartialBooking(Booking booking, List<String> cancelList, Payment payment) {

        System.out.println("\n--- PARTIAL CANCELLATION ---");

        List<String> passengers = booking.getPassengers();

        if (cancelList.isEmpty() || passengers.isEmpty()) {
            System.out.println("❌ No passengers to cancel");
            return;
        }

        int cancelCount = cancelList.size();

        double perPerson = booking.getFlight().getPrice();
        double refund = calculateRefund(perPerson * cancelCount);

        // Remove passengers
        passengers.removeAll(cancelList);

        // ✅ FIX: decrease booked seats
        Flight flight = booking.getFlight();
        flight.decreaseBookedSeats(cancelCount);

        payment.refund(refund);

        System.out.println("Cancelled Passengers: " + cancelList);
        System.out.println("Refund Amount: ₹" + refund);
        System.out.println("Remaining Passengers: " + passengers);

        if (passengers.isEmpty()) {
            booking.setStatus("CANCELLED");
            System.out.println("Booking fully cancelled (no passengers left)");
        }
    }

    // 🔹 ELIGIBILITY (before 1 hour)
    private boolean isEligible(Booking booking) {
        LocalDateTime departure = booking.getFlight().getDepartureTime();
        return LocalDateTime.now().isBefore(departure.minusHours(1));
    }

    // 🔹 POLICY
    private double calculateRefund(double amount) {

        if (amount > 5000) {
            System.out.println("Policy: 20% deduction applied");
            return amount * 0.8;
        } else {
            System.out.println("Policy: 10% deduction applied");
            return amount * 0.9;
        }
    }
}
