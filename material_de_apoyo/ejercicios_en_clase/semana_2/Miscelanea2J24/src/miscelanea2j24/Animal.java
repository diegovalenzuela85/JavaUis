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
public class Animal {
    
    //ATRIBUTOS o variables
    private String nombre;
    private int edad;
    private String especie;
    
    //CONSTRUCTOR

    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }
    //METODO O FUNCION PARA MOSTRAR LA INFORMACION POR CONSOLA
    
    public void datosAnimal(){
        System.out.println("-------------------");
        System.out.println("Datos del animal:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Especie: "+this.especie);
        System.out.println("-------------------");
        
    }
    
}
