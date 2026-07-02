package booking;


public class PaymentPendingState implements BookingState {
    public void next(Booking booking) {
        booking.setState(new ConfirmedState());
    }
    public String getStatus() { return "PAYMENT_PENDING"; }
}