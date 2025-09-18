// File: TimeConverter.java
// Author: Flor A. Guadalupe
// Date: Sep-03-2025
// Class: COMP 2400 OOP
// Description: This script is used for the hours,minutes and seconds turned all into seconds.
import java.util.Scanner;

public class TimeInSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hours;
        int minutes;
        int seconds;

        System.out.print("Please enter the number of hours: ");
        hours = scanner.nextInt();
        System.out.print("Please enter the number of minutes: ");
        minutes = scanner.nextInt();
        System.out.print("Please enter the number of seconds: ");
        seconds = scanner.nextInt();
        int totalSecondsFromHours = hours * 3600;
        int totalSecondsFromMinutes = minutes * 60;
        int totalElapsedTime = totalSecondsFromHours + totalSecondsFromMinutes + seconds;
        System.out.println("The total elapsed time in seconds is: " + totalElapsedTime);

        scanner.close();
    }
}
