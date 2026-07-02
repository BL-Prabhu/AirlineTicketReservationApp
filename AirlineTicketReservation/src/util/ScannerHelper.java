package util;

import java.util.Scanner;

public class ScannerHelper
{
    private static final Scanner scanner = new Scanner(System.in);

    public static int readInt(String prompt) {

        while (true) {

            try {

                System.out.print(prompt);
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Invalid input. Please enter a number.");
            }
        }
    }
}