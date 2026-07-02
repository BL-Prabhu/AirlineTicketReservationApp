package menu;

import booking.Booking;
import model.*;
import payment.*;
import service.*;

import java.time.LocalDate;
import java.util.*;

public class PassengerMenu {

    private static Scanner sc = new Scanner(System.in);

    public static void showMenu() {

        FlightService fs = new FlightService();
        SeatService ss = new SeatService();
        BookingService bs = new BookingService();

        while (true) {

            System.out.println("\n1.Search\n2.Seat\n3.Book\n4.Exit");
            int ch = sc.nextInt(); sc.nextLine();

            switch (ch) {

                case 1:
                    List<Flight> f = fs.search("Chennai","Delhi", LocalDate.now());
                    f.forEach(System.out::println);
                    break;

                case 2:
                    ss.displaySeats();
                    break;

                case 3:
                    Flight fl = fs.search("Chennai","Delhi", LocalDate.now()).get(0);
                    Booking b = bs.createBooking(fl);

                    System.out.print("Name: ");
                    bs.addPassenger(b, sc.nextLine());

                    ss.displaySeats();
                    Seat seat = ss.autoAssign();
                    bs.selectSeat(b, seat);

                    System.out.println("1.UPI 2.Card");
                    int p = sc.nextInt(); sc.nextLine();

                    Payment pay = (p==1)
                            ? new UPIPayment(sc.nextLine())
                            : new CardPayment(sc.nextLine(), sc.nextLine());

                    bs.makePayment(b, pay, fl.getPrice());

                    b.display();
                    break;

                case 4:
                    return;
            }
        }
    }
}
