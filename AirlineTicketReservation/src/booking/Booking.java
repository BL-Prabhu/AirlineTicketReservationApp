package booking;

import model.*;
import java.util.*;

public class Booking {

    private String pnr;
    private Flight flight;
    private Seat seat;
    private List<String> passengers = new ArrayList<>();
    private String paymentStatus;

    // ✅ ADD THIS
    private BookingState state;

    public Booking(Flight flight) {
        this.flight = flight;
        this.pnr = UUID.randomUUID().toString().substring(0,6);
        this.state = new InitiatedState(); // default state
    }

    public void setState(BookingState state) {
        this.state = state;
    }

    public BookingState getState() {
        return state;
    }

    public void addPassenger(String name) {
        passengers.add(name);
        state.next(this); // move to next state
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
        state.next(this);
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getSeat() { return seat; }
    public Flight getFlight() { return flight; }
    public String getPnr() { return pnr; }

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }

    public void display() {
        System.out.println("\nPNR: " + pnr);
        System.out.println("Flight: " + flight);
        System.out.println("Passengers: " + passengers);
        System.out.println("Seat: " + seat);
        System.out.println("State: " + state.getStatus()); // ✅ show state
        System.out.println("Payment: " + paymentStatus);
    }
// Add inside your existing Booking class

    private String status = "CONFIRMED";

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public List<String> getPassengers() {
        return passengers;
    }


}
