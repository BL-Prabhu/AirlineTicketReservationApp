package booking;

public class InitiatedState implements BookingState {

    @Override
    public void next(Booking booking) {
        booking.setState(new PassengerDetailsState());
    }

    @Override
    public void handle() {
        System.out.println("Booking State: INITIATED");
    }

    @Override
    public String getStatus() {
        return "INITIATED";
    }
}
