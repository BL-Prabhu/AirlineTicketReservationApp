package booking;

public class PaymentPendingState implements BookingState {

    @Override
    public void next(Booking booking) {
        booking.setState(new ConfirmedState());
    }

    @Override
    public void handle() {
        System.out.println("Booking State: PAYMENT_PENDING");
    }

    @Override
    public String getStatus() {
        return "PAYMENT_PENDING";
    }
}

