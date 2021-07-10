/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelanea2j24;

/**
 *
 * @author Carlos_Garcia
 */
public class Mueble {
    
    //atributos
    private String Color;
    private double Alto,Ancho, Largo;
    private String Material;
    
    //constructor
    public Mueble(String Color, double Alto, double Ancho, double Largo, String Material) {
        this.Color = Color;
        this.Alto = Alto;
        this.Ancho = Ancho;
        this.Largo = Largo;
        this.Material = Material;
    }
    
    private double volumen(){
        double volumen;
        
        volumen = this.Alto*this.Ancho*this.Largo;
        
        return volumen;
    }
    
    public void infoMueble(){
        System.out.println("\nInformación del mueble creado");
        System.out.println("Material " + this.Material);
        System.out.println("Color " +this.Color);
        System.out.println("Dimensiones del mueble");
        System.out.println("Alto " + this.Alto + " mts");
        System.out.println("Ancho " + this.Ancho + " mts");
        System.out.println("Largo " +this.Largo + " mts");
        System.out.println("Volumen del mueble " + this.volumen() + " m^3");
    }
}
