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
public class Empleados {
    
    private int DNI;
    private String Nombre, posicion;
    private int Salario;

    public Empleados(int DNI, String Nombre, String posicion, int Salario) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.posicion = posicion;
        this.Salario = Salario;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getSalario() {
        return Salario;
    }
    
    public String muestraEmpleado(){
        String infoEmpleado= "Empleado " + getNombre() +
        " su posición es " + getPosicion() + " su salario es $ "
        + getSalario();
        return infoEmpleado;
    }
    
    
}
