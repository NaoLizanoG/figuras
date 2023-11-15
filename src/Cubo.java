public class Cubo extends Cuadrado{
    public Cubo() {
    }

    @Override
    void ingresarPuntos() {
        super.ingresarPuntos();
    }

    void calcularVolumen (){
        Punto p1= this.ListaPuntos.get(0);
        Punto p2 = this.ListaPuntos.get(1);
        double l1= p1.calculoDistancia(p2);
        this.volumen= Math.pow(l1,3);
    }
}
