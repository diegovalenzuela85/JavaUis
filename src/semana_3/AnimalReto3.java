package semana_3;

public class AnimalReto3 {
    protected double peso;
    protected double altura;
    protected AlimentoReto3 alimsIngeridos[];

    public AnimalReto3(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public AlimentoReto3[] getAlimsIngeridos() {
        return alimsIngeridos;
    }

    public void setAlimsIngeridos(AlimentoReto3 alimsIngeridos[]) {
        this.alimsIngeridos = alimsIngeridos;
    }

    public double getIMC(){
        return this.peso / (this.altura * this.altura);
    }
}
