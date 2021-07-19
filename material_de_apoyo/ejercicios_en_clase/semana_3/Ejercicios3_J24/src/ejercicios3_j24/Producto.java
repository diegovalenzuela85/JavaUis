/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3_j24;

/**
 *
 * @author Carlos_Garcia
 */
public class Producto {
    
    private int PLU;
    private String Nombre;
    private int precio;

    public Producto(int PLU, String Nombre, int precio) {
        this.PLU = PLU;
        this.Nombre = Nombre;
        this.precio = precio;
    }

    public int getPLU() {
        return PLU;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPrecio() {
        return precio;
    }
    
    public String verProducto(){
        System.out.println("Producto creado");
        String infoproducto="Nombre del producto "+getNombre()+ 
        "\nPLU del producto "+getPLU() + "\nel precio $" +getPrecio();
        return infoproducto;
    }
    
}
