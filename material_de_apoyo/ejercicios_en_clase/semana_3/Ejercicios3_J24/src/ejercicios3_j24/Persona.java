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
public class Persona {
    
    //atributos
    private String nombre;
    private int edad;
    
    //constructor

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public String verPersona(){
        String info= "La persona " + getNombre() + 
        " tiene de edad " + getEdad() + " años";
        return info;
    }
    
}
