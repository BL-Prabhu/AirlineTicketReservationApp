package repository;

import model.Flight;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightRepository
{
    public List<Flight> getFlights() {

        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("AI101", "Air India", "Chennai", "Delhi",
                LocalDateTime.now().plusHours(2),
                LocalDateTime.now().plusHours(5),
                5000, 0, 50));

        flights.add(new Flight("6E202", "IndiGo", "Chennai", "Delhi",
                LocalDateTime.now().plusHours(3),
                LocalDateTime.now().plusHours(6),
                4500, 1, 40));

        flights.add(new Flight("SG303", "SpiceJet", "Chennai", "Mumbai",
                LocalDateTime.now().plusHours(1),
                LocalDateTime.now().plusHours(4),
                4000, 0, 30));

        return flights;
    }
}