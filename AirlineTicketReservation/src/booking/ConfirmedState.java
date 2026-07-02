package booking;

public class ConfirmedState implements BookingState {
    public void next(Booking booking) {
        System.out.println("Booking already confirmed.");
    }
    public String getStatus() { return "CONFIRMED"; }
}