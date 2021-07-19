package semana_3;

public class Automovil {
  private String modelo;
  private Rueda ruedas[];
  private int radioRuedas;
  private int anchoRuedas;
  private double cilindraje;

  public Automovil(String modelo, int nRuedas, int radioRuedas, int anchoRuedas, double cilindraje) {
    this.modelo = modelo;
    this.radioRuedas = radioRuedas;
    this.anchoRuedas = anchoRuedas;
    this.cilindraje = cilindraje;
    this.ruedas = new Rueda[nRuedas];
    for (int i = 0; i < nRuedas; i++){
      this.ruedas[i] = new Rueda(this.radioRuedas, this.anchoRuedas);
    }
  }

  public int getNumeroRuedas(){
    return this.ruedas.length;
  }
}
