package semana_4;

public class Persona {
  private int idPersona;
  private String nombre;
  private float altura;

  public Persona(int idPersona, String nombre, float altura) {
    this.idPersona = idPersona;
    this.nombre = nombre;
    this.altura = altura;
  }

  public int getIdPersona() {
    return idPersona;
  }

  public void setIdPersona(int idPersona) {
    this.idPersona = idPersona;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  @Override
  public String toString() {
    return "Persona{" +
      "idPersona=" + idPersona +
      ", nombre='" + nombre + '\'' +
      ", altura=" + altura +
      '}';
  }
}
