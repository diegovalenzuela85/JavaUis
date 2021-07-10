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
public class Automovil {
    //atributos de la clase
    
    private String placa, color;
    private int anio;
    private String marca;
    private int capacidadPasajeros, cilindraje, velocidadActual;
    
    // constructor

    public Automovil(String placa, String color, int anio, String marca, int capacidadPasajeros, int cilindraje, int velocidadActual) {
        this.placa = placa;
        this.color = color;
        this.anio = anio;
        this.marca = marca;
        this.capacidadPasajeros = capacidadPasajeros;
        this.cilindraje = cilindraje;
        this.velocidadActual = velocidadActual;
    }
    
    int velocidad(){
        int nuevaVelocidad = this.velocidadActual;
        
        if (this.velocidadActual >=90){
            nuevaVelocidad = nuevaVelocidad-20;
            System.out.println("El auto excede el limite de velocidad");
        } else {
            nuevaVelocidad = this.velocidadActual;
            System.out.println("El auto NO excede los limites de velocidad");
        }
        
        return nuevaVelocidad;
    }
    
    public void datosAuto(){
        System.out.println("\n");//salto de linea
        System.out.println("Placa del auto " + placa);
        System.out.println("Color del auto " + color);
        System.out.println("Año del auto " + anio);
        System.out.println("Marca del auto "+ marca);
        System.out.println("Capacidad de pasajeros " + capacidadPasajeros);
        System.out.println("Cilindraje del auto " + cilindraje);
        System.out.println("Velocidad actual " + velocidadActual);
        System.out.println("Nueva velocidad " + this.velocidad());
        
    }
    
    
}
