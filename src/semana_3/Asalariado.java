package semana_3;

public class Asalariado {
  private String nombre;
  private long dni;
  private int diasVacaciones;
  private double salarioBase;

  public Asalariado(String nombre, long dni, int diasVacaciones, double salarioBase) {
    this.nombre = nombre;
    this.dni = dni;
    this.diasVacaciones = diasVacaciones;
    this.salarioBase = salarioBase;
  }

  public String getNombre() {
    return nombre;
  }

  public long getDni() {
    return dni;
  }

  public int getDiasVacaciones() {
    return diasVacaciones;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public void verAsalariado(){
    System.out.println("------------------------------------");
    System.out.println("Nombre: "+getNombre());
    System.out.println("DNI: "+getDni());
    System.out.println("Dias Vacaciones: "+getDiasVacaciones());
    System.out.println("------------------------------------");
  }
}
