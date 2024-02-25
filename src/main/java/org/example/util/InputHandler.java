package org.example.util;

import java.util.Scanner;

/**
 * This class is used to handle user input.
 * It contains methods to get integer and string input from the user.
 * It also contains a method to get validated input from the user.
 * The class is used by other classes to get input from the user.
 */
public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntInput(String prompt) {
        int number = 0;
        while (true) {
            try {
                System.out.print(prompt);
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return number;
    }

    public static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static String getValidatedInput(String prompt, String errorMessage) {
        String input = "";
        while (input.isEmpty()) {
            input = InputHandler.getStringInput(prompt);
            if (input.isEmpty()) {
                System.out.println(errorMessage);
            }
        }
        return input;
    }
}


