// File: KelvinConvert.java
// Author: Flor Guadalupe
// Date: 2025-01-30
// Class: COMP 2315 Structured Programming
// Description: Provides temperature conversion methods for Kelvin.

public class KelvinConvert {
    public static double toFahrenheit(double k) { return (k - 273.15) * 9/5 + 32; }
    public static double toCelsius(double k) { return k - 273.15; }
    public static double toRankine(double k) { return k * 9/5; }
}
