// File: TemperatureConvertions.java
// Author: Flor Guadalupe
// Date: 2025-01-30
// Class: COMP 2315 Structured Programming
// Description: This program performs various temperature conversions using modular programming with separate classes.

import java.util.Scanner;

public class TemperatureConvertions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWhich of the following would you like to convert?");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Fahrenheit to Kelvin");
            System.out.println("3. Fahrenheit to Rankine");
            System.out.println("4. Celsius to Fahrenheit");
            System.out.println("5. Celsius to Kelvin");
            System.out.println("6. Celsius to Rankine");
            System.out.println("7. Kelvin to Fahrenheit");
            System.out.println("8. Kelvin to Celsius");
            System.out.println("9. Kelvin to Rankine");
            System.out.println("10. Rankine to Fahrenheit");
            System.out.println("11. Rankine to Celsius");
            System.out.println("12. Rankine to Kelvin");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            if (choice == 13) break;

            System.out.print("Enter value of temperature you would like to convert: ");
            double temp = scanner.nextDouble();
            double result = 0;

            switch (choice) {
                case 1 -> result = FahrenheitConvert.toCelsius(temp);
                case 2 -> result = FahrenheitConvert.toKelvin(temp);
                case 3 -> result = FahrenheitConvert.toRankine(temp);
                case 4 -> result = CelsiusConvert.toFahrenheit(temp);
                case 5 -> result = CelsiusConvert.toKelvin(temp);
                case 6 -> result = CelsiusConvert.toRankine(temp);
                case 7 -> result = KelvinConvert.toFahrenheit(temp);
                case 8 -> result = KelvinConvert.toCelsius(temp);
                case 9 -> result = KelvinConvert.toRankine(temp);
                case 10 -> result = RankineConvert.toFahrenheit(temp);
                case 11 -> result = RankineConvert.toCelsius(temp);
                case 12 -> result = RankineConvert.toKelvin(temp);
                default -> System.out.println("Incorrect option. Please try again.");
            }

            if (choice >= 1 && choice <= 12)
                System.out.println("Converted Temperature: " + result);
        }

        scanner.close();
        System.out.println("End of program.");
    }
}
