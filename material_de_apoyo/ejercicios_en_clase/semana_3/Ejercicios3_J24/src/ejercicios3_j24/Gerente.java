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
public class Gerente extends Empleados{
    
    private int bono;
    private String auto;

    public Gerente(int DNI, String Nombre, String posicion, int Salario,int bono, String auto) {
        super(DNI, Nombre, posicion, Salario);
        this.bono = bono;
        this.auto = auto;
    }

    public int getBono() {
        return bono;
    }

    public String getAuto() {
        return auto;
    }
    
    @Override
    public int getSalario(){
        return super.getSalario()+getBono();
    }
    
    public String datosGerente(){
        int sueldoTotal = getBono() + super.getSalario();
        String infoGerente = super.muestraEmpleado()+ " bono es de $ "
        + getBono() + " el sueldo total del gerente es $ "+getSalario();
        return infoGerente;
    }
    
    
    
}
