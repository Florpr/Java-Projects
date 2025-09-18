// File: Eggs.java
// Author: Flor Guadalupe y Evan Mendez
// Date: 2025-02-25
// Class: COMP 2315 Structured Programming
// Description: This program calculates the total cost of eggs based on the number of dozens and loose eggs.
import java.util.Scanner;

class Eggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de huevos: ");
        int numEggs = scanner.nextInt();

        int dozens = numEggs / 12;
        int looseEggs = numEggs % 12;

        double dozenPrice = dozens * 8.50;
        double loosePrice = looseEggs * 0.71;
        double totalPrice = dozenPrice + loosePrice;

        System.out.println("Usted ordenó " + numEggs + " huevos.");
        System.out.println("Eso es " + dozens + " docenas a $8.50 por docena");
        System.out.println("y " + looseEggs + " huevos sueltos a 71 centavos cada uno");
        System.out.println("para un total de $" + totalPrice);
    }
}

