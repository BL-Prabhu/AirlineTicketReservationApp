package booking;

public class PassengerDetailsState implements BookingState {

    @Override
    public void next(Booking booking) {
        booking.setState(new PaymentPendingState());
    }

    @Override
    public void handle() {
        System.out.println("Booking State: PASSENGER_DETAILS");
    }

    @Override
    public String getStatus() {
        return "PASSENGER_DETAILS";
    }
}

