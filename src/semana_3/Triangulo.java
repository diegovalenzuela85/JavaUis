package semana_3;

public class Triangulo extends Figura{
  private float base;
  private float altura;

  public Triangulo(String tipo, float base, float altura) {
    super(tipo);
    this.base = base;
    this.altura = altura;
  }

  public float getBase() {
    return base;
  }

  public float getAltura() {
    return altura;
  }

  @Override
  public double area() {
    double area = (getBase() * getAltura()) / 2;
    return area;
  }
}
