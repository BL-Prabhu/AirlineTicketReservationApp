package booking;

import model.Flight;
import model.Seat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Booking {

    private String pnr;
    private Flight flight;
    private List<String> passengers = new ArrayList<>();
    private List<Seat> seats = new ArrayList<>();
    private double totalFare;
    private BookingState state;
    private LocalDateTime expiryTime;

    public Booking(Flight flight) {
        this.flight = flight;
        this.state = new InitiatedState();
        this.pnr = generatePNR();
        this.expiryTime = LocalDateTime.now().plusMinutes(20);
    }

    public void nextState() {
        state.next(this);
    }

    public void setState(BookingState state) {
        this.state = state;
    }

    public String getStatus() {
        return state.getStatus();
    }

    public String getPnr() {
        return pnr;
    }

    public void addPassenger(String name) {
        passengers.add(name);
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
        totalFare += seat.getPrice();
    }

    public void calculateFare(double baseFare) {
        this.totalFare += baseFare + (baseFare * 0.1); // tax
    }

    private String generatePNR() {
        return "PNR" + new Random().nextInt(999999);
    }

    public void display() {
        System.out.println("\nPNR: " + pnr);
        System.out.println("Flight: " + flight);
        System.out.println("Passengers: " + passengers);
        System.out.println("Seats: " + seats.size());
        System.out.println("Total Fare: ₹" + totalFare);
        System.out.println("Status: " + getStatus());
    }
}