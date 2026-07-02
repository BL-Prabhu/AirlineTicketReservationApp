package booking;


public class PassengerDetailsState implements BookingState {
    public void next(Booking booking) {
        booking.setState(new SeatSelectedState());
    }
    public String getStatus() { return "PASSENGER_DETAILS"; }
}