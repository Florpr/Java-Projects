// File: Recibos.java
// Author: Flor Guadalupe Y Evan Mendez
// Date: 2025-02-20
// Class: COMP 2315 Structured Programming
// Description: Este programa genera un recibo de compra que muestra productos de supermercado, sus precios, cantidades, subtotal y total.
public class Recibos {
    public static void main(String[] args) {
        String title = "Recibo de Compra";
        String lines = "-".repeat(40);
        int mid = (lines.length()) + title.length() / 2;

        // Encabezado
        System.out.println(lines);
        System.out.printf("%" + mid + "S", title);
        System.out.println("\nSUPERMERCADO ECONO");
        System.out.println(lines);
        System.out.printf("%-20s %10s%n", "Producto", "Precio");

        // Productos y precios
        String[] productos = {"Leche", "Pan", "Arroz", "Huevos", "Manzanas"};
        double[] precios = {3.50, 2.00, 5.75, 4.25, 1.99};
        double subtotal = 0;

        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%-20s $%9.2f%n", productos[i], precios[i]);
            subtotal += precios[i];
        }

        // Subtotal y Total
        System.out.println(lines);
        System.out.printf("%-20s $%9.2f%n", "SUBTOTAL:", subtotal);
        System.out.printf("%-20s $%9.2f%n", "TOTAL:", subtotal); // Sin impuestos aplicados
    }
}

