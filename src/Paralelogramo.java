import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paralelogramo extends Rectangulo{

    /*List<Punto3d> ListaPuntos2= new ArrayList<>();*/


    void ingresarPuntos() {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            System.out.printf("Ingrese el componente x del punto: " + i);
            double x = sc.nextDouble();
            System.out.printf("Ingrese el componente y del punto: " + i);
            double y = sc.nextDouble();
            /*System.out.printf("Ingrese el componente z del punto: " + i);
            double z = sc.nextDouble();*/
            Punto punto = new Punto(x, y);
            ListaPuntos.add(punto);
        }
    }
    void calcularVolumen (){

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el componente z de los puntos inferiores");
        double h1= sc.nextDouble();
        System.out.println("Ingrese el componente z de los puntos superiores");
        double h2= sc.nextDouble();
        double h=h2-h1;
        double area = calcularArea();
        this.volumen=area*h;
    }

}


/*Punto3d p1= this.ListaPuntos2.get(0);
        Punto3d p2 = this.ListaPuntos2.get(1);
        Punto3d p3 = this.ListaPuntos2.get(2);
        double[] vectorAB = {(p2.getX()-p1.getX()), (p2.getY()-p1.getY()), p2.getZ()-p1.getZ()};
        double[] vectorAC = {(p3.getX()-p1.getX()), (p3.getY()-p1.getY()), (p3.getZ()-p1.getZ())};

       this.volumen = Math.abs(vectorAB[0] * (vectorAB[1] * vectorAC[2] - vectorAB[2] * vectorAC[1])
                - vectorAB[1] * (vectorAB[0] * vectorAC[2] - vectorAB[2] * vectorAC[0])
                + vectorAB[2] * (vectorAB[0] * vectorAC[1] - vectorAB[1] * vectorAC[0]));

       double[] c = new double[3];
        c[0] = vectorAB[1] * vectorAC[2] - vectorAB[2] * vectorAC[1];
        c[1] = vectorAB[2] * vectorAC[0] -  vectorAB[0] * vectorAC[2];
        c[2] =  vectorAB[0] * vectorAC[1] -  vectorAB[1] * vectorAC[0];

        /*Punto3d pAB= new Punto3d((p2.getX()-p1.getX()), (p2.getY()-p1.getY()), (p2.getZ()-p1.getZ()));
        Punto3d pAC= new Punto3d((p3.getX()-p1.getX()), (p3.getY()-p1.getY()), (p3.getZ()-p1.getZ()));
        ListaPuntos2.add(pAB);
        ListaPuntos2.add(pAC);*/
