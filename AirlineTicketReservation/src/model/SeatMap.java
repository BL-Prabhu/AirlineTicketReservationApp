package model;

import java.util.ArrayList;
import java.util.List;

public class SeatMap {

    private List<Seat> seats = new ArrayList<>();

    public SeatMap() {
        generateSeats();
    }

    private void generateSeats() {

        for (int row = 1; row <= 5; row++) {
            seats.add(new Seat(row + "A", Seat.SeatType.WINDOW, false, 0));
            seats.add(new Seat(row + "B", Seat.SeatType.MIDDLE, false, 0));
            seats.add(new Seat(row + "C", Seat.SeatType.AISLE, true, 500)); // premium
        }
    }

    public List<Seat> getSeats() {
        return seats;
    }
}
