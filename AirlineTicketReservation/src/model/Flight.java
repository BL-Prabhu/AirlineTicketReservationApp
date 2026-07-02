package model;

import java.time.LocalDateTime;

public class Flight
{
    private String flightNumber;
    private String airline;
    private String source;
    private String destination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private double price;
    private int stops;
    private int seats;

    public Flight(String flightNumber, String airline, String source, String destination,
                  LocalDateTime departureTime, LocalDateTime arrivalTime,
                  double price, int stops, int seats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.price = price;
        this.stops = stops;
        this.seats = seats;
    }

    public String getAirline() { return airline; }
    public String getSource() { return source; }
    public String getDestination() { return destination; }
    public LocalDateTime getDepartureTime() { return departureTime; }
    public LocalDateTime getArrivalTime() { return arrivalTime; }
    public double getPrice() { return price; }
    public int getStops() { return stops; }
    public int getSeats() { return seats; }

    public long getDuration() {
        return java.time.Duration.between(departureTime, arrivalTime).toMinutes();
    }

    @Override
    public String toString() {
        return flightNumber + " | " + airline + " | " + source + " -> " + destination +
                " | ₹" + price + " | Stops: " + stops;
    }
}