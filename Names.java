// File: BabyNameComparison.java
// Author: Flor Guadalupe
// Date: 2025-03-18
// Class: COMP 2315 Structured Programming
// Description: This program prompts the user for three first names and concatenates them
// in every possible two-name combination to help new parents choose a baby name.

import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for three first names
        System.out.print("Enter the first name: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter the second name: ");
        String name2 = scanner.nextLine();

        System.out.print("Enter the third name: ");
        String name3 = scanner.nextLine();

        // Display all possible two-name combinations
        System.out.println("\nPossible baby name combinations:");
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);

        // Close the scanner
        scanner.close();
    }
}
