package service;

import model.Flight;
import repository.FlightRepository;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class FlightService {

    private final FlightRepository repository = new FlightRepository();

    // 🔍 Search Flights
    public List<Flight> search(String source, String destination, LocalDate date) {
        return repository.getFlights().stream()
                .filter(f -> f.getSource().equalsIgnoreCase(source))
                .filter(f -> f.getDestination().equalsIgnoreCase(destination))
                .filter(f -> f.getDepartureTime().toLocalDate().equals(date))
                .collect(Collectors.toList());
    }

    // 🎯 Filters
    public List<Flight> filterByPrice(List<Flight> flights, double min, double max) {
        return flights.stream()
                .filter(f -> f.getPrice() >= min && f.getPrice() <= max)
                .collect(Collectors.toList());
    }

    public List<Flight> filterByStops(List<Flight> flights, int stops) {
        return flights.stream()
                .filter(f -> f.getStops() == stops)
                .collect(Collectors.toList());
    }

    // 🔄 Sorting
    public List<Flight> sortByPrice(List<Flight> flights) {
        return flights.stream()
                .sorted(Comparator.comparingDouble(Flight::getPrice))
                .collect(Collectors.toList());
    }

    public List<Flight> sortByDuration(List<Flight> flights) {
        return flights.stream()
                .sorted(Comparator.comparingLong(Flight::getDuration))
                .collect(Collectors.toList());
    }

    // 📊 Advanced (Streams)

    public Map<String, List<Flight>> groupByAirline(List<Flight> flights) {
        return flights.stream()
                .collect(Collectors.groupingBy(Flight::getAirline));
    }

    public Map<String, Double> avgFareByAirline(List<Flight> flights) {
        return flights.stream()
                .collect(Collectors.groupingBy(
                        Flight::getAirline,
                        Collectors.averagingDouble(Flight::getPrice)
                ));
    }

    public Optional<Flight> cheapestFlight(List<Flight> flights) {
        return flights.stream()
                .min(Comparator.comparingDouble(Flight::getPrice));
    }

    public int totalSeats(List<Flight> flights) {
        return flights.stream()
                .mapToInt(Flight::getSeats)
                .sum();
    }
}