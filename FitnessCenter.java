// File: FitnessCenter.java
// Author: Flor A. Guadalupe
// Date: Sep-17-2025
// Class: COMP 2400 OOP
// Description: This program calculates the cost of a fitness center membership based on age, months, and training sessions with discounts applied.
import java.util.Scanner;

public class FitnessCenter {

    public static void displayInfo() {
        System.out.println("=== Fitness Center Membership Information ===");
        System.out.println("Base membership: $50 per month");
        System.out.println("Senior citizen discount: 30%");
        System.out.println("12 or more months advance payment: 15% discount");
        System.out.println("Personal training sessions: $30 per session");
        System.out.println("More than 5 sessions: 20% discount per session");
    }

    public static double calculateCost(int age, int months, int sessions) {
        double monthlyRate = 50.0;
        double sessionRate = 30.0;
        double total = monthlyRate * months + sessionRate * sessions;

        if (age >= 60) {
            total *= 0.7; // 30% discount
        } else if (months >= 12) {
            total *= 0.85; // 15% discount
        }

        if (sessions > 5) {
            total -= (sessions * sessionRate * 0.20);
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayInfo();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        System.out.print("Enter number of personal training sessions: ");
        int sessions = sc.nextInt();

        double cost = calculateCost(age, months, sessions);
        System.out.printf("Total membership cost: $%.2f%n", cost);
    }
}
