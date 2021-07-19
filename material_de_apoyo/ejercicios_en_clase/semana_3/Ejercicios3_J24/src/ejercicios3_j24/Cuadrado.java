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
public class Cuadrado extends Figura{
    
    private double lado;

    public Cuadrado(double lado, String tipo) {
        super(tipo);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double area() {
        return getLado()*getLado(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void areaCuadrado(){
        System.out.println("\n"+super.getTipo());
        System.out.println("El área del cuadrado es "+area());
    }
    
}
