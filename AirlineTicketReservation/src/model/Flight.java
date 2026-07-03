package model;

import java.time.LocalDateTime;

public class Flight {

    private String flightNumber;
    private String airline;
    private String source;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private double price;
    private int bookedSeats;
    private int totalSeats;

    public Flight(String flightNumber, String airline, String source, String destination,
                  LocalDateTime departureTime, LocalDateTime arrivalTime,
                  double price, int bookedSeats, int totalSeats) {

        this.flightNumber = flightNumber;
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.bookedSeats = bookedSeats;
        this.totalSeats = totalSeats;
    }

    // ✅ CORRECT GETTER (NO PARAMETER)
    public int getAvailableSeats() {
        return totalSeats - bookedSeats;
    }

    // ✅ Setter to update booked seats indirectly
    public void increaseBookedSeats(int count) {
        this.bookedSeats += count;
    }

    public void decreaseBookedSeats(int count) {
        this.bookedSeats -= count;
    }

    // 🔹 Other getters
    public double getPrice() {
        return price;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
    @Override
    public String toString() {
        return flightNumber + " | " + airline + " | " + source + " -> " + destination +
                " | ₹" + price + " | Seats: " + getAvailableSeats();
    }
}
