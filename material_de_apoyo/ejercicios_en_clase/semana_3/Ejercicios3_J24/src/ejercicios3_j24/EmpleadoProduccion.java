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
public class EmpleadoProduccion extends Asalariado{
    
    private String turno;

    public EmpleadoProduccion(String nombre, long dni, int diasVacaciones, double salario,String turno) {
        super(nombre, dni, diasVacaciones, salario);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }
    
    @Override
    public double getSalario(){
        return super.getSalario()*(1+0.15);
    }
    
    public void infoEmpleadoProd(){
        System.out.println("\n--------------");
        System.out.println("Datos del empleado producción "+ super.verAsalariado()+ "  " + super.getSalario());
        System.out.println("salario del empleado de producción es $" + getSalario());
        System.out.println("----------------");
        
    }
}
