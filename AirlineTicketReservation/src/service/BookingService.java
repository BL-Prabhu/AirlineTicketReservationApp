package service;


import booking.Booking;
import booking.ConfirmedState;
import booking.PaymentPendingState;
import model.Flight;
import model.Seat;
import payment.Payment;

public class BookingService {

    private PaymentService paymentService = new PaymentService();

    public Booking createBooking(Flight flight) {
        Booking booking = new Booking(flight);
        booking.setState(new PaymentPendingState());
        return booking;
    }

    public void addPassenger(Booking booking, String name) {
        booking.addPassenger(name);
    }

    public void selectSeat(Booking booking, Seat seat) {
        booking.setSeat(seat);
    }

    // 🔗 Payment Integration
    public void makePayment(Booking booking, Payment payment, double amount) {

        System.out.println("\n--- Processing Payment ---");

        boolean success = paymentService.processPayment(payment, amount);

        if (success) {
            booking.setState(new ConfirmedState());
            booking.setPaymentStatus("SUCCESS");
            System.out.println("Booking Confirmed ✅");
        } else {
            booking.setPaymentStatus("FAILED");
            System.out.println("Payment Failed ❌");
        }
    }
}
