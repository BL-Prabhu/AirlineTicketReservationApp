package model;

public class Seat {

    // ✅ Enum added
    public enum SeatType {
        WINDOW,
        MIDDLE,
        AISLE
    }

    private String number;
    private SeatType type;
    private boolean isPremium;
    private double price;

    // ✅ Updated constructor
    public Seat(String number, SeatType type, boolean isPremium, double price) {
        this.number = number;
        this.type = type;
        this.isPremium = isPremium;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public SeatType getType() {
        return type;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return number + " | " + type +
                (isPremium ? " | Premium ₹" + price : " | Normal");
    }
}
