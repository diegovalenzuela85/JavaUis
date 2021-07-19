package semana_3;

import java.util.Scanner;

public class Socio {
  private String nombreSocio;
  private int antiguedad;

  public Socio(Scanner datosSocio) {
    System.out.println("Ingrese los datos del socio");
    System.out.print("Cual es el nombre del socio: ");
    this.nombreSocio = datosSocio.nextLine();
    System.out.print("Cual es la antiguedad del socio: ");
    this.antiguedad = datosSocio.nextInt();
    datosSocio.nextLine();
  }

  public String getNombreSocio() {
    return nombreSocio;
  }

  public int getAntiguedad() {
    return antiguedad;
  }

  public String infoSocio(){
    String dataSocio = "El socio "+getNombreSocio()+" es el socio mas antiguo con "+getAntiguedad()+" años";
    return dataSocio;
  }
}
