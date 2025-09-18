// File: Profit.java
// Author: Flor Guadalupe
// Date: 2025-02-11
// Class: COMP 2315 Structured Programming
// Description: This program calculates a homeowner's profit from a home sale by deducting the expenses.

import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inform user about the input questions
        System.out.println("Answer the following questions to find out the homeowners profit will be!");

        // Prompt user for values
        System.out.print("Enter the sale price of the home: ");
        double salePrice = input.nextDouble();

        System.out.print("Enter the mortgage payoff amount: ");
        double mortgagePayoff = input.nextDouble();

        System.out.print("Enter the realtor's commission: ");
        double realtorCommission = input.nextDouble();

        System.out.print("Enter the title insurance fee: ");
        double titleInsurance = input.nextDouble();

        System.out.print("Enter the transfer tax amount: ");
        double transferTax = input.nextDouble();

        // Calculate profit
        double profit = calculateProfit(salePrice, mortgagePayoff, realtorCommission, titleInsurance, transferTax);

        // Display profit
        System.out.println("Analizing all of the information given, the homeowner's profit from the sale is: $" + profit);

        input.close();
    }

    // Method to calculate homeowner's profit
    public static double calculateProfit(double salePrice, double mortgagePayoff, double realtorCommission, double titleInsurance, double transferTax) {
        return salePrice - (mortgagePayoff + realtorCommission + titleInsurance + transferTax);
    }
}

