package booking;

public class SeatSelectedState implements BookingState {

    @Override
    public void next(Booking booking) {
        booking.setState(new PaymentPendingState());
    }

    @Override
    public void handle() {
        System.out.println("Booking State: SEAT_SELECTED");
    }

    @Override
    public String getStatus() {
        return "SEAT_SELECTED";
    }
}
