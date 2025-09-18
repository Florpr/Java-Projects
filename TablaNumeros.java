// File: TablaNumeros.java
// Author: Flor Guadalupe Y Evan Mendez
// Date: 2025-02-20
// Class: COMP 2315 Structured Programming
// Description: Este programa imprime una tabla con los números del 1 al 10, mostrando su cuadrado y su raíz cuadrada
public class TablaNumeros {
    public static void main(String[] args) {
        String title = "Tabla de Números, Cuadrados y Raíces";
        String lines = "-".repeat(45);

        // Encabezado
        System.out.println(lines);
        System.out.printf("%" + (lines.length() / 2 + title.length() / 2) + "s%n", title);
        System.out.println(lines);
        System.out.printf("%-10s %-10s %-15s%n", "Número", "Cuadrado", "Raíz Cuadrada");
        System.out.println(lines);

        // Generar tabla del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-10d %-10d %-15.4f%n", i, i * i, Math.sqrt(i));
        }

        System.out.println(lines);
    }
}
