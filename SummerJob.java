// File: SummerJob.java
// Author: Flor A. Guadalupe
// Date: Sep-03-2025
// Class: COMP 2400 OOP
// Description: This script script is to calculate and display a breakdown of a summer job's earnings.
import java.util.Scanner;

public class SummerJob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payRate;
        double hoursWorkedPerWeek;

        System.out.print("Please enter your hourly pay rate: $");
        payRate = scanner.nextDouble();

        System.out.print("Please enter the number of hours you worked each week: ");
        hoursWorkedPerWeek = scanner.nextDouble();

        double grossIncome = (payRate * hoursWorkedPerWeek) * 5;
        double taxesPaid = grossIncome * 0.14;
        double netIncome = grossIncome - taxesPaid;

        double clothesMoney = netIncome * 0.10;
        double suppliesMoney = netIncome * 0.01;
        double remainingMoney = netIncome - clothesMoney - suppliesMoney;
        double myBondsMoney = remainingMoney * 0.25;
        double parentsBondsMoney = myBondsMoney * 0.50;

        System.out.println(" Your Summer Job Financial Summary ");
        System.out.printf("a. Income before taxes: $%.2f%n", grossIncome);
        System.out.printf("   Income after taxes:  $%.2f%n", netIncome);
        System.out.printf("b. Money for clothes:    $%.2f%n", clothesMoney);
        System.out.printf("c. Money for supplies:   $%.2f%n", suppliesMoney);
        System.out.printf("d. Your savings bonds:   $%.2f%n", myBondsMoney);
        System.out.printf("e. Parents' bond money:  $%.2f%n", parentsBondsMoney);

        scanner.close();
    }
}
