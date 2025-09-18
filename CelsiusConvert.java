// File: CelsiusConvert.java
// Author: Flor Guadalupe
// Date: 2025-01-30
// Class: COMP 2315 Structured Programming
// Description: Provides temperature conversion methods for Celsius.

public class CelsiusConvert {
    public static double toFahrenheit(double c) { return (c * 9/5) + 32; }
    public static double toKelvin(double c) { return c + 273.15; }
    public static double toRankine(double c) { return (c + 273.15) * 9/5; }
}
