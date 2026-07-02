package booking;

public class ConfirmedState implements BookingState {

    @Override
    public void next(Booking booking) {
        System.out.println("Booking already CONFIRMED. No further state.");
    }

    @Override
    public void handle() {
        System.out.println("Booking State: CONFIRMED");
    }

    @Override
    public String getStatus() {
        return "CONFIRMED";
    }
}

