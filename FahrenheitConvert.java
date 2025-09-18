// File: FahrenheitConvert.java
// Author: Flor Guadalupe
// Date: 2025-01-30
// Class: COMP 2315 Structured Programming
// Description: Provides temperature conversion methods for Fahrenheit.

public class FahrenheitConvert {
    public static double toCelsius(double f) { return (f - 32) * 5/9; }
    public static double toKelvin(double f) { return (f - 32) * 5/9 + 273.15; }
    public static double toRankine(double f) { return f + 459.67; }
}
