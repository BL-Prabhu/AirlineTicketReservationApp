package service;

import model.Seat;
import model.SeatMap;

import java.util.List;

public class SeatService {

    private SeatMap seatMap = new SeatMap();

    // ✅ Get all seats
    public List<Seat> getSeats() {
        return seatMap.getSeats();
    }

    // ✅ Display seats
    public void displaySeats() {
        System.out.println("\nAvailable Seats:");
        for (Seat seat : seatMap.getSeats()) {
            System.out.println(seat);
        }
    }

    // ✅ Auto assign first available seat
    public Seat autoAssign() {
        return seatMap.getSeats().get(0);
    }
}
