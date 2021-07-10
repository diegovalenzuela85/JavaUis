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
public class Empleado {
      //atributos
    private String nombre, apellido;
    private int edad, antiguedad;
    private double sueldo;
    
    //constructor

    public Empleado(String nombre, String apellido, int edad, int antiguedad, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }
    private String impuesto(){
        double salario;
        String mensaje;
        salario = this.sueldo;
        
        if (salario > 3043218){
            mensaje = "SI";
        } else {
            mensaje = "NO";
        }
        return mensaje;
    }
    
    public void datosEmpleado(){
        System.out.println("\n[Empleado:]");
        System.out.println("Nombre "+this.nombre);
        System.out.println("Apellido " +this.apellido);
        System.out.println("Edad " +this.edad);
        System.out.println("Antigüedad " +this.antiguedad);
        System.out.println("Sueldo " +this.sueldo);
        System.out.println("¿Debe pagar impuestos? " +this.impuesto());
                
    }
    
}
