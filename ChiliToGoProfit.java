// File: ChiliToGo.java
// Author: Flor Guadalupe y Evan Mendez
// Date: 2025-03-04
// Class: COMP 2315 Structured Programming
// calculates and displays the total profit for each type of meal as well as the grand
// total profit
import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        // Constants for meal prices
        final double PriceAdultMeal = 7.00;
        final double PriceChildMeal = 4.00;

        // Constants for meal costs
        final double CostAdultMeal = 4.35;
        final double CostChildMeal = 3.10;

        Scanner input = new Scanner(System.in);

        // Display menu prices
        System.out.println("Welcome to Chili To Go!");
        System.out.println("Our Menu Is The Following:");
        System.out.println("Adult Meal - $7.00");
        System.out.println("Children's Meal - $4.00");
        System.out.println("Place your order below.");

        // Get user input
        System.out.print("Enter number of adult meals ordered: ");
        int AdultMeals = input.nextInt();

        System.out.print("Enter number of children's meals ordered: ");
        int ChildMeals = input.nextInt();

        // Calculate total sales
        double AdultSalesTotal = AdultMeals * PriceAdultMeal;
        double ChildSalesTotal = ChildMeals * PriceChildMeal;
        double TotalSales = AdultSalesTotal + ChildSalesTotal;

        // Calculate total costs
        double AdultCostTotal = AdultMeals * CostAdultMeal;
        double ChildCostTotal = ChildMeals * CostChildMeal;
        double TotalCost = AdultCostTotal + ChildCostTotal;

        // Calculate total profit
        double AdultProfit = AdultSalesTotal - AdultCostTotal;
        double ChildProfit = ChildSalesTotal - ChildCostTotal;
        double TotalProfit = AdultProfit + ChildProfit;

        // Display results
        System.out.printf("Total collected for adult meals: $%.2f%n", AdultSalesTotal);
        System.out.printf("Total collected for children's meals: $%.2f%n", ChildSalesTotal);
        System.out.printf("Total collected: $%.2f%n", TotalSales);

        System.out.printf("Total profit for adult meals: $%.2f%n", AdultProfit);
        System.out.printf("Total profit for children's meals: $%.2f%n", ChildProfit);
        System.out.printf("Grand total profit: $%.2f%n", TotalProfit);

        input.close();
    }
}
