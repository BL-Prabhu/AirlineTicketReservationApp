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

    // 🔹 NEW (UC8)
    private String status; // ON_TIME, DELAYED, CANCELLED
    private String aircraftType;
    private double baggageAllowance;

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

        this.status = "ON_TIME";
        this.aircraftType = "A320";
        this.baggageAllowance = 15;
    }

    // 🔹 GETTERS
    public String getFlightNumber() { return flightNumber; }
    public String getAirline() { return airline; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public LocalDateTime getDepartureTime() { return departureTime; }
    public double getPrice() { return price; }
    public String getStatus() { return status; }

    public int getAvailableSeats() {
        return totalSeats - bookedSeats;
    }

    // 🔹 SETTERS
    public void setPrice(double price) { this.price = price; }
    public void setStatus(String status) { this.status = status; }
    public void setAircraftType(String type) { this.aircraftType = type; }

    public void increaseBookedSeats(int count) { bookedSeats += count; }
    public void decreaseBookedSeats(int count) { bookedSeats -= count; }

    // 🔹 OCCUPANCY
    public double getOccupancyRate() {
        return (bookedSeats * 100.0) / totalSeats;
    }

    @Override
    public String toString() {
        return flightNumber + " | " + airline + " | " + source + " -> " + destination +
                " | ₹" + price + " | Seats: " + getAvailableSeats() +
                " | Status: " + status;
    }
}
