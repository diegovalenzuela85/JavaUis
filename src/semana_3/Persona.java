package semana_3;

public class Persona {
  protected String nombre;
  protected int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void imprimirInfo(){
    System.out.println("El nombre ingresado es "+getNombre()+" "+"y la edad es "+getEdad());
  }

  public String infoPersona(){
    String info = "La persona ingresada es "+getNombre()+" "+"y la edad es "+getEdad();
    return info;
  }
}
