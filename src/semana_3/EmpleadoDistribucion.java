package semana_3;

public class EmpleadoDistribucion extends Asalariado{
  private String zona;

  public EmpleadoDistribucion(String nombre, long dni, int diasVacaciones, double salarioBase, String zona) {
    super(nombre, dni, diasVacaciones, salarioBase);
    this.zona = zona;
  }

  public String getZona() {
    return zona;
  }

  @Override
  public double getSalarioBase() {
    return super.getSalarioBase() * 1.10;
  }

  public void verEmpleadoDistribucion() {
    System.out.println("Empleado del area de Distribución");
    super.verAsalariado();
    System.out.println("El salario base es: "+super.getSalarioBase());
    System.out.println("La zona donde trabaja es: "+getZona());
    System.out.println("El salario final es: "+getSalarioBase()+" con un incremente del 10%");
    System.out.println("------------------------------------");
  }
}
