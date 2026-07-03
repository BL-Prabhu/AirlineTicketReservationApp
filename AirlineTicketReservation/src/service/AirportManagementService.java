package service;

import model.Airport;

import java.util.ArrayList;
import java.util.List;

public class AirportManagementService {

    private List<Airport> airports = new ArrayList<>();

    // 🔹 ADD AIRPORT
    public void addAirport(String code, String name, String city, String country) {
        Airport airport = new Airport(code, name, city, country);
        airports.add(airport);
        System.out.println("Airport Added ✅: " + airport);
    }

    // 🔹 UPDATE AIRPORT
    public void updateAirport(String code, String newName) {
        for (Airport a : airports) {
            if (a.getCode().equalsIgnoreCase(code)) {
                System.out.println("Updating Airport: " + a.getCode());
                System.out.println("Old Name: " + a.getName());
                System.out.println("New Name: " + newName);
            }
        }
    }

    // 🔹 SEARCH BY CODE
    public void searchByCode(String code) {
        for (Airport a : airports) {
            if (a.getCode().equalsIgnoreCase(code)) {
                System.out.println("Found Airport: " + a);
                return;
            }
        }
        System.out.println("❌ Airport not found");
    }

    // 🔹 SEARCH BY CITY
    public void searchByCity(String city) {
        System.out.println("\nAirports in " + city + ":");
        for (Airport a : airports) {
            if (a.getCity().equalsIgnoreCase(city)) {
                System.out.println(a);
            }
        }
    }

    // 🔹 SEARCH BY NAME
    public void searchByName(String name) {
        System.out.println("\nSearch Result:");
        for (Airport a : airports) {
            if (a.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(a);
            }
        }
    }

    // 🔹 LIST BY COUNTRY
    public void listByCountry(String country) {
        System.out.println("\nAirports in " + country + ":");
        for (Airport a : airports) {
            if (a.getCountry().equalsIgnoreCase(country)) {
                System.out.println(a);
            }
        }
    }

    // 🔹 AUTO SUGGEST
    public void autoSuggest(String keyword) {
        System.out.println("\nSuggestions for '" + keyword + "':");
        for (Airport a : airports) {
            if (a.getCity().toLowerCase().startsWith(keyword.toLowerCase()) ||
                    a.getName().toLowerCase().startsWith(keyword.toLowerCase())) {
                System.out.println(a.getName());
            }
        }
    }

    // 🔹 DISPLAY ALL
    public void displayAll() {
        System.out.println("\nAll Airports:");
        for (Airport a : airports) {
            System.out.println(a);
        }
    }

    public List<Airport> getAirports() {
        return airports;
    }
}
