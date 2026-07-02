package menu;

import payment.*;
import service.PaymentService;

import java.util.Scanner;

public class PaymentMenu {

    public static void start(double amount) {

        Scanner sc = new Scanner(System.in);
        PaymentService service = new PaymentService();

        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.println("3. EMI");

        int choice = sc.nextInt();
        sc.nextLine();

        Payment payment = null;

        switch (choice) {
            case 1:
                System.out.print("Enter UPI ID: ");
                payment = new UPIPayment(sc.nextLine());
                break;

            case 2:
                System.out.print("Enter Card Number: ");
                String card = sc.nextLine();

                System.out.print("Enter CVV: ");
                String cvv = sc.nextLine();

                payment = new CardPayment(card, cvv);
                break;

            case 3:
                System.out.print("Enter Card Number: ");
                String emiCard = sc.nextLine();

                System.out.print("Months: ");
                int months = sc.nextInt();

                payment = new EMIPayment(emiCard, months);
                break;

            default:
                System.out.println("Invalid choice");
                return;
        }

        service.processPayment(payment, amount);
    }
}
