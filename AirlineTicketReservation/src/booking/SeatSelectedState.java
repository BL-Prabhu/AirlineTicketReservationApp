package booking;


public class SeatSelectedState implements BookingState {
    public void next(Booking booking) {
        booking.setState(new PaymentPendingState());
    }
    public String getStatus() { return "SEAT_SELECTED"; }
}