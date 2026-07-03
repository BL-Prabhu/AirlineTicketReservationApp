package service;

import model.Flight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightManagementService {

    private List<Flight> flights = new ArrayList<>();

    // 🔹 8.1 CREATE FLIGHT
    public void createFlight(String flightNo, String airline, String src, String dest,
                             LocalDateTime dep, LocalDateTime arr,
                             double price, int seats) {

        Flight f = new Flight(flightNo, airline, src, dest, dep, arr, price, 0, seats);
        flights.add(f);

        System.out.println("Flight Created ✅: " + f);
    }

    // 🔹 8.2 UPDATE FLIGHT STATUS
    public void updateStatus(String flightNo, String status) {
        for (Flight f : flights) {
            if (f.getFlightNumber().equals(flightNo)) {
                f.setStatus(status);
                System.out.println("Status Updated: " + f);
            }
        }
    }

    // 🔹 MODIFY FARE
    public void updateFare(String flightNo, double newPrice) {
        for (Flight f : flights) {
            if (f.getFlightNumber().equals(flightNo)) {
                f.setPrice(newPrice);
                System.out.println("Fare Updated: " + f);
            }
        }
    }

    // 🔹 8.3 SEARCH BY AIRLINE
    public void searchByAirline(String airline) {
        System.out.println("\nFlights by Airline: " + airline);
        for (Flight f : flights) {
            if (f.getAirline().equalsIgnoreCase(airline)) {
                System.out.println(f);
            }
        }
    }

    // 🔹 FILTER BY ROUTE
    public void searchByRoute(String src, String dest) {
        System.out.println("\nFlights from " + src + " to " + dest);
        for (Flight f : flights) {
            if (f.getSource().equalsIgnoreCase(src) &&
                    f.getDestination().equalsIgnoreCase(dest)) {
                System.out.println(f);
            }
        }
    }

    // 🔹 FILTER BY STATUS
    public void filterByStatus(String status) {
        System.out.println("\nFlights with status: " + status);
        for (Flight f : flights) {
            if (f.getStatus().equalsIgnoreCase(status)) {
                System.out.println(f);
            }
        }
    }

    // 🔹 OCCUPANCY REPORT
    public void occupancyReport() {
        System.out.println("\nFlight Occupancy Report:");
        for (Flight f : flights) {
            System.out.println(f.getFlightNumber() +
                    " → " + f.getOccupancyRate() + "% full");
        }
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
