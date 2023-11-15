import java.util.Scanner;

public class Cuadrado extends Figura{
    public Cuadrado() {
    }

        void  ingresarPuntos(){
            Scanner sc= new Scanner(System.in);
            for (int i=1; i<3; i++){
                System.out.printf("Ingrese el componente x del punto:"+i);
                double x = sc.nextDouble();
                System.out.printf("Ingrese el componente y del punto:"+i);
                double y = sc.nextDouble();
                Punto punto = new Punto(x,y);
                this.ListaPuntos.add(punto);
            }
        }
        double calculoPerimetro(){
            Punto p1= this.ListaPuntos.get(0);
            Punto p2 = this.ListaPuntos.get(1);
            double l1= p1.calculoDistancia(p2);
            this.perimetro= l1*4;
            return this.perimetro;

        }

        double calcularArea(){
            Punto p1= this.ListaPuntos.get(0);
            Punto p2 = this.ListaPuntos.get(1);
            double l1= p1.calculoDistancia(p2);
            this.area= Math.pow(l1,2);
            return this.area;

        }
    }

