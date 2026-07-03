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
    private int stops;
    private int availableSeats;

    // ✅ Constructor matching repository
    public Flight(String flightNumber, String airline, String source, String destination,
                  LocalDateTime departureTime, LocalDateTime arrivalTime,
                  double price, int stops, int availableSeats) {

        this.flightNumber = flightNumber;
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.stops = stops;
        this.availableSeats = availableSeats;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return flightNumber + " | " + airline + " | " +
                source + " -> " + destination +
                " | ₹" + price +
                " | Seats: " + availableSeats;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

}