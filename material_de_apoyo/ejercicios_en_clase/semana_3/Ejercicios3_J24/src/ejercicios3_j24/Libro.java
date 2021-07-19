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
public class Libro extends Producto{
    
    private String Editorial;

    public Libro(int PLU, String Nombre, int precio, String Editorial) {
        super(PLU, Nombre, precio);
        this.Editorial = Editorial;
    }

    public String getEditorial() {
        return Editorial;
    }
    
    public String verLibro(){
        String datosLibro= super.verProducto()+
        "\nla editorial del libro es "+ getEditorial();
        return datosLibro;
    }
    
    
}
