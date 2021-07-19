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
public class EmpleadoDistibucion extends Asalariado{
    
    private String zona;

    public EmpleadoDistibucion(String nombre, long dni, int diasVacaciones, double salario,String zona)
    {   super(nombre, dni, diasVacaciones, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }
    
    @Override
    public double getSalario(){
        return super.getSalario()*(1.10);
    }
    
    public void infoEmpleadoDist(){
        System.out.println("\n****************");
        System.out.println("Información del empleado de distribución " + super.verAsalariado() + " " + super.getSalario());
        System.out.println("Zona en donde labora " +getZona());
        System.out.println("Salario del empleado de distribución " + getSalario());
        System.out.println("******************");
    }
    
}
