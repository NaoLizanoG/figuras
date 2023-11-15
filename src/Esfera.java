public class Esfera extends Circulo{

    @Override
    void ingresarPuntos() {
        super.ingresarPuntos();
    }

    void calcularVolumen (){
        Punto p1= this.ListaPuntos.get(0);
        Punto p2 = this.ListaPuntos.get(1);

        double r = p1.calculoDistancia(p2);
        this.volumen= ((double) 4 /3)*Math.PI*Math.pow(r,3);
    }
}
