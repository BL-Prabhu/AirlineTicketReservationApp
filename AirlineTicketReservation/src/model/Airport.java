package model;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private String code;       // IATA (MAA, DEL)
    private String name;
    private String city;
    private String country;
    private String timezone;

    private boolean active;

    private List<String> facilities;
    private String contact;

    public Airport(String code, String name, String city, String country) {
        this.code = code;
        this.name = name;
        this.city = city;
        this.country = country;

        this.timezone = "IST";
        this.active = true;
        this.facilities = new ArrayList<>();
    }

    // 🔹 GETTERS
    public String getCode() { return code; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public String getCountry() { return country; }
    public String getTimezone() { return timezone; }
    public boolean isActive() { return active; }

    // 🔹 SETTERS
    public void setTimezone(String timezone) { this.timezone = timezone; }
    public void setActive(boolean active) { this.active = active; }
    public void setContact(String contact) { this.contact = contact; }

    public void addFacility(String facility) {
        facilities.add(facility);
    }

    @Override
    public String toString() {
        return code + " | " + name + " | " + city + " | " + country +
                " | " + (active ? "ACTIVE" : "INACTIVE");
    }
}
