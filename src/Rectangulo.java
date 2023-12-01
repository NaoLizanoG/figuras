import java.util.Scanner;

public class Rectangulo extends Figura{
    public Rectangulo() {
    }

    void  ingresarPuntos(){
        Scanner sc= new Scanner(System.in);
        for (int i=0; i<4; i++){
            System.out.printf("Ingrese el componente x del punto:"+i+1);
            double x = sc.nextDouble();
            System.out.printf("Ingrese el componente y del punto:"+i+1);
            double y = sc.nextDouble();
            Punto punto = new Punto(x,y);
            this.ListaPuntos.add(punto);
        }
    }
  @Override
    public double calculoPerimetro(){
        Punto p1= this.ListaPuntos.get(0);
        Punto p2 = this.ListaPuntos.get(1);
        Punto p3 = this.ListaPuntos.get(2);
        Punto p4 = this.ListaPuntos.get(3);
        double l1= p1.calculoDistancia(p2);
        double l2= this.calculoDistancia(p3, p1);
        this.perimetro= l1*2+l2*2;
        return this.perimetro;

    }

    @Override
    public double calcularArea(){
        Punto p1= this.ListaPuntos.get(0);
        Punto p2 = this.ListaPuntos.get(1);
        Punto p3 = this.ListaPuntos.get(2);
        /*Punto p4 = this.ListaPuntos.get(3);*/
        double l1= p1.calculoDistancia(p2);
        double l2= this.calculoDistancia(p3, p1);
        this.area= l1*l2;
        return this.area;

    }
}
