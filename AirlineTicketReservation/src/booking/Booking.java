package booking;

import model.Flight;
import model.Seat;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Booking {

    private String pnr;
    private Flight flight;
    private Seat seat;
    private List<String> passengers = new ArrayList<>();
    private BookingState state;
    private String paymentStatus;

    public Booking(Flight flight) {
        this.flight = flight;
        this.pnr = generatePNR();
    }

    private String generatePNR() {
        return UUID.randomUUID().toString().substring(0, 6).toUpperCase();
    }

    // ✅ Add Passenger
    public void addPassenger(String name) {
        passengers.add(name);
    }

    // ✅ FIX: Add this method
    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Seat getSeat() {
        return seat;
    }

    // ✅ State Handling
    public void setState(BookingState state) {
        this.state = state;
    }

    public BookingState getState() {
        return state;
    }

    public void nextState() {
        state.next(this);
    }

    // ✅ Payment
    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public String getPnr() {
        return pnr;
    }

    // ✅ Display Booking
    public void display() {
        System.out.println("\n----- BOOKING DETAILS -----");
        System.out.println("PNR: " + pnr);
        System.out.println("Flight: " + flight);
        System.out.println("Passengers: " + passengers);
        System.out.println("Seat: " + (seat != null ? seat : "Not Selected"));
        System.out.println("State: " + state.getStatus());
        System.out.println("Payment: " + paymentStatus);
    }
}

