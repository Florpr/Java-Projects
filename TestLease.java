// File: TestLease.java
// Author: Flor A. Guadalupe
// Date: Sep-17-2025
// Class: COMP 2400 OOP
// Description: This program tests the Lease class by creating multiple Lease objects, displaying their values, and applying the pet fee to one of them.
import java.util.Scanner;

public class TestLease {
    public static Lease getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tenant name: ");
        String name = sc.nextLine();

        System.out.print("Enter apartment number: ");
        int aptNum = sc.nextInt();

        System.out.print("Enter monthly rent: ");
        double rent = sc.nextDouble();

        System.out.print("Enter lease term (months): ");
        int term = sc.nextInt();

        return new Lease(name, aptNum, rent, term);
    }

    public static void showValues(Lease lease) {
        System.out.println("Tenant: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getApartmentNumber());
        System.out.println("Monthly Rent: $" + lease.getRent());
        System.out.println("Lease Term: " + lease.getTerm() + " months");
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Lease lease1 = getData();
        Lease lease2 = getData();
        Lease lease3 = getData();
        Lease lease4 = new Lease(); // default

        System.out.println("\n=== Showing Lease1 Values ===");
        showValues(lease1);

        lease1.addPetFee();
        System.out.println("\nAfter adding pet fee:");
        showValues(lease1);

        System.out.println("=== Lease2 Values ===");
        showValues(lease2);

        System.out.println("=== Lease3 Values ===");
        showValues(lease3);

        System.out.println("=== Lease4 (Default) Values ===");
        showValues(lease4);
    }
}
