//File: PaintCalculator.java
// Author: Flor Guadalupe y Evan Mendez
// Date: 2025-03-06
// Class: Structured Programming 15
// Description: This program calculates the amount of paint required to cover a room and its total cost.

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter in the following the room dimensions in feet please!");
        System.out.print("Enter Room Length: ");
        int roomLength = input.nextInt();
        System.out.print("Enter Room Width: ");
        int roomWidth = input.nextInt();
        System.out.print("Enter Room Height: ");
        int roomHeight = input.nextInt();

        System.out.println("Room Dimensions: " + roomLength + " x " + roomWidth + " x " + roomHeight);

        double wallArea = computeWallArea(roomLength, roomWidth, roomHeight);
        double paintRequired = calculatePaintNeeded(wallArea);
        double totalCost = computeTotalCost(paintRequired);

        System.out.printf("Total gallons required: %.2f\n", paintRequired);
        System.out.printf("Total cost: $%.2f\n", totalCost);
    }

    private static double computeWallArea(int length, int width, int height) {
        double area = 2 * (length + width) * height;
        System.out.println("Wall area is: " + area + " square feet");
        return area;
    }

    private static double calculatePaintNeeded(double area) {
        return area / 350.0;
    }

    private static double computeTotalCost(double gallons) {
        final double pricePerGallon = 32.0;
        return gallons * pricePerGallon;
    }
}
