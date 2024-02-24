package org.example.util;

import java.util.Scanner;

public class InputHandler {

    public static int getIntInput(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt);
        int input = scan.nextInt();
        return input;
    }

    public static String getStringInput(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt);
        String input = scan.nextLine();
        return input;
    }
}
