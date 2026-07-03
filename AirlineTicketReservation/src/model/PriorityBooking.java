package model;

import booking.Booking;

public class PriorityBooking implements Comparable<PriorityBooking> {

    public enum PriorityLevel {
        EXPRESS, REGULAR
    }

    private Booking booking;
    private PriorityLevel priority;
    private long timestamp;

    public PriorityBooking(Booking booking, PriorityLevel priority) {
        this.booking = booking;
        this.priority = priority;
        this.timestamp = System.currentTimeMillis();
    }

    public Booking getBooking() {
        return booking;
    }

    public PriorityLevel getPriority() {
        return priority;
    }

    @Override
    public int compareTo(PriorityBooking other) {

        // EXPRESS first
        if (this.priority != other.priority) {
            return this.priority == PriorityLevel.EXPRESS ? -1 : 1;
        }

        // Same priority → earlier first
        return Long.compare(this.timestamp, other.timestamp);
    }
}
