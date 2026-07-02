package service;

import booking.Booking;
import model.Flight;
import model.Seat;

import java.util.*;

public class BookingService {

    private Map<String, Booking> bookings = new HashMap<>();

    public Booking createBooking(Flight flight) {
        Booking booking = new Booking(flight);
        bookings.put(booking.getPnr(), booking);
        return booking;
    }

    public void addPassenger(Booking booking, String name) {
        booking.addPassenger(name);
        booking.nextState();
    }

    public void selectSeat(Booking booking, Seat seat) {
        booking.addSeat(seat);
        booking.nextState();
    }

    public void payment(Booking booking, double baseFare) {
        booking.calculateFare(baseFare);
        booking.nextState();
        booking.nextState(); // move to CONFIRMED
        System.out.println("Payment Successful!");
    }

    public Booking getBooking(String pnr) {
        return bookings.get(pnr);
    }

    public void showAllBookings() {
        bookings.values().forEach(Booking::display);
    }
}