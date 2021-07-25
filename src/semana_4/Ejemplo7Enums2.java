package semana_4;

public class Ejemplo7Enums2 {
  enum Continente {
    AFRICA(54),
    EUROPA(50),
    ASIA(49),
    AMERICA(35),
    OCEANIA(15);
    private int numeroDePaises;
    Continente(int numeroDePaises){
      this.numeroDePaises=numeroDePaises;
    }
    public int getNumeroDePaises(){
      return numeroDePaises;
    }
  }
  public static void main(String[] args) {
    Continente myVar = Continente.AFRICA;
    System.out.println(myVar.getNumeroDePaises());
  }

}
