package semana_2;

public class Animal {
  private String nombre;
  private int edad;
  private String especie;

  public Animal(String nombre, int edad, String especie) {
    this.nombre = nombre;
    this.edad = edad;
    this.especie = especie;
  }

  public void datosAnimal(){
    System.out.println("El nombre del animal es: " + this.nombre);
    System.out.println("La edad del animal es: " + this.edad);
    System.out.println("La especie del animal es: " + this.especie);
  }
}
