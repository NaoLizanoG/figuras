// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.ingresarPuntos();
        double areaC1 = c1.calcularArea();
        double perimC1= c1.calculoPerimetro();
        c1.imprimirPerimetro("cìrculo 1");
        c1.imprimirArea("cìrculo 1");

        Triangulo t1 = new Triangulo();
        t1.ingresarPuntos();
        t1.calculoPerimetro();
        t1.calcularArea();
        t1.imprimirPerimetro("Triàngulo");
        t1.imprimirArea("Triàngulo");


    }
}