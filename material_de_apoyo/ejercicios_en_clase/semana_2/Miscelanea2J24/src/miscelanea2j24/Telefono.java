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
public class Telefono {
    
    private String Marca,Modelo;
    private int precio,capacidad,TamPantalla, peso;
    private double descuento;

    public Telefono(String Marca, String Modelo, int precio, int capacidad, int TamPantalla, int peso) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.precio = precio;
        this.capacidad = capacidad;
        this.TamPantalla = TamPantalla;
        this.peso = peso;
        this.descuento = this.descuento();
    }
    
    private double descuento(){
        double precioMovil, dcto, nuevoPrecio;
        
        precioMovil = this.precio;
        if (precioMovil <750000){
            dcto = precioMovil*0.02;
            nuevoPrecio = precioMovil-dcto;
            System.out.println("Precio con descuento $ "+nuevoPrecio);
        } else {
            dcto = 0;
        }
        return dcto;
    }
    
    public void infoTelefono(){
        System.out.println("\nInformación del teléfono");
        System.out.println("Marca " + this.Marca);
        System.out.println("Modelo " + this.Modelo);
        System.out.println("Precio $ " + this.precio);
        System.out.println("Capacidad " + this.capacidad + " GB");
        System.out.println("Tamaño de pantalla " + this.TamPantalla);
        System.out.println("Peso del teléfono " + this.peso);
        System.out.println("Descuento " + this.descuento());
    }
}
