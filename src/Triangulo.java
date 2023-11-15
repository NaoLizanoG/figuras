import java.util.List;
import java.util.Scanner;

public class Triangulo extends Figura{

    public Triangulo() {
    }

    void  ingresarPuntos(){
        Scanner sc= new Scanner(System.in);
        for (int i=1; i<4; i++){
            System.out.printf("Ingrese el componente x del punto:"+i);
            double x = sc.nextDouble();
            System.out.printf("Ingrese el componente y del punto:"+i);
            double y = sc.nextDouble();
            Punto punto = new Punto(x,y);
            this.ListaPuntos.add(punto);
        }
    }
    void calculoPerimetro(){
        Punto p1= this.ListaPuntos.get(0);
        Punto p2 = this.ListaPuntos.get(1);
        Punto p3 = this.ListaPuntos.get(2);

        double l1= p1.calculoDistancia(p2);
        double l2= this.calculoDistancia(p3, p1);
        double l3= this.calculoDistancia(p2,p3);
        this.perimetro= l1+l2+l3;

    }

    double calcularArea(){
        Punto p1= this.ListaPuntos.get(0);
        Punto p2 = this.ListaPuntos.get(1);
        Punto p3 = this.ListaPuntos.get(2);

        double l1= p1.calculoDistancia(p2);
        double l2= this.calculoDistancia(p3, p1);
        double l3= this.calculoDistancia(p2,p3);
        double s=(l1+l2+l3)/2;
        this.area= Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));

        return area;
    }
}
