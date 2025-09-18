// File: ChiliToGo.java
// Author: Flor Guadalupe y Evan Mendez
// Date: 2025-03-04
// Class: COMP 2315 Structured Programming
// Description: This program calculates the total money collected from selling
//adult and children's meals at a fundraiser.
import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        final double PriceAdultMeal = 7.00;
        final double PriceChildMeal = 4.00;

        Scanner input = new Scanner(System.in);

        // Display menu prices
        System.out.println("Welcome to Chili To Go!");
        System.out.println("Our Menu Is The Following:");
        System.out.println("Adult Meal - $7.00");
        System.out.println("Children's Meal - $4.00");
        System.out.println("Place your order below please.");

        // Get user input
        System.out.print("Enter number of adult meals ordered: ");
        int AdultMeals = input.nextInt();

        System.out.print("Enter number of children's meals ordered: ");
        int ChildMeals = input.nextInt();

        // Calculate totals
        double AdultSalesTotal = AdultMeals * PriceAdultMeal;
        double ChildSalesTotal = ChildMeals * PriceChildMeal;
        double Total = AdultSalesTotal + ChildSalesTotal;

        // Display results using printf for formatted output
        System.out.printf("Total collected for adult meals: $%.2f%n", AdultSalesTotal);
        System.out.printf("Total collected for children's meals: $%.2f%n", ChildSalesTotal);
        System.out.printf("Total collected: $%.2f%n", Total);

        input.close();
    }
}
