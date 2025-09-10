package com.mycompany.swapfirstlastdigit;

import java.util.Scanner;

public class SwapFirstLastDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Convert number to string for easy manipulation
        String str = String.valueOf(num);

        if (str.length() == 1) {
            // If single digit, swapping makes no difference
            System.out.println("Swapped number: " + num);
        } else {
            // Swap first and last characters
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);

            String swapped = last + str.substring(1, str.length() - 1) + first;

            System.out.println("Swapped number: " + swapped);
        }

        sc.close();
    }
}
