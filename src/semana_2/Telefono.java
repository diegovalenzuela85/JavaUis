package semana_2;

public class Telefono {
  private String marca;
  private String modelo;
  private double precio;
  private int capacidad;
  private float tamanoPantalla;
  private float peso;

  public Telefono(String marca, String modelo, double precio, int capacidad, float tamanoPantalla, float peso) {
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
    this.capacidad = capacidad;
    this.tamanoPantalla = tamanoPantalla;
    this.peso = peso;
  }

  private double precioFinalTelefono() {
    double precioDecuento = 0;
    if (this.precio < 750000){
      precioDecuento = this.precio * 0.02;
    } else {
      precioDecuento = this.precio;
    }
    return precioDecuento;
  }

  public void infoTelefono() {
    System.out.println("La marca del telefono es: " + this.marca);
    System.out.println("El modelo del telefono es: " + this.modelo);
    System.out.println("El precio del telefono es: " + precioFinalTelefono());
    System.out.println("La capacidad de memoria del telefono es: " + this.capacidad);
    System.out.println("El tamaño de la pantalla del telefono es: " + this.tamanoPantalla);
    System.out.println("El peso del telefono es: " + this.peso);
  }
}
