package semana_4;

public class Ejemplo6Enums {
  enum Continente {
    AFRICA,
    EUROPA,
    ASIA,
    AMERICA,
    OCEANIA
  }

  public static void main(String[] args) {
    Continente myVar = Continente.AFRICA;
    System.out.println(myVar);
  }
}
