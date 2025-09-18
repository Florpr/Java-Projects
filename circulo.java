public class circulo {
    // Método para calcular el área del círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    // Método para calcular el área del rectángulo
    public static double calcularAreaRectangulo(double largo, double ancho) {
        return largo * ancho;
    }
    // Método principal
    public static void main(String[] args) {
        double areaCirculo = calcularAreaCirculo(5.0);
        double areaRectangulo = calcularAreaRectangulo(4.0, 6.0);
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Área del rectángulo: " + areaRectangulo);
    }

}