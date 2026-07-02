package booking;


public class InitiatedState implements BookingState {
    public void next(Booking booking) {
        booking.setState(new PassengerDetailsState());
    }
    public String getStatus() { return "INITIATED"; }
}