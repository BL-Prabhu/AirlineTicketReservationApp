import menu.AdminMenu;
import menu.PassengerMenu;
import menu.StaffMenu;
import util.ScannerHelper;

public class AirlineTicketReservationApp
{
    private static final int ROLE_PASSENGER = 1;
    private static final int ROLE_ADMIN = 2;
    private static final int ROLE_STAFF = 3;
    private static final int EXIT = 4;


    public static void main(String[] args) {
        boolean exitSystem = false;
        while (!exitSystem) {
            System.out.println("\n==============================================");
            System.out.println(" AIRLINE TICKET RESERVATION SYSTEM ");
            System.out.println("==============================================");
            System.out.println("1. Passenger");
            System.out.println("2. Admin");
            System.out.println("3. Airline Staff");
            System.out.println("4. Exit");
            int choice = ScannerHelper.readInt("Enter your choice : ");
            switch (choice) {
                case ROLE_PASSENGER:
                    PassengerMenu.showMenu();
                    break;
                case ROLE_ADMIN:
                    AdminMenu.showMenu();
                    break;
                case ROLE_STAFF:
                    StaffMenu.showMenu();
                    break;
                case EXIT:
                    System.out.println("\nThank you for using Airline Ticket Reservation System.");
                    exitSystem = true;
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
            }
        }
    }

}