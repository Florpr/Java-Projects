// File: NumbersDemo.java
// Author: Flor Guadalupe
// Date: 2025-02-11
// Class: COMP 2315 Structured Programming
// Description: This program takes two integers from the user and passes them to methods that double, add five, and square the number.

import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for two integer values
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        // Call methods for each number
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);

        input.close();
    }

    // Method to display twice the number
    public static void displayTwiceTheNumber(int number) {
        System.out.println("Twice " + number + " is: " + (number * 2));
    }

    // Method to display the number plus five
    public static void displayNumberPlusFive(int number) {
        System.out.println(number + " plus 5 is: " + (number + 5));
    }

    // Method to display the number squared
    public static void displayNumberSquared(int number) {
        System.out.println(number + " squared is: " + (number * number));
    }
}