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
public class Cd extends Producto{
    
    private String Genero;

    public Cd(int PLU, String Nombre, int precio,String Genero) {
        super(PLU, Nombre, precio);
        this.Genero = Genero;
    }

    public String getGenero() {
        return Genero;
    }
    
    public String infoCD(){
        String datosCD= super.verProducto()+
        "\n el género del CD es "+getGenero();
        return datosCD;
    }
    
}
