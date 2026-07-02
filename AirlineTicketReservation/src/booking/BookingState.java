package booking;


public interface BookingState
{
    void next(Booking booking);

    void handle();

    String getStatus();
}