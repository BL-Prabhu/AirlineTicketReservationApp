package menu;


import util.ScannerHelper;

public class AdminMenu {

    public static void showMenu() {
        boolean logout = false;
        while (!logout) {
            System.out.println("\n----------- ADMIN MENU -----------");
            System.out.println("1. Manage Users");
            System.out.println("2. Manage Flights");
            System.out.println("3. View Reports");
            System.out.println("4. Logout");
            int choice = ScannerHelper.readInt("Enter your choice : ");
            switch (choice) {
                case 1:
                    System.out.println("User Management feature will be implemented in future use cases.");
                    break;
                case 2:
                    System.out.println("Flight Management feature will be implemented in future use cases.");
                    break;
                case 3:
                    System.out.println("Reports feature will be implemented in future use cases.");
                    break;
                case 4:
                    System.out.println("Logging out from Admin...");
                    logout = true;
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}