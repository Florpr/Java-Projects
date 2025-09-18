// File: NumberGuessingGame.java
// Author: Flor Guadalupe and Evan Mendez
// Date: 2025-02-18
// Class: COMP 2315 Structured Programming
// Description: This program allows a user to guess a randomly generated number between 1 and 100.
// The program provides feedback if the guess is too high or too low until the correct number is guessed.

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int getInput;

        System.out.println("Welcome to the Guessing Game! Pick a number between 1 and 100—keep guessing until you win!");
        System.out.print("Select a number of your choice between 1 and 100: ");
        getInput = scanner.nextInt();

        while (getInput < 100) {
            if (getInput > randomNumber) {
                System.out.println("The number you selected is high, please make another choice of number and continue game.");
            } else if (getInput < randomNumber) {
                System.out.println("The number you selected is low, please make another choice of number and continue game.");
            } else {
                System.out.println("Correct number you WIN!");
                break;
            }
            System.out.print("Select a number between 1 and 100: ");
            getInput = scanner.nextInt();
        }

        scanner.close();
    }
}
