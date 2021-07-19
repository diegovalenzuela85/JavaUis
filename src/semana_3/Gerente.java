package semana_3;

public class Gerente extends Empleados{
  private int bono;
  private String auto;

  public Gerente(int dni, String nombre, String posicion, double salario, int bono, String auto) {
    super(dni, nombre, posicion, salario);
    this.bono = bono;
    this.auto = auto;
  }

  public int getBono() {
    return bono;
  }

  public String getAuto() {
    return auto;
  }

  public void muestraGerente(){
    super.muestraEmpleado();
    System.out.println("------------------------------");
    System.out.println("Bono: "+getBono());
    System.out.println("Salario final: "+ (super.getSalario() + getBono()));
    System.out.println("Auto: "+getAuto());
    System.out.println("-------------------------------");
  }

  public String muestraGerente2(){
    String infoGerente = super.muestraEmpleado2() +
      "\n------------------------------" +
      "\nBono: "+getBono() +
      "\nSalario final: " + (super.getSalario() + getBono()) +
      "\nAuto: "+getAuto() +
      "\n-------------------------------";
    return infoGerente;
  }
}
