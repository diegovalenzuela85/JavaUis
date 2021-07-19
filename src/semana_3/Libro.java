package semana_3;

public class Libro extends Producto{
  private String editorial;

  public Libro(int plu, String nombre, double precio, String editorial) {
    super(plu, nombre, precio);
    this.editorial = editorial;
  }

  public String getEditorial() {
    return editorial;
  }

  @Override
  public void verProducto() {
    super.verProducto();
    System.out.println("Editorial:" + getEditorial());
    System.out.println("---------------------------------");
  }
}
