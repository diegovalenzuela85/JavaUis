package semana_2;

public class Mueble {
  private String color;
  private float alto;
  private float ancho;
  private float largo;
  private String material;

  public Mueble(String color, float alto, float ancho, float largo, String material) {
    this.color = color;
    this.alto = alto;
    this.ancho = ancho;
    this.largo = largo;
    this.material = material;
  }

  private float volumenMueble(){
    float volum = 0f;
    volum = this.alto * this.ancho * this.largo;

    return volum;
  }

  public void infoMueble(){
    System.out.println("El color del mueble es: " + this.color);
    System.out.println("El alto del mueble es: " + this.alto);
    System.out.println("El ancho del mueble es: " + this.ancho);
    System.out.println("El largo del mueble es: " + this.largo);
    System.out.println("El material del mueble es: " + this.material);
    System.out.println("El VOLUMEN del mueble es: " + volumenMueble());
  }
}
