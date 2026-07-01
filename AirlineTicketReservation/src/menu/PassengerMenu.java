package menu;

import util.ScannerHelper;

public class PassengerMenu {

    public static void showMenu() {
        boolean logout = false;
        while (!logout) {
            System.out.println("\n--------- PASSENGER MENU ---------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Manage Profile");
            System.out.println("4. Logout");
            int choice = ScannerHelper.readInt("Enter your choice : ");
            switch (choice) {
                case 1:
                    System.out.println("Passenger Registration will be implemented in UC2.");
                    break;
                case 2:
                    System.out.println("Login feature will be implemented in future use cases.");
                    break;
                case 3:
                    System.out.println("Profile Management will be implemented in future use cases.");
                    break;
                case 4:
                    System.out.println("Logging out from Passenger...");
                    logout = true;
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}