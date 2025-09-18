// File: InflationRate.java
// Author: Flor A. Guadalupe
// Date: Sep-17-2025
// Class: COMP 2400 OOP
// Description: This program calculates inflation rates for two years based on item prices and determines if the rate is increasing or decreasing.
import java.util.Scanner;

public class InflationRate {

    public static double calculateRate(double oldPrice, double newPrice) {
        return (newPrice - oldPrice) / oldPrice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price 2 years ago: ");
        double price2Years = sc.nextDouble();

        System.out.print("Enter price 1 year ago: ");
        double price1Year = sc.nextDouble();

        System.out.print("Enter current price: ");
        double currentPrice = sc.nextDouble();

        double rate1 = calculateRate(price2Years, price1Year);
        double rate2 = calculateRate(price1Year, currentPrice);

        System.out.printf("Inflation rate 1 year ago: %.2f%%%n", rate1 * 100);
        System.out.printf("Inflation rate this year: %.2f%%%n", rate2 * 100);

        if (rate2 > rate1) {
            System.out.println("Inflation rate is increasing.");
        } else {
            System.out.println("Inflation rate is decreasing.");
        }
    }
}
