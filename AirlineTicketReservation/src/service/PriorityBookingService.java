package service;

import model.PriorityBooking;
import java.util.PriorityQueue;

public class PriorityBookingService {

    private PriorityQueue<PriorityBooking> queue = new PriorityQueue<>();

    // Add booking
    public void addBooking(PriorityBooking booking) {
        queue.add(booking);
        System.out.println("Added → " + booking.getPriority());
    }

    // Process next booking
    public void processNext() {
        if (queue.isEmpty()) {
            System.out.println("No bookings in queue");
            return;
        }

        PriorityBooking pb = queue.poll();
        System.out.println("\nProcessing → " + pb.getPriority());
        pb.getBooking().display();
    }

    // Process all
    public void processAll() {
        while (!queue.isEmpty()) {
            processNext();
        }
    }

    // Queue status
    public void status() {
        System.out.println("Queue Size: " + queue.size());
    }
}
