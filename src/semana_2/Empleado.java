package semana_2;

public class Empleado {
  private String nombre;
  private String apellido;
  private int edad;
  private float antiguedad;
  private float sueldo;

  public Empleado(String nombre, String apellido, int edad, float antiguedad, float sueldo) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.antiguedad = antiguedad;
    this.sueldo = sueldo;
  }

  public void datosEmpleado() {
    System.out.println("El nombre del empleado es: " + this.nombre);
    System.out.println("El apellido del empleado es: " + this.apellido);
    System.out.println("La edad del empleado es: " + this.edad);
    System.out.println("La antiguedad del empleado es: " + this.antiguedad);
    System.out.println("El sueldo del empleado es: " + this.sueldo);
    if (this.sueldo > 3043218){
      System.out.println("----------------------------------------------------");
      System.out.println("Tu salario supera los tres SMLV: $ 3'043.218");
      System.out.println("DEBES PAGAR IMPUESTOS");
    }
  }
}
