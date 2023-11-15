import java.util.Scanner;

public class Prisma extends Triangulo {

    @Override
    void ingresarPuntos() {
        System.out.println("Ingrese los puntos de la base del prisma");
        super.ingresarPuntos();
    }


    void calcularVolumen(){
        double area = calcularArea();
        Punto p1= this.ListaPuntos.get(0);
        Punto p2 = this.ListaPuntos.get(1);
        Punto p3 = this.ListaPuntos.get(2);
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el componente z de los puntos inferiores");
        double h1 = sc.nextDouble();
        System.out.println("Ingrese el componente z de los puntos superiores");
        double h2 = sc.nextDouble();
        double h=h2-h1;
        this.volumen = area*h;
    }

}
