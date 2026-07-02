package service;

import model.Seat;
import model.SeatMap;

import java.util.List;
import java.util.Optional;

public class SeatService {

    private SeatMap seatMap = new SeatMap();

    // 🎯 Display Seat Map
    public void displaySeats() {
        System.out.println("\nSeat Map:");
        for (Seat seat : seatMap.getSeats()) {
            String color = switch (seat.getStatus()) {
                case AVAILABLE -> "GREEN";
                case BOOKED -> "RED";
                case BLOCKED -> "GRAY";
            };
            System.out.println(seat.getSeatNumber() + " [" + color + "]");
        }
    }

    // 🎯 Select Seat
    public boolean selectSeat(String seatNumber) {
        Optional<Seat> seatOpt = seatMap.getSeats().stream()
                .filter(s -> s.getSeatNumber().equalsIgnoreCase(seatNumber))
                .findFirst();

        if (seatOpt.isPresent()) {
            Seat seat = seatOpt.get();

            if (!seat.isAvailable()) {
                System.out.println("Seat not available!");
                return false;
            }

            seat.book();

            if (seat.isPremium()) {
                System.out.println("Premium seat selected. Extra charge: ₹" + seat.getPrice());
            }

            System.out.println("Seat " + seatNumber + " booked successfully!");
            return true;
        }

        System.out.println("Invalid seat number!");
        return false;
    }

    // 🎯 Auto Assign Seat
    public Seat autoAssign() {
        return seatMap.getSeats().stream()
                .filter(Seat::isAvailable)
                .findFirst()
                .map(seat -> {
                    seat.book();
                    return seat;
                })
                .orElse(null);
    }

    // 🎯 Total Available Seats
    public long availableSeats() {
        return seatMap.getSeats().stream()
                .filter(Seat::isAvailable)
                .count();
    }
}