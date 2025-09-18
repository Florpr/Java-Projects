import java.util.Scanner;

public class Conversiones {
    public static double pulgadasAPies(double pulgadas) { return pulgadas / 12; }
    public static double piesAYardas(double pies) { return pies / 3; }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de pulgadas: ");
        double pulgadas = scanner.nextDouble();
        double pies = pulgadasAPies(pulgadas);
        double yardas = piesAYardas(pies);
        System.out.println("Pies: " + pies + "\nYardas: " + yardas);
        scanner.close();
    }
}
