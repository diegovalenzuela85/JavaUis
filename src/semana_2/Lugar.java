package semana_2;

public class Lugar {
  private String nombre;
  private String direccion;
  private int telefono;
  private String url;
  private String comentario;
  private double valoracion;

  public Lugar(String nombre, String direccion, int telefono, String url, String comentario, double valoracion) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.url = url;
    this.comentario = comentario;
    this.valoracion = valoracion;
  }

  public void verLugar(){
    System.out.println("El nombre del lugar es: " + this.nombre);
    System.out.println("La dirección del lugar es: " + this.direccion);
    System.out.println("El telefono del lugar es: " + this.telefono);
    System.out.println("La URL del lugar es: " + this.url);
    System.out.println("El comentario del lugar es: " + this.comentario);
    System.out.println("La valoración del lugar es: " + this.valoracion);
  }
}
