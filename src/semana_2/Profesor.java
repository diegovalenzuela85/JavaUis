package semana_2;

public class Profesor {
  private int documento;
  private String nombres;
  private String apellidos;
  private int edad;
  private String profesion;

  public Profesor(int documento, String nombres, String apellidos, int edad, String profesion) {
    this.documento = documento;
    this.nombres = nombres;
    this.apellidos = apellidos;
    this.edad = edad;
    this.profesion = profesion;
  }

  public void mostrarProfesor(){
    System.out.println("[Profesor]:");
    System.out.println("Documento: " + this.documento);
    System.out.println("Nombre: " + this.nombres);
    System.out.println("Apellido: " + this.apellidos);
    System.out.println("Edad: " + this.edad);
    System.out.println("Profesión: " + this.profesion);
  }
}
