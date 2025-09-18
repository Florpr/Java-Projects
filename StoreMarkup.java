// File: StoreMarkup.java
// Author: Flor A. Guadalupe
// Date: Sep-03-2025
// Class: COMP 2400 OOP
// Description: This script is to calculate and display the final price of an item after applying a specific markup percentage and sales tax rate.
import java.util.Scanner;

public class StoreMarkup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double originalPrice;
        double markupPercentage;
        double salesTaxRate;

        System.out.print("Enter the original price of the item: $");
        originalPrice = scanner.nextDouble();
        System.out.print("Enter the markup percentage: ");
        markupPercentage = scanner.nextDouble();
        System.out.print("Enter the sales tax rate: ");
        salesTaxRate = scanner.nextDouble();

        double markupAmount = originalPrice * (markupPercentage / 100.0);
        double sellingPrice = originalPrice + markupAmount;
        double salesTaxAmount = sellingPrice * (salesTaxRate / 100.0);
        double finalPrice = sellingPrice + salesTaxAmount;
        System.out.println(" Item Details ");
        System.out.printf("Original Price:         $%.2f%n", originalPrice);
        System.out.printf("Marked-up Percentage:   %.1f%%%n", markupPercentage);
        System.out.printf("Store's Selling Price:  $%.2f%n", sellingPrice);
        System.out.printf("Sales Tax Rate:         %.1f%%%n", salesTaxRate);
        System.out.printf("Sales Tax Amount:       $%.2f%n", salesTaxAmount);
        System.out.printf("Final Price:            $%.2f%n", finalPrice);

        scanner.close();
    }
}
