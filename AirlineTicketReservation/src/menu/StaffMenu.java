package menu;

import util.ScannerHelper;

public class StaffMenu {

    public static void showMenu()
    {
        boolean logout = false;
        while (!logout) {
            System.out.println("\n------- AIRLINE STAFF MENU -------");
            System.out.println("1. View Flights");
            System.out.println("2. Manage Bookings");
            System.out.println("3. Logout");
            int choice = ScannerHelper.readInt("Enter your choice : ");
            switch (choice) {
                case 1:
                    System.out.println("View Flights feature will be implemented in future use cases.");
                    break;
                case 2:
                    System.out.println("Manage Bookings feature will be implemented in future use cases.");
                    break;
                case 3:
                    System.out.println("Logging out from Airline Staff...");
                    logout = true;
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}