package semana_3;

public class PerroHerencia extends AnimalHerencia{
  protected boolean esAlpha;

  public PerroHerencia(int nDientes, boolean pelaje, int nPatas, boolean esAlpha) {
    // Atributos heredados
    this.nDientes = nDientes;
    this.pelaje = pelaje;
    this.nPatas = nPatas;
    // Atributo particular
    this.esAlpha = esAlpha;
  }

  // Se heredan todos los métodos que no sean privados
  // El siguiente es un método particular, solo presente en la clase Perro


  public boolean isEsAlpha() {
    return this.esAlpha;
  }
}
