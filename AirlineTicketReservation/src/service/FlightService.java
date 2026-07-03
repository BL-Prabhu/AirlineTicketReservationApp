package service;

import model.Flight;
import repository.FlightRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    private FlightRepository repository = new FlightRepository();

    // ✅ Search using repository + filter
    public List<Flight> search(String source, String destination, LocalDate date) {

        List<Flight> allFlights = repository.getFlights();

        // ✅ Filter based on source & destination
        return allFlights.stream()
                .filter(f ->
                        f.toString().contains(source) &&
                                f.toString().contains(destination)
                )
                .collect(Collectors.toList());
    }
}
