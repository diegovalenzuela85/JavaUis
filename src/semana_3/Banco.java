package semana_3;

public class Banco {
  private String nombre;
  private Empleado arreglo_empleados[];

  public Banco(String nombre, Empleado[] arreglo_empleados) {
    this.nombre = nombre;
    this.arreglo_empleados = arreglo_empleados;
  }

  public void agregarEmpleado(Empleado nuevoEmpleado, int indice){
    this.arreglo_empleados[indice] = nuevoEmpleado;
    System.out.println("¡Nuevo empleado!");
  }
}
