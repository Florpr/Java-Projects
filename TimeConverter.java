// File: TimeConverter.java
// Author: Flor A. Guadalupe
// Date: Sep-03-2025
// Class: COMP 2400 OOP
// Description:This script takes an elapsed time in seconds as input and converts it into a more readable format of hours, minutes, and seconds.
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSeconds;
        System.out.print("Please enter the total progress time in seconds: ");
        totalSeconds = scanner.nextInt();
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int finalSeconds = remainingSeconds % 60;
        System.out.printf("The progress time is: %d:%d:%d%n", hours, minutes, finalSeconds);

        scanner.close();
    }
}
