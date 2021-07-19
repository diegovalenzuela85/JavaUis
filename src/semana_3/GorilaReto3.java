package semana_3;

public class GorilaReto3 extends AnimalReto3{
    public GorilaReto3(double peso, double altura) {
        super(peso, altura);
//        this.peso = peso;
//        this.altura = altura;
    }

    public double getPesoAlims(){
        int tamano = this.alimsIngeridos.length;
        int suma = 0;
        for (int i = 0; i < tamano; i++){
            suma += this.alimsIngeridos[i].getGramos();
        }
        return suma;
    }

    @Override
    public double getIMC() {
        double pesoFinal = this.peso + (this.getPesoAlims() / 1000);
        return pesoFinal / (this.altura * this.altura);
    }
}
