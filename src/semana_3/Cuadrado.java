package semana_3;

public class Cuadrado extends Figura{
  private float lado;

  public Cuadrado(String tipo, float lado) {
    super(tipo);
    this.lado = lado;
  }

  public float getLado() {
    return lado;
  }

  @Override
  public double area() {
    double area = getLado() * getLado();
    return area;
  }
}
