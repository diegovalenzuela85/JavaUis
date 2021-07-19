package semana_3;

public class Empleado {
  private String nombre;
  private String apellido;

  public Empleado(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  //Metodo que me trae los atributos de la clase Empleado
  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }
}
