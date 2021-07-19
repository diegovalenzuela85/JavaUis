package semana_3;

public class Producto {
  private int plu;
  private String nombre;
  private double precio;

  public Producto(int plu, String nombre, double precio) {
    this.plu = plu;
    this.nombre = nombre;
    this.precio = precio;
  }

  public int getPlu() {
    return plu;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void verProducto(){
    System.out.println("---------------------------------");
    System.out.println("PLU: "+ getPlu());
    System.out.println("Nombre: "+ getNombre());
    System.out.println("Precio: "+ getPrecio());
  }
}
