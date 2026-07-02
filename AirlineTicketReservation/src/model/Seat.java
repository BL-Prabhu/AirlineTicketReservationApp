package model;

public class Seat
{

    public enum SeatType { WINDOW, MIDDLE, AISLE }
    public enum SeatStatus { AVAILABLE, BOOKED, BLOCKED }

    private String seatNumber;
    private SeatType type;
    private SeatStatus status;
    private boolean isPremium;
    private double price;

    public Seat(String seatNumber, SeatType type, boolean isPremium, double price) {
        this.seatNumber = seatNumber;
        this.type = type;
        this.isPremium = isPremium;
        this.price = price;
        this.status = SeatStatus.AVAILABLE;
    }


    public String getSeatNumber() { return seatNumber; }
    public SeatType getType() { return type; }
    public SeatStatus getStatus() { return status; }
    public boolean isPremium() { return isPremium; }
    public double getPrice() { return price; }

    public void book() {
        this.status = SeatStatus.BOOKED;
    }

    public void block() {
        this.status = SeatStatus.BLOCKED;
    }

    public boolean isAvailable() {
        return this.status == SeatStatus.AVAILABLE;
    }
}