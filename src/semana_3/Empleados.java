package semana_3;

public class Empleados {
  private int dni;
  private String nombre;
  private String posicion;
  private double salario;

  public Empleados(int dni, String nombre, String posicion, double salario) {
    this.dni = dni;
    this.nombre = nombre;
    this.posicion = posicion;
    this.salario = salario;
  }

  public int getDni() {
    return dni;
  }

  public String getNombre() {
    return nombre;
  }

  public String getPosicion() {
    return posicion;
  }

  public double getSalario() {
    return salario;
  }

  public void muestraEmpleado(){
    System.out.println("------------------------------");
    System.out.println("Nombre: "+getNombre());
    System.out.println("DNI: "+getDni());
    System.out.println("Posición: "+getPosicion());
    System.out.println("Salario: "+getSalario());
    System.out.println("-------------------------------");
  }

  public String muestraEmpleado2(){
    String infoEmpleado = "------------------------------" +
      "\nNombre: "+getNombre() +
      "\nDNI: "+getDni() +
      "\nPosición: "+getPosicion() +
      "\nSalario: "+getSalario() +
      "\n-------------------------------";
    return infoEmpleado;
  }
}
