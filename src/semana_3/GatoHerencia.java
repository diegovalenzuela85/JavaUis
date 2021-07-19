package semana_3;

public class GatoHerencia extends AnimalHerencia{
  protected int volRonroneo;

  public GatoHerencia(int nDientes, boolean pelaje, int nPatas, int volRonroneo) {
    // Atributos heredados
    this.nDientes = nDientes;
    this.pelaje = pelaje;
    this.nPatas = nPatas;
    // Atributo particular
    this.volRonroneo = volRonroneo;
  }

  // Todos los metodos que no sean privados se heredan

  // El siguiente metodo es particular, solo se presenta en la clase Gato

  public int getVolRonroneo() {
    return this.volRonroneo;
  }
}
