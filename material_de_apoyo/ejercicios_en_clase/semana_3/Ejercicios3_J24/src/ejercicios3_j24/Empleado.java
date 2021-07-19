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
public class Empleado extends Persona{

    
    private double sueldoEmpleado;

    public Empleado(String nombre, int edad, double sueldoEmpleado) {
        super(nombre, edad);
        this.sueldoEmpleado = sueldoEmpleado;
    }
    
    
    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }
    
    public String infoEmpleado(){
        String datosEmpleado= super.verPersona() + 
                " y su sueldo es de $" +getSueldoEmpleado();
        return datosEmpleado;
    }
    
    
}
