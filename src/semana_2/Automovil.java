package semana_2;

public class Automovil {
  private String placa;
  private String color;
  private int ano;
  private String marca;
  private int capacidad_pasajeros;
  private float cilindraje;
  private int velocidad_actual;

  public Automovil(String placa, String color, int ano, String marca, int capacidad_pasajeros, float cilindraje, int velocidad_actual) {
    this.placa = placa;
    this.color = color;
    this.ano = ano;
    this.marca = marca;
    this.capacidad_pasajeros = capacidad_pasajeros;
    this.cilindraje = cilindraje;
    this.velocidad_actual = velocidad_actual;
  }

  private int nuevaVelocidad(){
    int newVelocidad = 0;
    if (this.velocidad_actual >= 90) {
      System.out.println("VEHICULO EN EXCESO DE VELOCIDAD");
      newVelocidad = this.velocidad_actual - 20;
      System.out.println("Su nueva velocidad es de: " + newVelocidad);
    } else {
      newVelocidad = this.velocidad_actual;
      System.out.println("La velocidad actual del vehiculo es: " + this.velocidad_actual + " km/h");
    }
    return newVelocidad;
  }

  public void datosAuto(){
    System.out.println("La placa del vehiculo es: " + this.placa);
    System.out.println("El color del vehiculo es: " + this.color);
    System.out.println("El modelo del vehiculo es: " + this.ano);
    System.out.println("La marca del vehiculo es: " + this.marca);
    System.out.println("La capacidad de pasajeros del vehiculo es: " + this.capacidad_pasajeros);
    System.out.println("El cilindraje del vehiculo es: " + this.cilindraje);
    System.out.println("La velocidad actual del vehiculo es: " + nuevaVelocidad());

//    if (this.velocidad_actual == 90){
//      this.velocidad_actual -= 20;
//      System.out.println("VEHICULO EN EXCESO DE VELOCIDAD");
//      System.out.println("Debes bajar la velocidad del vehiculo a: " + this.velocidad_actual + " km/h");
//    } else {
//      System.out.println("La velocidad actual del vehiculo es: " + this.velocidad_actual + " km/h");
//    }

  }
}
