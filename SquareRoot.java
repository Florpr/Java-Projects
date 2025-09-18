// File: SquareRoot.java
// Author: Flor A. Guadalupe
// Date: Sep-17-2025
// Class: COMP 2400 OOP
// Description: This program displays the square roots of the first 25 positive integers using Math.sqrt().
public class SquareRoot {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.printf("Number: %d, Square Root: %.4f%n", i, Math.sqrt(i));
        }
    }
}
