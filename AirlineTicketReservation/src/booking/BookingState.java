package booking;


public interface BookingState {
    void next(Booking booking);
    String getStatus();
}