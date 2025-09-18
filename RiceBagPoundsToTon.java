// File: RiceBagPoundsToTon.java
// Author: Flor A. Guadalupe
// Date: Sep-03-2025
// Class: COMP 2400 OOP
// Description:This script is giving the user a output of how many bags of rice in pounds are needed to make a ton.
import java.util.Scanner;

public class RiceBagPoundsToTon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double AmountOfRiceInPound;
        double TotalBagsDecimal;
        double PoundsInATon = 2204.62;
        System.out.print("Please enter the amount of pounds in each bag of rice:");
        AmountOfRiceInPound = scanner.nextDouble();
        TotalBagsDecimal = (PoundsInATon / AmountOfRiceInPound);
        int TotalBags;
        TotalBags = (int) Math.ceil(TotalBagsDecimal);
        System.out.println("The total amount of bags needed to make a ton are: " + TotalBags);


    }
}






