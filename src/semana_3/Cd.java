package semana_3;

public class Cd extends Producto{
  private String genero;

  public Cd(int plu, String nombre, double precio, String genero) {
    super(plu, nombre, precio);
    this.genero = genero;
  }

  public String getGenero() {
    return genero;
  }

  @Override
  public void verProducto() {
    super.verProducto();
    System.out.println("Genero:" + getGenero());
    System.out.println("---------------------------------");
  }
}
