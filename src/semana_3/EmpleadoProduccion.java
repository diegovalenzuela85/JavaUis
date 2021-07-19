package semana_3;

public class EmpleadoProduccion extends Asalariado{
  private String turno;

  public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, double salarioBase, String turno) {
    super(nombre, dni, diasVacaciones, salarioBase);
    this.turno = turno;
  }

  public String getTurno() {
    return turno;
  }

  @Override
  public double getSalarioBase() {
    return super.getSalarioBase() * 1.15;
  }

  public void verEmpleadoProduccion() {
    System.out.println("Empleado del area de Producción");
    super.verAsalariado();
    System.out.println("El salario base es: "+super.getSalarioBase());
    System.out.println("El turno asignado es: "+getTurno());
    System.out.println("El salario final es: "+getSalarioBase()+" con un incremente del 15%");
    System.out.println("------------------------------------");

  }
}
