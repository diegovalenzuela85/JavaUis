package semana_3;

import java.util.Scanner;

public class Club {
  private String nombreClub;
  private Socio socio1;
  private Socio socio2;
  private Socio socio3;
  private Scanner infoClub;

  public Club(String nombreClub) {
    this.nombreClub = nombreClub;
    this.infoClub = new Scanner(System.in);

    this.socio1 = new Socio(infoClub);
    this.socio2 = new Socio(infoClub);
    this.socio3 = new Socio(infoClub);
  }

  public String getNombreClub() {
    return nombreClub;
  }

  public Scanner getInfoClub() {
    return infoClub;
  }

  public void mayorAntiguedad(){
    System.out.println("El socio de mayor antiguedad");
    if (socio1.getAntiguedad() > socio2.getAntiguedad() && socio1.getAntiguedad() > socio3.getAntiguedad()){
      System.out.println(socio1.infoSocio());
    } else if (socio2.getAntiguedad() > socio3.getAntiguedad()){
      System.out.println(socio2.infoSocio());
    } else {
      System.out.println(socio3.infoSocio());
    }
  }
}
