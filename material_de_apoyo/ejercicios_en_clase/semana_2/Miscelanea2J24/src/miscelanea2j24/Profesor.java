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
public class Profesor {
    
    //ATRIBUTOS
    private int documento;
    private String nombres, apellidos;
    private int edad;
    private String profesion;
    
    //constructor

    public Profesor(int documento, String nombres, String apellidos, int edad, String profesion) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.profesion = profesion;
    }
    
    //metodo
    public void mostrarProfesor(){
        System.out.println("\n[Profesor]:");
        System.out.println("Documento: " + documento);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " +apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Profesión: " +profesion);
        
    }
    
}
