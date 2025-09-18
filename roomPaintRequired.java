// file name: roomPaintRequiered.java
// Coruse: Stured Programming 15

import java.util.*;


public class roomPaintRequired {
    public static void main(String[] args) {
        System.out.println("Input measurement in feet.");
        System.out.println("Enter Length:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        System.out.println("Enter Width:");
        int width = sc.nextInt();
        System.out.println("Enter Height:");
        int height = sc.nextInt();
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Height is: " + height);


        double area = areaCalculation (length, width, height);
        gallonsCalculation (length, width, height, area);
    }

    private static double areaCalculation(int length, int width, int height) {
        double area = 2* (length + width) * height;
        System.out.println("Area is: " + area);
        return area;
    }

    private static void gallonsCalculation(int length, int width, int height, double area) {
        double gallonAmount = area / 350;
        totalGallons (gallonAmount);
    }

    private static void totalGallons(double gallonAmount) {
        System.out.println("Total gallons: " + gallonAmount);
        priceTotal (gallonAmount);
    }

    private static double priceTotal(double gallonAmount) {
        int gallonPrice = 32;
        double gallonTotal = gallonPrice * gallonAmount;
        System.out.printf("Total price is: $%.2f", gallonTotal);
        System.out.printf("\nTotal needed is: %.2f", gallonAmount);
        return gallonTotal;
    }


}