package semana_3;

public class EmpleadoEjer1 extends Persona {
  protected double sueldo;

  public EmpleadoEjer1(String nombre, int edad, double sueldo) {
    super(nombre, edad);
    this.sueldo = sueldo;
  }

  public double getSueldo() {
    return sueldo;
  }

  public void imprimirSueldo(){
    System.out.println("El sueldo es: "+getSueldo());
  }

  public String obtenerSueldo(){
    String sueldo = "El sueldo dado para la persona es de "+getSueldo();
    return sueldo;
  }

  public String dataPersona(){
    String datosPersona = super.infoPersona()+" y su sueldo es "+getSueldo();
    return datosPersona;
  }
}
