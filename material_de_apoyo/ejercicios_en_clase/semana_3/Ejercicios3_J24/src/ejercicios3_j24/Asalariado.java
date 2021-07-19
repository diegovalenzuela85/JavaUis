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
public class Asalariado {
    
    private String nombre;
    private long dni;
    private int diasVacaciones;
    private double salario;

    public Asalariado(String nombre, long dni, int diasVacaciones, double salarioBase) {
        this.nombre = nombre;
        this.dni = dni;
        this.diasVacaciones = diasVacaciones;
        this.salario = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public long getDni() {
        return dni;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public double getSalario() {
        return salario;
    }
    
    public String verAsalariado(){
        String info = getNombre() + "\nidentificación " + getDni() ;
        return info;
    }
    
}
