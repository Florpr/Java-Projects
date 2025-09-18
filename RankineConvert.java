// File: RankineConvert.java
// Author: Flor Guadalupe
// Date: 2025-01-30
// Class: COMP 2315 Structured Programming
// Description: Provides temperature conversion methods for Rankine.

public class RankineConvert {
    public static double toFahrenheit(double r) { return r - 459.67; }
    public static double toCelsius(double r) { return (r - 491.67) * 5/9; }
    public static double toKelvin(double r) { return r * 5/9; }
}
